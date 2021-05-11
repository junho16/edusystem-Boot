package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.*;
import com.edusystem.mapper.*;
import com.edusystem.service.TkService;
import com.edusystem.util.DateUtil;
import com.edusystem.util.JWTUtils;
import com.edusystem.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 花菜D
 * @date 2021/4/24 17:15
 */
@Service
@Slf4j
public class TkServiceImpl implements TkService {
    @Autowired
    TipServiceImpl tipService;

    @Autowired
    TkMapper tkMapper;

    @Autowired
    TeachtaskMapper teachtaskMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    CollegeMapper collegeMapper;

    @Autowired
    MailServiceImpl mailService;

    @Override
    public HashMap newtklist(String token)   {
        HashMap<Integer,Object> ress = new HashMap<>();
        //获取新的需要听课的教师信息--10条以内的 12个月以内的 平均评分最低的教师(7)--以及次数最少的教师(3)
        Date dNow = new Date();   //当前时间
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.MONTH, -12);  //设置为前1月

        Date dBefore = calendar.getTime();   //得到前3月的时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //设置时间格式
        try {
            Date startDate = DateUtil.getDateWithStr(sdf.format(dBefore));
//            TkExample tkExample = new TkExample();
//            tkExample.setOrderByClause("`tk_score` ASC");//DESC
//
//            TkExample.Criteria tkCia = tkExample.createCriteria();
//            tkCia.andTkTimeGreaterThanOrEqualTo(startDate);
//            List<TkWithBLOBs> tkList = tkMapper.selectByExampleWithBLOBs(tkExample);
//
//            Set res = new LinkedHashSet();
//            res.addAll(tkList);//获取1个月内教师的评分从低到高


            HashMap<String,Double> scoreMap = new HashMap(); //获取所有教师的排序得分：12个月内听课均分
            TeacherExample teacherExample = new TeacherExample();
            TeacherExample.Criteria tCia = teacherExample.createCriteria();
            tCia.andTeacherIdIsNotNull();
            List<Teacher> teachers = teacherMapper.selectByExample(teacherExample);
            for(Teacher t : teachers){
                TkExample tkExample2 = new TkExample();
                TkExample.Criteria tkCia2 = tkExample2.createCriteria();
                tkCia2.andTkBtkjsidEqualTo(t.getTeacherId());
                tkCia2.andTkTimeGreaterThanOrEqualTo(startDate);

                long count = tkMapper.countByExample(tkExample2);


                List<Tk> list = tkMapper.selectByExample(tkExample2);
                int total = 0;
                for(Tk tk: list){
                    total += tk.getTkScore();
                }

                if( count == 0 )
                    scoreMap.put(t.getTeacherId(), (double) 0);
                else
                    scoreMap.put(t.getTeacherId(), (double) (total/count));

            }

            List<Map.Entry<String,Double>> list = new ArrayList<>(scoreMap.entrySet()); //将map的entryset放入list集合
            //对list进行排序，并通过Comparator传入自定义的排序规则
            Collections.sort(list,new Comparator<Map.Entry<String, Double>>() {
                @Override
                public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                    return (int) (o1.getValue()-o2.getValue()); //重写排序规则，小于0表示升序，大于0表示降序
                }
            });

            //发送邮件 并 返回需听课的教师列表
            List<Teacher> res = new ArrayList<>();
            if(list.size() < 10){
                Iterator<Map.Entry<String, Double>> iter = list.iterator();
                while(iter.hasNext()){
                    Map.Entry<String, Double> item = iter.next();
                    String key = item.getKey();

                    Teacher t = teacherMapper.selectByPrimaryKey(key);
                    College c = collegeMapper.selectByPrimaryKey(t.getCollegeId());
                    t.setCollegeName(c.getCollegeName());
                    res.add(t);




                }
            }
            else{
                int num = 10;
                Iterator<Map.Entry<String, Double>> iter = list.iterator();
                while(num != 0){
                    Map.Entry<String, Double> item = iter.next();
                    String key = item.getKey();

                    Teacher t = teacherMapper.selectByPrimaryKey(key);
                    College c = collegeMapper.selectByPrimaryKey(t.getCollegeId());
                    t.setCollegeName(c.getCollegeName());
                    res.add(t);



                    num--;
                }
            }

            ress.put(20000,res);


            //发邮件-异步处理
            mailService.sendToTeacherList(res,
                    "听课通知",
                    "您最近有一场教学质量管理任务，请提前准备！时间：" + sdf.format(new Date())
            );


            return ress;

        } catch (ParseException e) {
            e.printStackTrace();
            ress.put(18000,"发送邮件失败，请检查需进行教学质量检查的教师的邮箱是否正确~");
            return ress;
        }



    }

    @Override
    public HashMap createTkRecord(Map datamap, String token)   {
        HashMap<Integer,String> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String tk_tkjsid = verify.getClaim("username").asString();

        String tk_id = (String) data.get("tk_id");
        String tk_classes = (String) data.get("tk_classes");
        String tk_content = (String) data.get("tk_content");

        try {
            //解码
            tk_content = java.net.URLDecoder.decode(tk_content, "UTF-8");

            //存至mysql
            tk_content = HtmlUtils.htmlEscapeHex(tk_content);

            // 解析： htmlUnescape
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        String tk_content_short = (String)  data.get("tk_content_short");
        String tk_date = (String) data.get("tk_date");
        String tk_jc = (String) data.get("tk_jc");
        Integer tk_rate = (Integer) data.get("tk_rate");
        String tk_tags = (String) data.get("tk_tags");
        String tk_judge = (String) data.get("tk_judge");


        String tk_teachtaskid = (String) data.get("tk_teachtaskid");

        Teachtask teachtask = teachtaskMapper.selectByPrimaryKey(tk_teachtaskid);
        String tk_btkjsid = teachtask.getTeacherId();

        String tk_title = (String) data.get("tk_title");

        TkWithBLOBs tk = new TkWithBLOBs();
        tk.setTkId(tk_id);
        tk.setTkClasses(tk_classes);
        tk.setTkComments(tk_content);

        try {
            tk.setTkTime(DateUtil.getDateWithStr(tk_date));
        } catch (ParseException e) {
            log.error("方法：新增听课记录信息。字符串转Date类型失败！");
            e.printStackTrace();
        }

        tk.setTkJc(tk_jc);
        tk.setTkContentShort(tk_content_short);
        tk.setTkScore( tk_rate);
        tk.setTkTitle(tk_title);
        tk.setTkTkjsid(tk_tkjsid);
        tk.setTkBtkjsid(tk_btkjsid);
        tk.setTeachtaskId(tk_teachtaskid);
        tk.setTkTags(tk_tags);
        tk.setTkJudge(tk_judge);


        int ress = tkMapper.insertSelective(tk);

        if(ress >= 1){
            res.put(20000,"新增听课记录信息成功！");

            HashMap h = new HashMap();
            Teachtask task = teachtaskMapper.selectByPrimaryKey(tk_teachtaskid);
            Course c = courseMapper.selectByPrimaryKey(task.getCourseId());
            Teacher t = teacherMapper.selectByPrimaryKey(teachtask.getTeacherId());
            h.put("tk_courseName" , c.getCourseName());
            h.put("tk_btkjsName" , t.getTeacherName() );
            h.put("tk_time" ,  tk_date  );
            // 教师-你已提交教师教学质量管理的记录
            tipService.createTip(tk_tkjsid , 5 , h);
        } else
            res.put(18000,"新增听课记录信息失败！服务器内部错误！");
        return res;
    }

    @Override
    public HashMap updateTkRecord(Map datamap, String token) {
        HashMap<Integer,String> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String tk_tkjsid = verify.getClaim("username").asString();

        String tk_id = (String) data.get("tk_id");
        String tk_classes = (String) data.get("tk_classes");
        String tk_content = (String) data.get("tk_content");

        try {
            //解码
            tk_content = java.net.URLDecoder.decode(tk_content, "UTF-8");

            //存至mysql
            tk_content = HtmlUtils.htmlEscapeHex(tk_content);

            // 解析： htmlUnescape
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        String tk_content_short = (String)  data.get("tk_content_short");
        String tk_date = (String) data.get("tk_date");
        String tk_jc = (String) data.get("tk_jc");
        Integer tk_rate = (Integer) data.get("tk_rate");
        String tk_tags = (String) data.get("tk_tags");
        String tk_judge = (String) data.get("tk_judge");


        String tk_teachtaskid = (String) data.get("tk_teachtaskid");

        Teachtask teachtask = teachtaskMapper.selectByPrimaryKey(tk_teachtaskid);
        String tk_btkjsid = teachtask.getTeacherId();

        String tk_title = (String) data.get("tk_title");

        TkWithBLOBs tk = new TkWithBLOBs();
        tk.setTkId(tk_id);
        tk.setTkClasses(tk_classes);
        tk.setTkComments(tk_content);

        try {
            tk.setTkTime(DateUtil.getDateWithStr(tk_date));
        } catch (ParseException e) {
            log.error("方法：更新听课记录信息。字符串转Date类型失败！");
            e.printStackTrace();
        }

        tk.setTkJc(tk_jc);
        tk.setTkContentShort(tk_content_short);
        tk.setTkScore( tk_rate);
        tk.setTkTitle(tk_title);
        tk.setTkTkjsid(tk_tkjsid);
        tk.setTkBtkjsid(tk_btkjsid);
        tk.setTeachtaskId(tk_teachtaskid);
        tk.setTkTags(tk_tags);
        tk.setTkJudge(tk_judge);


        int ress = tkMapper.updateByPrimaryKeyWithBLOBs(tk);

        if(ress >= 1){
            res.put(20000,"更新听课记录信息成功！");

            HashMap h = new HashMap();
            Teachtask task = teachtaskMapper.selectByPrimaryKey(tk_teachtaskid);
            Course c = courseMapper.selectByPrimaryKey(task.getCourseId());
            Teacher t = teacherMapper.selectByPrimaryKey(teachtask.getTeacherId());
            h.put("tk_courseName" , c.getCourseName());
            h.put("tk_btkjsName" , t.getTeacherName() );
            h.put("tk_time" ,  (tk_date) );
            // 教师-你已更新教师教学质量管理的记录
            tipService.createTip(tk_tkjsid , 6 , h);
        }else
            res.put(18000,"更新听课记录信息失败！服务器内部错误！");
        return res;
    }

    @Override
    public HashMap getTkDataWithChart(Map datamap) {

        HashMap<Integer,Object> res = new HashMap<>();
        List<TkWithBLOBs> arrayList = new ArrayList();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        String teacherid = (String)data.get("selTeacher");


        try{
            TeachtaskExample teachtaskExample = new TeachtaskExample();
            TeachtaskExample.Criteria criteria  = teachtaskExample.createCriteria();
            criteria.andTeacherIdEqualTo(teacherid);

            String teachtaskAcademicyear = (String)data.get("teachtaskAcademicyear");
            if (!(teachtaskAcademicyear == null || teachtaskAcademicyear.equals(""))) {
                log.info("方法：根据教师id获取其听课的标签数据。查询学年为{}的教学任务", teachtaskAcademicyear);
                criteria.andTeachtaskAcademicyearEqualTo( Integer.parseInt(teachtaskAcademicyear ));
            }

            String teachtaskAcademicterm = (String)data.get("teachtaskAcademicterm");
            if (!(teachtaskAcademicterm == null || teachtaskAcademicterm.equals(""))) {
                log.info("方法：根据教师id获取其听课的标签数据。查询学期为{}的教学任务", teachtaskAcademicterm);
                criteria.andTeachtaskAcademictermEqualTo( Integer.parseInt(teachtaskAcademicterm) );
            }

            List<Teachtask> teachtaskList = teachtaskMapper.selectByExample(teachtaskExample);
            for(Teachtask teachtask : teachtaskList){
                TkExample tkExample = new TkExample();
                TkExample.Criteria tkCriteria  = tkExample.createCriteria();
                tkCriteria.andTeachtaskIdEqualTo(teachtask.getTeachtaskId());

                List<TkWithBLOBs> tklist = tkMapper.selectByExampleWithBLOBs(tkExample);
                arrayList.addAll(tklist);

            }
            res.put(20000,arrayList);
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"根据教师id获取其听课的标签数据失败！服务器内部错误！");
            return res;
        }
        return res;

    }


    @Override
    public HashMap getTkDataWithTable(Map datamap , String userid){
        HashMap<Integer,Object> res = new HashMap<>();
        List<TkWithBLOBs> arrayList = new ArrayList();

        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        try{
            TeachtaskExample teachtaskExample = new TeachtaskExample();
            TeachtaskExample.Criteria criteria  = teachtaskExample.createCriteria();


            String teacherid = (String)data.get("selTeacher");
            if (!(teacherid == null || teacherid.equals(""))) {
                log.info("方法：根据教师id获取其听课的table数据。查询为{}的教学任务", teacherid);
                criteria.andTeacherIdEqualTo(teacherid);
            }

            String teachtaskAcademicyear = (String)data.get("teachtaskAcademicyear");
            if (!(teachtaskAcademicyear == null || teachtaskAcademicyear.equals(""))) {
                log.info("方法：根据教师id获取其听课的table数据。查询学年为{}的教学任务", teachtaskAcademicyear);
                criteria.andTeachtaskAcademicyearEqualTo( Integer.parseInt(teachtaskAcademicyear ));
            }

            String teachtaskAcademicterm = (String)data.get("teachtaskAcademicterm");
            if (!(teachtaskAcademicterm == null || teachtaskAcademicterm.equals(""))) {
                log.info("方法：根据教师id获取其听课的table数据。查询学期为{}的教学任务", teachtaskAcademicterm);
                criteria.andTeachtaskAcademictermEqualTo( Integer.parseInt(teachtaskAcademicterm) );
            }
            criteria.andTeacherIdIsNotNull();

            int total = 0;
            List<Teachtask> teachtaskList = teachtaskMapper.selectByExample(teachtaskExample);
            for(Teachtask teachtask : teachtaskList){

                TkExample tkExample = new TkExample();
                TkExample.Criteria tkCriteria  = tkExample.createCriteria();
                tkCriteria.andTeachtaskIdEqualTo(teachtask.getTeachtaskId());
                tkCriteria.andTkTkjsidEqualTo(userid);

                List<TkWithBLOBs> tklist = tkMapper.selectByExampleWithBLOBs(tkExample);

                // 任课教师 学年 学期 课程名
                for(TkWithBLOBs tk : tklist){
                    String teachertaskid = tk.getTeachtaskId();
                    Teachtask tmp = teachtaskMapper.selectByPrimaryKey(teachertaskid);

                    Course c = courseMapper.selectByPrimaryKey(tmp.getCourseId());
                    Teacher t = teacherMapper.selectByPrimaryKey(tmp.getTeacherId());

                    tk.setTk_CourseName(c.getCourseName());
                    tk.setTk_btkTeacherName(t.getTeacherName());
                    tk.setTk_AcaYear(tmp.getTeachtaskAcademicyear()+"");
                    tk.setTk_AcaTerm(tmp.getTeachtaskAcademicterm()+"");

                }


                total += tklist.size();
                arrayList.addAll(tklist);
            }
            arrayList = PageUtil.startPage(
                    arrayList,
                    (Integer)data.get("page"),
                    (Integer)data.get("limit")
            );
            HashMap resData = new HashMap();
            resData.put("data" , arrayList);
            resData.put("total" , total);
            res.put(20000,resData);
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"根据教师id获取其听课的标签数据失败！服务器内部错误！");
            return res;
        }
        return res;
    }

    @Override
    public HashMap fetchTkInfo(String id) {
        HashMap<Integer,Object> res = new HashMap<>();
        try{
            TkWithBLOBs tk = tkMapper.selectByPrimaryKey(id);
            tk.setTkComments(HtmlUtils.htmlUnescape(tk.getTkComments()));

            String teachertaskid = tk.getTeachtaskId();
            Teachtask tmp = teachtaskMapper.selectByPrimaryKey(teachertaskid);
            Course c = courseMapper.selectByPrimaryKey(tmp.getCourseId());
            Teacher t = teacherMapper.selectByPrimaryKey(tmp.getTeacherId());

            tk.setTk_College(t.getCollegeId());
            tk.setTk_CourseName(c.getCourseName());
            tk.setTk_btkTeacherName(t.getTeacherName());
            tk.setTk_AcaYear(tmp.getTeachtaskAcademicyear()+"");
            tk.setTk_AcaTerm(tmp.getTeachtaskAcademicterm()+"");

            res.put(20000,tk);
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"根据听课id获取其听课的详情数据失败！服务器内部错误！");
            return res;
        }
        return res;
    }

    @Override
    public HashMap getTkDataWithAdmin(Map datamap) {
        HashMap<Integer,Object> res = new HashMap<>();
        List<TkWithBLOBs> arrayList = new ArrayList();
//        tkTeacher : this.listQuery.tkTeacher,
//        btkTeacher: this.listQuery.btkTeacher,
//        teachtaskAcademicterm : this.listQuery.teachtaskAcademicterm,
//        teachtaskAcademicyear : this.listQuery.teachtaskAcademicyear
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        try{
            TeachtaskExample teachtaskExample = new TeachtaskExample();
            TeachtaskExample.Criteria criteria  = teachtaskExample.createCriteria();


            String teacherid = (String)data.get("btkTeacher");
            if (!(teacherid == null || teacherid.equals(""))) {
                log.info("方法：获取管理员视角的手风琴数据。查询被听课教师为{}的教学任务", teacherid);
                criteria.andTeacherIdEqualTo(teacherid);
            }

            String teachtaskAcademicyear = (String)data.get("teachtaskAcademicyear");
            if (!(teachtaskAcademicyear == null || teachtaskAcademicyear.equals(""))) {
                log.info("方法：获取管理员视角的手风琴数据。查询学年为{}的教学任务", teachtaskAcademicyear);
                criteria.andTeachtaskAcademicyearEqualTo( Integer.parseInt(teachtaskAcademicyear ));
            }

            String teachtaskAcademicterm = (String)data.get("teachtaskAcademicterm");
            if (!(teachtaskAcademicterm == null || teachtaskAcademicterm.equals(""))) {
                log.info("方法：获取管理员视角的手风琴数据。查询学期为{}的教学任务", teachtaskAcademicterm);
                criteria.andTeachtaskAcademictermEqualTo( Integer.parseInt(teachtaskAcademicterm) );
            }
            criteria.andTeacherIdIsNotNull();


            List<Teachtask> teachtaskList = teachtaskMapper.selectByExample(teachtaskExample);
            for(Teachtask teachtask : teachtaskList){

                TkExample tkExample = new TkExample();
                TkExample.Criteria tkCriteria  = tkExample.createCriteria();
                tkCriteria.andTeachtaskIdEqualTo(teachtask.getTeachtaskId());

                String tkTeacher = (String)data.get("tkTeacher");
                if (!(tkTeacher == null || tkTeacher.equals(""))) {
                    log.info("方法：获取管理员视角的手风琴数据。查询听课教师为{}的教学任务", tkTeacher);
                    tkCriteria.andTkTkjsidEqualTo(tkTeacher);
                }


                List<TkWithBLOBs> tklist = tkMapper.selectByExampleWithBLOBs(tkExample);

                // 任课教师 学年 学期 课程名
                for(TkWithBLOBs tk : tklist){
                    String teachertaskid = tk.getTeachtaskId();
                    Teachtask tmp = teachtaskMapper.selectByPrimaryKey(teachertaskid);

                    Course c = courseMapper.selectByPrimaryKey(tmp.getCourseId());
                    Teacher t = teacherMapper.selectByPrimaryKey(tmp.getTeacherId());
                    Teacher t2 = teacherMapper.selectByPrimaryKey(tk.getTkTkjsid());

                    tk.setTk_CourseName(c.getCourseName());
                    tk.setTk_btkTeacherName(t.getTeacherName());

                    if(t2 == null){
                        //说明是管理员听课
                        tk.setTk_tkTeacherName("admin");
                    }else{
                        tk.setTk_tkTeacherName(t2.getTeacherName());
                    }

                    tk.setTk_AcaYear(tmp.getTeachtaskAcademicyear()+"");
                    tk.setTk_AcaTerm(tmp.getTeachtaskAcademicterm()+"");

                }
                arrayList.addAll(tklist);
            }
            HashMap resData = new HashMap();
            resData.put("data" , arrayList);
            res.put(20000,resData);
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"获取管理员视角的手风琴数据！服务器内部错误！");
            return res;
        }
        return res;
    }
}
