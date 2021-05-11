package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.dto.UserDto;
import com.edusystem.entity.*;
import com.edusystem.entity.Class;
import com.edusystem.mapper.*;
import com.edusystem.service.KqService;
import com.edusystem.util.DateUtil;
import com.edusystem.util.DistanceUtil;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 花菜
 * @date 2021/5/3 23:06
 */
@Service
@Slf4j
public class KqServiceImpl implements KqService {

    @Autowired
    KqMapper kqMapper;

    @Autowired
    KqinfoMapper kqinfoMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeachtaskMapper teachtaskMapper;

    @Autowired
    ClsandstuMapper clsandstuMapper;

    @Autowired
    TipServiceImpl tipService;

    @Autowired
    CourseMapper courseMapper;

    public HashMap getkqInfoRes(Map datamap, String token){
        HashMap<Integer,Object> res = new HashMap<>();
        HashMap<String,Object> resMap = new HashMap<>();

        System.out.println(datamap.toString());
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        String kq_id = ((String) data.get("kq_id"));
        KqinfoExample kqinfoExample = new KqinfoExample();
        kqinfoExample.setOrderByClause("kqinfo_time DESC");
        KqinfoExample.Criteria criteria = kqinfoExample.createCriteria();
        criteria.andKqIdEqualTo(kq_id);

        try{
            List<Kqinfo> ress = kqinfoMapper.selectByExample(kqinfoExample);
            if(ress.size()==0){
                res.put(18000,"此考勤任务还无人考勤！");
                return res;
            }
            Teachtask t = teachtaskMapper.selectByPrimaryKey(ress.get(0).getTeachtaskId());


            ClsandstuExample clsandstuExample = new ClsandstuExample();
            ClsandstuExample.Criteria clsCriteria = clsandstuExample.createCriteria();

            clsCriteria.andTeachtaskIdEqualTo(t.getTeachtaskId());
            List<Clsandstu> clsList = clsandstuMapper.selectByExample(clsandstuExample);

            clsCriteria.andTeachtaskIdEqualTo("0-"+t.getTeachtaskId());
            List<Clsandstu> clsList2 = clsandstuMapper.selectByExample(clsandstuExample);

            clsList.addAll(clsList2);
            List<Student> students = new ArrayList<>();
            for(Clsandstu clsandstu : clsList){
                students.add(studentMapper.selectByPrimaryKey(clsandstu.getStudentId()));
            }


            resMap.put("student",students);

            for(Kqinfo kqinfo : ress){
                Student s = studentMapper.selectByPrimaryKey(kqinfo.getStudentId());
                kqinfo.setStudentName(s.getStudentName());
            }

            resMap.put("data",ress);

            res.put(20000,resMap);
            return res;
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"获取考勤任务记录信息失败！服务器内部错误！");
            return res;
        }

    }


    /**
     * address: "江苏省苏州市太仓市县府东街"
     * addressName: "江苏省苏州市太仓市县府东街"
     * addressResName: "太仓市政府(县府东街南)"
     * displayValue_Time: "3时 0分"
     * kq_courseName: "12123"
     * kq_fw: 200
     * kq_qdah: "123"
     * kq_stopTime: (2) ["3", "0"]
     * latitude: 31.45911
     * longitude: 121.12975
     *
     * teachtaskid: this.data.teachtaskid,
     * address: this.data.addressName + this.data.addressResName ,
     * kq_courseName: this.data.kq_courseName ,
     * kq_fw: this.data.kq_fw ,
     * kq_qdah: this.data.kq_qdah ,
     * latitude: this.data.latitude ,
     * longitude: this.data.longitude ,
     * kq_stopTime: this.data.displayValue_Time[0] + '-' + this.data.displayValue_Time[1]
     *
     * @param datamap
     * @param token
     * @return
     */
    public HashMap createKqTask(Map datamap, String token){
        HashMap<Integer,String> res = new HashMap<>();
        System.out.println(datamap.toString());
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        Kq kq = new Kq();
        DecodedJWT verify = JWTUtils.verify(token);

        System.out.println(data);
        kq.setKqId(UUID.randomUUID().toString().substring(0,8));
        kq.setTeachtaskId((String) data.get("teachtaskid"));
        kq.setCourseName((String) data.get("kq_courseName"));
        kq.setKqQdah((String) data.get("kq_qdah"));
        kq.setTeacherId(verify.getClaim("username").asString());
        String kq_stopTime = ((String) data.get("kq_stopTime"));
        String dateStr = null;
        try {
            SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd" );
            dateStr = time.format(new Date()) +" "+
                    kq_stopTime.split(" ")[0] + ":" +
                    kq_stopTime.split(" ")[1] + ":00" ;
            log.info("方法：创建考勤任务。当前时间通过格式化后的输出:{} ",dateStr);
            kq.setKqStopTime(DateUtil.getDateWithStr(dateStr));
            kq.setKqTime( DateUtil.getDateWithStr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" ).format(new Date())) );
        } catch (ParseException e) {
            e.printStackTrace();
            log.error("方法：创建考勤任务。当前时间通过格式化失败");
        }

        //kind为1代表定位 2代表wifi
        Integer kq_kind = (Integer) data.get("kq_kind");
        if(kq_kind == 1 ){
            kq.setKqKind(1);
            kq.setKqAddress((String) data.get("address"));
            kq.setKqFw((Integer) data.get("kq_fw"));
            kq.setKqLatitude((BigDecimal) data.get("latitude"));
            kq.setKqLongitude((BigDecimal) data.get("longitude"));
        }else if(kq_kind == 2) {
            kq.setKqKind(2);
            kq.setKqAddress((String) data.get("address"));
            kq.setKqFw((Integer) data.get("kq_fw"));
            kq.setKqLatitude((BigDecimal) data.get("latitude"));
            kq.setKqLongitude((BigDecimal) data.get("longitude"));

            kq.setKqWifiAme((String) data.get("kq_wifiName"));
            kq.setKqWifiId((String) data.get("kq_wifiBssid"));
        }else{

        }
        try{
            int ress = kqMapper.insertSelective(kq);
            if(ress >= 1){
                HashMap h = new HashMap();
                ClsandstuExample clsandstuExample = new ClsandstuExample();
                ClsandstuExample.Criteria clsandstuCriteria  = clsandstuExample.createCriteria();
                clsandstuCriteria.andTeachtaskIdEqualTo((String) data.get("teachtaskid"));
                List<Clsandstu> Clses = clsandstuMapper.selectByExample(clsandstuExample);

                for(Clsandstu c : Clses){
                    studentMapper.selectByPrimaryKey(c.getStudentId());
                    h.clear();
                    h.put("notice_courseName" , (String) data.get("kq_courseName") );
                    h.put("notice_time" ,dateStr) ;
                    // 留言-你收到一条课程XXX的考勤任务
                    tipService.createTip(c.getStudentId(), 13 , h);
                }

                res.put(20000,"新增考勤任务记录信息成功！");
            }else{
                res.put(18000,"新增考勤任务记录信息失败！服务器内部错误！插入但没有完全插入");
            }
            return res;
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"新增考勤任务记录信息失败！服务器内部错误！");
            return res;
        }
    }

    /**
     * kq_Time: "2021-05-04 14:43:55"
     * kq_qdah: "q11"
     * kq_task_id: "818b5cef"
     * latitude: 32.06071
     * longitude: 118.76295
     * teachtaskid: "44cd79ee"
     *
     * 算上距离 在不在范围内
     * 时间判断
     * 暗号判断
     *
     * 如果是参数中有wifi的信息 说明是第二种方式 需要比对bssid
     *
     * @param datamap
     * @param token
     * @return
     */
    @Override
    public HashMap KqDk(Map datamap, String token) {
        Kqinfo kqinfo = new Kqinfo();
        HashMap<Integer,String> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        DecodedJWT verify = JWTUtils.verify(token);
        String userid = verify.getClaim("username").asString();
        System.out.println(data);

        String kq_task_id = (String) data.get("kq_task_id");
        Kq kq = kqMapper.selectByPrimaryKey(kq_task_id) ;
        if(kq == null){
            res.put(18000,"考勤失败！未找到此考勤任务信息~");
            return res;
        }
        //检查学生是否已经考勤过此考勤任务
        KqinfoExample kqinfoExample = new KqinfoExample();
        KqinfoExample.Criteria criteria  = kqinfoExample.createCriteria();
        criteria.andKqIdEqualTo(kq_task_id);
        criteria.andStudentIdEqualTo(userid);
        List<Kqinfo> listtmp = kqinfoMapper.selectByExample(kqinfoExample);

        if(listtmp != null && listtmp.size()!=0){
            res.put(18000,"您已经考勤过啦~");
            return res;
        }




        Integer kq_kind = (Integer) data.get("kq_kind");
        if(kq_kind == 2){
            String kq_wifiId = (String) data.get("kq_wifiId");
            String wifiId = kq.getKqWifiId();
            if(!wifiId.equals(kq_wifiId)){
                res.put(18000,"考勤失败！您未链接到考勤任务指定WIFI~");
                return res;
            }
        }



        String kqah = (String) data.get("kq_qdah");
        if(!(kq.getKqQdah().equals(kqah))){
            res.put(18000,"考勤失败！您输入的考勤暗号有误~");
            return res;
        }

        BigDecimal latitude1 = (BigDecimal) data.get("latitude");
        BigDecimal longitude1 = (BigDecimal) data.get("longitude");
        BigDecimal latitude2 = kq.getKqLatitude();
        BigDecimal longitude2 = kq.getKqLongitude();
        Double distance = DistanceUtil.getDistance(
                longitude1.doubleValue(),
                latitude1.doubleValue(),
                longitude2.doubleValue() ,
                latitude2.doubleValue()
        );
        if(distance > kq.getKqFw()){
            res.put(18000,"考勤失败！您当前位置距考勤任务距离为"+distance+"米，已超出考勤任务"+kq.getKqFw()+"米的规定范围~");
            return res;
        }


        kqinfo.setKqinfoId(UUID.randomUUID().toString().substring(0,8));
        kqinfo.setStudentId(verify.getClaim("username").asString());
        kqinfo.setKqId((String) data.get("kq_task_id"));
        kqinfo.setTeachtaskId((String) data.get("teachtaskid"));
        try {
            Date sd1 = kq.getKqStopTime();
            Date sd2 = DateUtil.getDateWithStr((String) data.get("kq_Time"));
            if(sd2.after(sd1)){
                kqinfo.setKqinfoRes(1);
                res.put(18000,"考勤成功！但您已超出任务规定打卡时间！");
            }else{
                //（正常0 迟到1 旷课2 早退3）
                kqinfo.setKqinfoRes(0);
            }
            kqinfo.setKqinfoTime(sd2);
        } catch (ParseException e) {
            e.printStackTrace();
            log.error("方法：定位考勤。当前时间通过格式化失败");
        }


        try{
            int ress = kqinfoMapper.insertSelective(kqinfo);
            if(ress >= 1){
                //学生XX 已完成您发布的课程XXX的考勤任务 （任务编号：XXX，时间：XXX）
                HashMap h = new HashMap();
                h.put("kq_task_id" , (String) data.get("kq_task_id") );
                Student s = studentMapper.selectByPrimaryKey(userid);
                h.put("studentName" ,s.getStudentName()) ;
                h.put("studentid" , userid) ;
                Teachtask t = teachtaskMapper.selectByPrimaryKey((String) data.get("teachtaskid"));
                Course c = courseMapper.selectByPrimaryKey(t.getCourseId());
                h.put("courseName" ,c.getCourseName()) ;
                h.put("kq_Time" , (String) data.get("kq_Time")) ;

                if(res.get(18000) == null){
                    res.put(20000,"定位考勤成功！");
                    h.put("isLater" , false);
                }else{
                    h.put("isLater" , true); //迟到
                }
                Kq k = kqMapper.selectByPrimaryKey((String) data.get("kq_task_id"));
                tipService.createTip(k.getTeacherId(), 14 , h);
            } else{
                res.put(18000,"考勤失败！服务器内部错误！考勤但没完全考勤");
            }
            return res;
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"考勤失败！服务器内部错误！");
            return res;
        }

    }

    @Override
    public HashMap getKqTaskList(Map datamap, String token) {


        HashMap<Integer,Object> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));
        DecodedJWT verify = JWTUtils.verify(token);
        System.out.println(data);
        String teachtaskid = (String) data.get("teachtaskid");

        KqExample kqExample = new KqExample();
        kqExample.setOrderByClause("kq_time DESC");
        KqExample.Criteria criteria  = kqExample.createCriteria();
        criteria.andTeachtaskIdEqualTo(teachtaskid);

        try {
            List<Kq> kqList = kqMapper.selectByExample(kqExample);
            if (kqList == null) {
                res.put(18000, "获取考勤任务列表失败！未找到此考勤任务列表信息~");
                return res;
            }else{
                res.put(20000, kqList );
                return res;
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("方法：获取考勤任务列表失败");
            res.put(18000, "获取考勤任务列表失败！未找到此考勤任务列表信息~");
            return res;
        }


    }
}
