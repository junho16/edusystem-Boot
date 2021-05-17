package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.dto.UserDto;
import com.edusystem.entity.*;
import com.edusystem.entity.Class;
import com.edusystem.enums.TipKind;
import com.edusystem.mapper.*;
import com.edusystem.service.TipService;
import com.edusystem.util.DateUtil;
import com.edusystem.util.JWTUtils;
import com.edusystem.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 花菜
 * @date 2021/4/30 9:50
 */
@Service
@Slf4j
public class TipServiceImpl implements TipService {

    @Autowired
    TipMapper tipMapper;

    @Autowired
    StudentMapper studetMapper;

    @Autowired
    CollegeMapper collegeMapper;

    @Autowired
    ClassMapper classMapper;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    TeachtaskMapper teachtaskMapper;

    @Autowired
    XxkcMapper xxkcMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    ProfessionMapper professionMapper;


    @Override
    public HashMap getTipList(Map datamap, String userid) {
        HashMap<Integer,Object> res = new HashMap<>();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        try{
            TipExample tipExample = new TipExample();
            TipExample.Criteria criteria  = tipExample.createCriteria();
            tipExample.setOrderByClause("tip_time DESC");

            String fromTipTime = (String)data.get("fromTipTime");
            if (!(fromTipTime == null || fromTipTime.equals(""))) {
                try {
                    log.info("方法：查询用户的通知列表。从{}开始", DateUtil.getDateWithStr(fromTipTime));
                    criteria.andTipTimeGreaterThanOrEqualTo(DateUtil.getDateWithStr(fromTipTime));
                } catch (ParseException e) {
                    log.error("方法：查询用户的通知列表。字符串转Date类型失败！");
                    e.printStackTrace();
                }
            }
            String toTipTime = (String)data.get("toTipTime");
            if (!(toTipTime == null || toTipTime.equals(""))) {
                try {
                    log.info("方法：查询用户的通知列表。截至至{}",DateUtil.getDateWithStr(toTipTime));
                    criteria.andTipTimeLessThanOrEqualTo(DateUtil.getDateWithStr(toTipTime));
                } catch (ParseException e) {
                    log.error("方法：查询用户的通知列表。字符串转Date类型失败！");
                    e.printStackTrace();
                }
            }
            criteria.andTipUseridEqualTo(userid);
            criteria.andTipIdIsNotNull();

//            Integer page = (Integer)data.get("page");
//            Integer limit = (Integer)data.get("limit");
            List<Tip> tipList = tipMapper.selectByExample(tipExample);

            int total = tipList.size();
            tipList = PageUtil.startPage(
                    tipList,
                    (Integer)data.get("page"),
                    (Integer)data.get("limit")
            );
            HashMap resData = new HashMap();
            resData.put("data" , tipList);
            resData.put("total" , total);
            res.put(20000,resData);
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"查询用户的通知列表！服务器内部错误！");
            return res;
        }
        return res;
    }

    @Override
    public HashMap updateTipState(String tipid, int state) {
        HashMap<Integer,String> res = new HashMap<>();

        Tip tip = new Tip();
        tip.setTipId(tipid);
        tip.setTipIscheck(state);
        try{
            int ress = tipMapper.updateByPrimaryKeySelective(tip);
            if(ress >= 1)
                res.put(20000,"修改通知的查看状态成功！");
            else
                res.put(18000,"修改通知的查看状态失败！服务器内部错误！");
            return res;
        }catch(Exception e){
            e.printStackTrace();
            log.error("方法：修改通知的查看状态。插入数据错误！");
            res.put(18000,"修改通知的查看状态失败！服务器内部错误！");
            return res;
        }
    }

    @Override
    public HashMap createTip(String userid, int kind , Map datamap) {
        HashMap<Integer, String> res = new HashMap<>();
        Tip tip = new Tip();
        tip.setTipId(UUID.randomUUID().toString().substring(0, 8));
        tip.setTipUserid(userid);
        tip.setTipKind(kind);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            tip.setTipTime(DateUtil.getDateWithStr(df.format(new Date())));
        } catch (ParseException e) {
            log.error("方法：新建通知记录。获取系统当前时间错误~");
            e.printStackTrace();
        }
        tip.setTipIscheck(0);
        try {
            switch (kind) {
                case 1: {
                    // 你已被添加到XX学院XX班级,你的专业是XX
                    Student student = studetMapper.selectByPrimaryKey(userid);
                    College c = collegeMapper.selectByPrimaryKey(student.getCollegeId());
                    Class class_ = classMapper.selectByPrimaryKey(student.getClassId());
                    Profession p = professionMapper.selectByPrimaryKey(class_.getProfessionId());
                    String content = "亲爱的同学，您已被安排至 " + c.getCollegeName() + " " + student.getClassId() + " 班，你的专业是 " + p.getProfessionName();
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-添加学生");
                    }
                    break;
                }
                case 2: {
                    // 你已选择XX校外选修课程
                    String xxkcName = (String) datamap.get("xxkcName");
                    String content = "亲爱的同学，您已成功选修"+xxkcName+" 请注意上课时间，及时去上课！";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-校外选修课程");
                    }
                    break;
                }
                case 3: {
                    // 你已选择XX校内素质拓展课程
                    String xxkcName = (String) datamap.get("xxkcName");
                    String content = "亲爱的同学，您已成功选修"+xxkcName+" 请注意上课时间，及时去上课！";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-校内素质拓展课程");
                    }
                    break;
                }
                case 4: {
                    // 学生-你已选择XX课程（校内非素质拓展课程）
                    String kcName = (String) datamap.get("kcName");
                    String content = "亲爱的同学，您本学期有一门名为 "+kcName+" 的校内必修课已开，请注意上课时间，及时去上课！";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-校内必修课程");
                    }
                    break;
                }
                case 5: {
                    // 教师-你已提交教师教学质量管理的记录
                    String tk_courseName = (String) datamap.get("tk_courseName");
                    String tk_btkjsName = (String) datamap.get("tk_btkjsName"  );
                    String tk_time = (String) datamap.get("tk_time");


                    String content = "亲爱的教师，您在 "+tk_time+" 为教师 "+tk_btkjsName+" 所教授的课程名为 "+tk_courseName+" 编辑的课程教学质量管理记录已上传！";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-上传教学质量管理记录");
                    }
                    break;
                }
                case 6: {
                    // 教师-你已修改教师教学质量管理的记录
                    String tk_courseName = (String) datamap.get("tk_courseName");
                    String tk_btkjsName = (String) datamap.get("tk_btkjsName"  );
                    String tk_time = (String) datamap.get("tk_time");


                    String content = "亲爱的教师，您在 "+tk_time+" 为教师 "+tk_btkjsName+" 所教授的课程名为 "+tk_courseName+" 编辑的课程教学质量管理记录已成功修改！";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-修改教学质量管理记录");
                    }
                    break;
                }
                case 7:{
                    // 教师-你已提交教授XX课程的申请
                    String teachtask_courseName = (String) datamap.get("teachtask_courseName");
                    String content = "亲爱的教师，您的课程名为 "+teachtask_courseName+" 的课程申请已提交！";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-提交教授XX课程的申请");
                    }
                    break;
                }
                case 8:{
                    // 教师-你提交对XX课程的教授申请已被通过
                    String teachtask_courseName = (String) datamap.get("teachtask_courseName");
                    String content = "亲爱的教师，您的课程名为 "+teachtask_courseName+" 的课程申请已通过！";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-你提交对XX课程的教授申请已被通过");
                    }
                    break;
                }
                case 9:{
                    //你提交对XX课程的教授申请已被拒绝
                    String teachtask_courseName = (String) datamap.get("teachtask_courseName");
                    String content = "亲爱的教师，您的课程名为 "+teachtask_courseName+" 的课程申请已被拒绝！";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-你提交对XX课程的教授申请已被拒绝");
                    }
                    break;
                }
                case 10:{
                    //留言-你在XX时间收到XX发来的留言
                    String notice_fromRole = (String) datamap.get("notice_fromRole");
                    String notice_time = (String) datamap.get("notice_time");
                    String notice_fromName = (String) datamap.get("notice_fromName");
                    String content = notice_fromRole+" "+notice_fromName+" 在 "+notice_time+" 给您发送了一条留言了!";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-你在XX时间收到XX发来的留言");
                    }
                    break;
                }
                case 11:{
                    //留言-你在XX时间收到了XX发来的留言回复
                    String notice_fromRole = (String) datamap.get("notice_fromRole");
                    String notice_time = (String) datamap.get("notice_time");
                    String notice_fromName = (String) datamap.get("notice_fromName");
                    String content = notice_fromRole+" "+notice_fromName+" 在 "+notice_time+" 回复了您的留言!";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-你在XX时间收到了XX发来的留言回复");
                    }
                    break;
                }
                case 12:{
                    //留言-你在XX时间确认收到XX发来的留言
                    String notice_fromRole = (String) datamap.get("notice_fromRole");
                    String notice_time = (String) datamap.get("notice_time");
                    String notice_fromName = (String) datamap.get("notice_fromName");
                    String content = notice_fromRole+" "+notice_fromName+" 在 "+notice_time+" 确认查看了您的留言!";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-你在XX时间确认收到XX发来的留言");
                    }
                    break;
                }
                case 13:{
                    //留言-你收到一条课程XXX的考勤任务
                    String notice_courseName = (String) datamap.get("notice_courseName");
                    String notice_time = (String) datamap.get("notice_time");

                    String content = "你收到了一条课程名为 "+notice_courseName+" 的考勤任务，截止时间为 "+ notice_time +" 请及时完成!";
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-你收到一条课程XXX的考勤任务");
                    }
                    break;
                }
                case 14:{
                    //留言-学生XX 已完成您发布的课程XXX的考勤任务 （任务编号：XXX，时间：XXX）
                    String kq_task_id = (String) datamap.get("kq_task_id");
                    String studentName = (String) datamap.get("studentName");
                    String courseName = (String) datamap.get("courseName");
                    String kq_Time = (String) datamap.get("kq_Time");
                    String studentid = (String) datamap.get("studentid");

                    String content = "";
                    if((boolean)datamap.get("isLater")){
                        //迟到
                        content = "学号:"+studentid +" 姓名:"+studentName+" 已完成您在课程 "+ courseName +" 发布的考勤任务。但是其迟到了！ 任务编号:"+ kq_task_id +";完成时间:"+kq_Time+"。";
                    }else{
                        content = "学号:"+studentid +" 姓名:"+studentName+" 已完成您在课程 "+ courseName +" 发布的考勤任务。任务编号:"+ kq_task_id +";完成时间:"+kq_Time+"。";
                    }
                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：新建通知记录失败-学生XX 已完成您发布的课程XXX的考勤任务 （任务编号：XXX，时间：XXX）");
                    }
                    break;
                }
                case 15:{
                    //校长信箱-您已成功完成提问 （提问编号：XXX，主题：XXX，时间：XXX）
                    String msg_title = (String) datamap.get("msg_title");
                    String msg_time = (String) datamap.get("msg_time");
                    String msg_id = (String) datamap.get("msg_id");
                    String content = "";
                    content = "您已成功完成提问。主题:"+ msg_title +";编号:"+msg_id+";完成时间:"+msg_time+"。";

                    tip.setTipContent(content);
                    try {
                        tipMapper.insertSelective(tip);
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error("方法：您已成功完成提问 （提问编号：XXX，时间：XXX）");
                    }
                    break;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            log.error("方法：新建通知记录。插入数据错误！");
            res.put(18000, "新建通知记录失败！服务器内部错误！");
            return res;
        }
        res.put(20000, "新建通知记录成功！服务器内部错误！");
        return res;

//        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
//
//        Notice notice = new Notice();
//
//        DecodedJWT verify = JWTUtils.verify(token);
//        notice.setNoticeId(UUID.randomUUID().toString().substring(0, 8));
//        notice.setNoticeFromid(verify.getClaim("username").asString());
//        notice.setNoticeToid((String) data.get("to_user"));
//        notice.setNoticeContent((String) data.get("content"));
//        notice.setNoticeTitle((String) data.get("title"));
//        notice.setNoticeIsseen(0);
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        try {
//            notice.setNoticeTime(DateUtil.getDateWithStr(df.format(new Date())));
//        } catch (ParseException e) {
//            log.error("方法：新建留言记录。获取系统当前时间错误~");
//            e.printStackTrace();
//        }
//        try {
//            int ress = noticeMapper.insertSelective(notice);
//            if (ress >= 1)
//                res.put(20000, "新增留言记录信息成功！");
//            else
//                res.put(18000, "新增留言记录信息失败！服务器内部错误！");
//            return res;
//        } catch (Exception e) {
//            e.printStackTrace();
//            log.error("方法：新建留言记录。插入数据错误！");
//            res.put(18000, "新增留言信息失败！服务器内部错误！");
//            return res;
//        }
    }
}
