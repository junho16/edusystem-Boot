package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.*;
import com.edusystem.entity.Class;
import com.edusystem.mapper.*;
import com.edusystem.service.ClassplanService;
import com.edusystem.util.JWTUtils;
import com.edusystem.util.ga.MyGa;
import com.edusystem.util.ga.Schedule;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 花菜
 * @date 2021/5/5 20:03
 */
@Service
@Slf4j
public class ClassplanServiceImpl implements ClassplanService {

    @Autowired
    TeachtaskMapper teachtaskMapper;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    ClassroomMapper classroomMapper;

    @Autowired
    ClassplanMapper classplanMapper;

    @Autowired
    ClsandstuMapper clsandstuMapper;

    @Override
    public HashMap zdpk(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

//        Integer year = (Integer) data.get("year");
//        Integer term = (Integer) data.get("term");
//        if(year == null || term == null){
//            res.put(18000,"错误，参数缺失，请选择学年月学期！");
//            return res;
//        }else{
//            log.info("方法：排课。查询学年为{}的教学任务", year);
//            log.info("方法：排课。查询学期为{}的教学任务", term);
//        }
        Integer year = 0;
        Integer term = 0;
        String teachtaskAcademicyear = (String) data.get("teachtaskAcademicyear");
        if (!(teachtaskAcademicyear == null || teachtaskAcademicyear.equals(""))) {
            log.info("方法： 删除指定学年、学期下的课表安排。查询学年为{}的教学任务", teachtaskAcademicyear);
            year = (Integer.parseInt(teachtaskAcademicyear));
        }
        String teachtaskAcademicterm = (String) data.get("teachtaskAcademicterm");
        if (!(teachtaskAcademicterm == null || teachtaskAcademicterm.equals(""))) {
            log.info("方法：删除指定学年、学期下的课表安排。查询学期为{}的教学任务", teachtaskAcademicterm);
            term = (Integer.parseInt(teachtaskAcademicterm));
        }


        ClassplanExample classplanExample2 = new ClassplanExample();
        ClassplanExample.Criteria classrplanCriteria2 = classplanExample2.createCriteria();
        classrplanCriteria2.andClassplanYaerEqualTo(year);
        classrplanCriteria2.andClassplanTermEqualTo(term);
        List<Classplan> classplans = classplanMapper.selectByExample(classplanExample2);
        if(classplans != null && classplans.size() != 0){
            res.put(20000,"此学年、学期已经排过课 ！");
            return res;
        }

        ArrayList<Classplan> arrayList = new ArrayList();

        TeachtaskExample example = new TeachtaskExample();
        TeachtaskExample.Criteria criteria = example.createCriteria();
        criteria.andTeacherIdIsNotNull();
        criteria.andTeachtaskAcademictermEqualTo(term);
        criteria.andTeachtaskAcademicyearEqualTo(year);

        //查出有哪些课程是此学年 此学期的
        ArrayList<Teachtask> teachtasksTmp = (ArrayList) teachtaskMapper.selectByExample(example);

        ArrayList<Teachtask> teachtasks = new ArrayList();
        //更新-如果一个教学任务说明了其一周上几节课 就给其一周布置几节课
        for(Teachtask t : teachtasksTmp){
            int num = t.getTeachtaskNumlimit();
            for(int i = 0 ; i < num ;i++ ){
                teachtasks.add(t);
            }
        }

        ClassroomExample classroomExample = new ClassroomExample();
        ClassroomExample.Criteria classCriteria = classroomExample.createCriteria();
        classCriteria.andClassroomIdIsNotNull();
        //查出有哪些教室
        ArrayList<Classroom> classrooms = (ArrayList) classroomMapper.selectByExample(classroomExample);



//        for(int t = 0 ; t < teachtasks.size() ;t++){
//            //针对每一个教学任务 先随机20次 如果20次的随机值都有课程安排 则开始全部遍历
//            int num = 20;
//            boolean needFindAll = true;
//            while (num-- != 0){
//                int day = (int)( 1 + Math.random() * (5 - 1 + 1));
//                int classnum = (int)( 1 + Math.random() * (4 - 1 + 1));
//                int classroomid = (int)( 1 + Math.random() * (classrooms.size()-1 - 0 + 0));
//                ClassplanExample classplanExample = new ClassplanExample();
//                ClassplanExample.Criteria classrplanCriteria = classplanExample.createCriteria();
//                classrplanCriteria.andClassplanYaerEqualTo(year);
//                classrplanCriteria.andClassplanTermEqualTo(term);
//
//                classrplanCriteria.andClassplanDayEqualTo(day);
//                classrplanCriteria.andClassplanClassnumEqualTo(classnum);
//                classrplanCriteria.andClassroomIdEqualTo(classrooms.get(classroomid).getClassroomId());
//
//                ArrayList<Classplan> tmp = (ArrayList) classplanMapper.selectByExample(classplanExample);
//
//                if(tmp.size() >= 1 ) {
//                    continue;
//                } else {
//                    //可以插入一条数据（排一门课）
//                    //加入一下arrayList
//                    Classplan classplan = new Classplan();
//                    classplan.setClassplanId(UUID.randomUUID().toString().substring(0, 8));
//                    classplan.setTeachtaskId(teachtasks.get(t).getTeachtaskId());
//                    classplan.setClassroomId(classrooms.get(classroomid).getClassroomId());
//
//                    classplan.setClassplanClassnum(classnum);
//                    classplan.setClassplanDay(day);
//                    classplan.setClassplanYaer(year);
//                    classplan.setClassplanTerm(term);
//
//
//                    classplanMapper.insertSelective(classplan);
//
//                    arrayList.add(classplan);
//                    needFindAll = false;
//                    break;
//                }
//            }
//
//            if(needFindAll){
//                boolean flag = false;
//                for(int i = 1 ; i <= 5 ; i ++ ){
//                    for(int j = 1 ; j <= 4 ; j++ ){
//                        for(int c = 0 ; c < classrooms.size() ; c++){
//                            ClassplanExample classplanExample = new ClassplanExample();
//                            ClassplanExample.Criteria classrplanCriteria = classplanExample.createCriteria();
//                            classrplanCriteria.andClassplanYaerEqualTo(year);
//                            classrplanCriteria.andClassplanTermEqualTo(term);
//
//                            classrplanCriteria.andClassplanDayEqualTo(i);
//                            classrplanCriteria.andClassplanClassnumEqualTo(j);
//                            classrplanCriteria.andClassroomIdEqualTo(classrooms.get(c).getClassroomId());
//
//                            ArrayList<Classplan> tmp = (ArrayList) classplanMapper.selectByExample(classplanExample);
//
//                            if(tmp.size() >= 1 ) continue;
//                            else{
//                                //可以插入一条数据（排一门课）
//                                //加入一下arrayList
//                                Classplan classplan = new Classplan();
//                                classplan.setClassplanId(UUID.randomUUID().toString().substring(0,8));
//                                classplan.setTeachtaskId(teachtasks.get(t).getTeachtaskId());
//                                classplan.setClassroomId(classrooms.get(c).getClassroomId());
//
//                                classplan.setClassplanClassnum(j);
//                                classplan.setClassplanDay(i);
//                                classplan.setClassplanYaer(year);
//                                classplan.setClassplanTerm(term);
//
//
//                                classplanMapper.insertSelective(classplan);
//
//                                arrayList.add(classplan);
//                                if(arrayList.size() == teachtasks.size()){
//                                    // 排够了
//                                    flag = true;
//                                    break;
//                                }
//                            }
//                        }
//                        if(flag) break;
//                    }
//                    if(flag) break;
//                }
//            }
//
//        }

        ArrayList<String> classroomidlist = new ArrayList<>();
        for(Classroom c : classrooms){
            classroomidlist.add(c.getClassroomId());
        }
        ArrayList<Schedule> schedules = new ArrayList<>();
        for(Teachtask t : teachtasks){
            schedules.add(new Schedule( t.getTeachtaskId() ));
        }

        MyGa myGa = new MyGa();
        List<Schedule> resSchedule = myGa.evolution(schedules,classroomidlist);

        if(resSchedule == null || resSchedule.size()==0){
            res.put(18000,"排课失败，硬件条件不允许此次排课！");
            return res;
        }else{
            try{
                for(Schedule s: resSchedule){
                System.out.println(s);
                    Classplan classplan = new Classplan(
                            UUID.randomUUID().toString().substring(0,8),
                            s.getTeachtaskid(),
                            s.getClassroomid(),
                            s.getSlot(),
                            s.getWeekday(),
                            year,
                            term
                    );
                    classplanMapper.insertSelective(classplan);
                    arrayList.add(classplan);
                }
                res.put(20000,arrayList);
                return res;
            }catch (Exception e){
                e.printStackTrace();
                res.put(18000,"排课失败，内部错误！");
                return res;
            }
        }

//        if(arrayList.size() == teachtasks.size()){
//            res.put(20000,arrayList);
//        }else{
//            res.put(18000,"排课失败，教室已被排满！");
//        }
    }

    @Override
    public HashMap repk(Map datamap, String token) {

        HashMap<Integer, Object> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        ClassplanExample classplanExample = new ClassplanExample();
        ClassplanExample.Criteria classrplanCriteria = classplanExample.createCriteria();

        String teachtaskAcademicyear = (String) data.get("teachtaskAcademicyear");
        if (!(teachtaskAcademicyear == null || teachtaskAcademicyear.equals(""))) {
            log.info("方法： 删除指定学年、学期下的课表安排。查询学年为{}的教学任务", teachtaskAcademicyear);
            classrplanCriteria.andClassplanYaerEqualTo(Integer.parseInt(teachtaskAcademicyear));
        }

        String teachtaskAcademicterm = (String) data.get("teachtaskAcademicterm");
        if (!(teachtaskAcademicterm == null || teachtaskAcademicterm.equals(""))) {
            log.info("方法：删除指定学年、学期下的课表安排。查询学期为{}的教学任务", teachtaskAcademicterm);
            classrplanCriteria.andClassplanTermEqualTo(Integer.parseInt(teachtaskAcademicterm));
        }
        try{
            classplanMapper.deleteByExample(classplanExample);
            Map resmap = (Map) zdpk( datamap,  token);
            return (HashMap) resmap;
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"重新排课失败 ，内部错误！");
            return res;
        }

    }

    @Override
    public HashMap fetchClassPlan(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

//        Integer year = (Integer) data.get("teachtaskAcademicyear");
//        Integer term = (Integer) data.get("teachtaskAcademicterm");
//
//        if(year == null || term == null){
//            res.put(18000,"错误，参数缺失，请选择学年月学期！");
//            return res;
//        }else{
//            log.info("方法：获取指定学年、学期下的课表安排。查询学年为{}的课表信息", year);
//            log.info("方法：获取指定学年、学期下的课表安排。查询学期为{}的课表信息", term);
//        }

        try {
            ClassplanExample classplanExample = new ClassplanExample();
            ClassplanExample.Criteria criteria = classplanExample.createCriteria();


            String teachtaskAcademicyear = (String) data.get("teachtaskAcademicyear");
            if (!(teachtaskAcademicyear == null || teachtaskAcademicyear.equals(""))) {
                log.info("方法：获取指定学年、学期下的课表安排。查询学年为{}的教学任务", teachtaskAcademicyear);
                criteria.andClassplanYaerEqualTo(Integer.parseInt(teachtaskAcademicyear));
            }

            String teachtaskAcademicterm = (String) data.get("teachtaskAcademicterm");
            if (!(teachtaskAcademicterm == null || teachtaskAcademicterm.equals(""))) {
                log.info("方法：获取指定学年、学期下的课表安排。查询学期为{}的教学任务", teachtaskAcademicterm);
                criteria.andClassplanTermEqualTo(Integer.parseInt(teachtaskAcademicterm));
            }

            List<Classplan> classplans = classplanMapper.selectByExample(classplanExample);
            if(classplans == null || classplans.size() == 0){
                res.put(18000,"此学年、学期还未排课 ！");
                return res;
            }
            for (Classplan c : classplans) {
                Classroom room = classroomMapper.selectByPrimaryKey(c.getClassroomId());
                Teachtask task = teachtaskMapper.selectByPrimaryKey(c.getTeachtaskId());
                Teacher teacher = teacherMapper.selectByPrimaryKey(task.getTeacherId());
                Course course  = courseMapper.selectByPrimaryKey(task.getCourseId());

                String classid  = task.getClassId();
                String professionName = task.getProfessionName();
                Integer startTime = task.getTeachtaskStarttime();
                Integer endTime = task.getTeachtaskEndtime();


                c.setCourseName(course.getCourseName());
                c.setClassroomId(room.getClassroomId());
                c.setClassroomName(room.getClassroomName()+"-"+room.getClassroomKind());
                c.setTeacherId(teacher.getTeacherId());
                c.setTeacherName(teacher.getTeacherName());

                c.setClassid(classid);
                c.setProfessionName(professionName);
                c.setStartTime(startTime);
                c.setEndTime(endTime);

            }
            res.put(20000,classplans);
            return res;


        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"获取指定学年、学期下的课表安排失败，内部错误！");
            return res;
        }





    }

    @Override
    public HashMap updateClassPlan(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        try {


//            ===================================================
            ClassplanExample classplanExample = new ClassplanExample();
            ClassplanExample.Criteria criteria = classplanExample.createCriteria();

            String from_teachtaskAcademicyear = (String) data.get("from_teachtaskAcademicyear");
            if (!(from_teachtaskAcademicyear == null || from_teachtaskAcademicyear.equals(""))) {
                log.info("方法：人工手动换课。1 查询学年为{}的教学任务", from_teachtaskAcademicyear);
                criteria.andClassplanYaerEqualTo(Integer.parseInt(from_teachtaskAcademicyear));
            }

            String from_teachtaskAcademicterm = (String) data.get("from_teachtaskAcademicterm");
            if (!(from_teachtaskAcademicterm == null || from_teachtaskAcademicterm.equals(""))) {
                log.info("方法：人工手动换课。1 查询学期为{}的教学任务", from_teachtaskAcademicterm);
                criteria.andClassplanTermEqualTo(Integer.parseInt(from_teachtaskAcademicterm));
            }

            Integer from_day = (Integer) data.get("from_day");
            log.info("方法：人工手动换课。1 查询工作日为{}的教学任务", from_day);
            criteria.andClassplanDayEqualTo(from_day);


            Integer from_jc = (Integer) data.get("from_jc");
            log.info("方法：人工手动换课。1 查询节次为{}的教学任务", from_jc);
            criteria.andClassplanClassnumEqualTo(from_jc);

            List<Classplan> c1 = classplanMapper.selectByExample(classplanExample);
//            ===================================================

            ClassplanExample classplanExample2 = new ClassplanExample();
            ClassplanExample.Criteria criteria2 = classplanExample2.createCriteria();


            String to_teachtaskAcademicyear = (String) data.get("to_teachtaskAcademicyear");
            if (!(to_teachtaskAcademicyear == null || to_teachtaskAcademicyear.equals(""))) {
                log.info("方法：人工手动换课。2 查询学年为{}的教学任务", to_teachtaskAcademicyear);
                criteria2.andClassplanYaerEqualTo(Integer.parseInt(to_teachtaskAcademicyear));
            }

            String to_teachtaskAcademicterm = (String) data.get("to_teachtaskAcademicterm");
            if (!(to_teachtaskAcademicterm == null || to_teachtaskAcademicterm.equals(""))) {
                log.info("方法：人工手动换课。2 查询学期为{}的教学任务", to_teachtaskAcademicterm);
                criteria2.andClassplanTermEqualTo(Integer.parseInt(to_teachtaskAcademicterm));
            }

            Integer to_day = (Integer) data.get("to_day");
            log.info("方法：人工手动换课。2 查询工作日为{}的教学任务", to_day);
            criteria2.andClassplanDayEqualTo(to_day);


            Integer to_jc = (Integer) data.get("to_jc");
            log.info("方法：人工手动换课。2 查询节次为{}的教学任务", to_jc);
            criteria2.andClassplanClassnumEqualTo(to_jc);

            List<Classplan> c2 = classplanMapper.selectByExample(classplanExample2);
//            ===================================================

            if(c1.size() == 0 || c2.size() == 0 || c1 == null || c2 == null){
                res.put(18000,"未找到符合您的换课条件的课程编排信息，请检查需要对换的课程信息。！");
                return res;
            }else{
                try{
                    Classplan cplan1 = c1.get(0);
                    cplan1.setClassplanYaer(Integer.parseInt(to_teachtaskAcademicyear));
                    cplan1.setClassplanTerm(Integer.parseInt(to_teachtaskAcademicterm));
                    cplan1.setClassplanDay(to_day);
                    cplan1.setClassplanClassnum(to_jc);

                    Classplan cplan2 = c2.get(0);
                    cplan2.setClassplanYaer(Integer.parseInt(from_teachtaskAcademicyear));
                    cplan2.setClassplanTerm(Integer.parseInt(from_teachtaskAcademicterm));
                    cplan2.setClassplanDay(from_day);
                    cplan2.setClassplanClassnum(from_jc);

                    classplanMapper.updateByPrimaryKeySelective(cplan1);
                    classplanMapper.updateByPrimaryKeySelective(cplan2);

                    res.put(20000,"课程编排信息对换成功！");
                    return res;

                }catch (Exception e){
                    e.printStackTrace();
                    res.put(18000,"课程编排信息对换失败！内部错误！");
                    return res;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"人工手动换课失败，内部错误！");
            return res;
        }
    }

    @Override
    public HashMap fetchClassPlanWithRole(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        if(loginrole.equals("teacher")){
            try {
                ArrayList<Classplan> reslist = new ArrayList();

                TeachtaskExample teachtaskExample = new TeachtaskExample();
                TeachtaskExample.Criteria taskcriteria = teachtaskExample.createCriteria();
                taskcriteria.andTeacherIdEqualTo(username);
                taskcriteria.andTeachtaskAcademicyearEqualTo(Integer.parseInt((String) data.get("teachtaskAcademicyear")));
                taskcriteria.andTeachtaskAcademictermEqualTo(Integer.parseInt((String) data.get("teachtaskAcademicterm")));

                List<Teachtask> taskes = teachtaskMapper.selectByExample(teachtaskExample);
                for(Teachtask t : taskes){
                    ClassplanExample classplanExample = new ClassplanExample();
                    ClassplanExample.Criteria criteria = classplanExample.createCriteria();
                    criteria.andTeachtaskIdEqualTo(t.getTeachtaskId());
                    List<Classplan> classplans = classplanMapper.selectByExample(classplanExample);
                    reslist.addAll(classplans);
                }

                if(reslist == null || reslist.size() == 0){
                    res.put(18000,"此学年、学期下，您课程编排记录为空 ！");
                    return res;
                }else{
                    for (Classplan c : reslist) {
                        Classroom room = classroomMapper.selectByPrimaryKey(c.getClassroomId());
                        Teachtask task = teachtaskMapper.selectByPrimaryKey(c.getTeachtaskId());
                        Teacher teacher = teacherMapper.selectByPrimaryKey(task.getTeacherId());
                        Course course  = courseMapper.selectByPrimaryKey(task.getCourseId());

                        String classid  = task.getClassId();
                        String professionName = task.getProfessionName();
                        Integer startTime = task.getTeachtaskStarttime();
                        Integer endTime = task.getTeachtaskEndtime();


                        c.setCourseName(course.getCourseName());
                        c.setClassroomId(room.getClassroomId());
                        c.setClassroomName(room.getClassroomName()+"-"+room.getClassroomKind());
                        c.setTeacherId(teacher.getTeacherId());
                        c.setTeacherName(teacher.getTeacherName());

                        c.setClassid(classid);
                        c.setProfessionName(professionName);
                        c.setStartTime(startTime);
                        c.setEndTime(endTime);

                    }
                    res.put(20000,reslist);
                    return res;
                }

            }catch (Exception e){
                e.printStackTrace();
                res.put(18000,"角色:教师。获取指定学年、学期下的课表安排失败，内部错误！");
                return res;
            }

        }
        else if(loginrole.equals("student")){
            try {
                ArrayList<Classplan> reslist = new ArrayList();

                ClsandstuExample clsandstuExample = new ClsandstuExample();
                ClsandstuExample.Criteria clacriteria = clsandstuExample.createCriteria();
                clacriteria.andStudentIdEqualTo(username);

                List<Clsandstu> clsandstus = clsandstuMapper.selectByExample(clsandstuExample);

                for(Clsandstu cas : clsandstus){
                    if(cas.getTeachtaskId().startsWith("0-")){
                        //网课
                        String id= cas.getTeachtaskId().substring(2);

                        TeachtaskExample teachtaskExample = new TeachtaskExample();
                        TeachtaskExample.Criteria taskcriteria = teachtaskExample.createCriteria();
                        taskcriteria.andTeachtaskIdEqualTo(id);
                        taskcriteria.andTeachtaskAcademicyearEqualTo(Integer.parseInt((String) data.get("teachtaskAcademicyear")));
                        taskcriteria.andTeachtaskAcademictermEqualTo(Integer.parseInt((String) data.get("teachtaskAcademicterm")));
                        if(teachtaskMapper.selectByExample(teachtaskExample).size() >= 0){
                            ClassplanExample classplanExample = new ClassplanExample();
                            ClassplanExample.Criteria criteria = classplanExample.createCriteria();
                            criteria.andTeachtaskIdEqualTo(id);
                            criteria.andClassplanYaerEqualTo(Integer.parseInt((String) data.get("teachtaskAcademicyear")));
                            criteria.andClassplanTermEqualTo(Integer.parseInt((String) data.get("teachtaskAcademicterm")));
                            List<Classplan> classplans = classplanMapper.selectByExample(classplanExample);
                            reslist.addAll(classplans);
                        }
                    }else{
                        //非网课
                        TeachtaskExample teachtaskExample = new TeachtaskExample();
                        TeachtaskExample.Criteria taskcriteria = teachtaskExample.createCriteria();
                        taskcriteria.andTeachtaskIdEqualTo(cas.getTeachtaskId());
                        taskcriteria.andTeachtaskAcademicyearEqualTo(Integer.parseInt((String) data.get("teachtaskAcademicyear")));
                        taskcriteria.andTeachtaskAcademictermEqualTo(Integer.parseInt((String) data.get("teachtaskAcademicterm")));
                        if(teachtaskMapper.selectByExample(teachtaskExample).size() >= 0){
                            ClassplanExample classplanExample = new ClassplanExample();
                            ClassplanExample.Criteria criteria = classplanExample.createCriteria();
                            criteria.andTeachtaskIdEqualTo(cas.getTeachtaskId());
                            criteria.andClassplanYaerEqualTo(Integer.parseInt((String) data.get("teachtaskAcademicyear")));
                            criteria.andClassplanTermEqualTo(Integer.parseInt((String) data.get("teachtaskAcademicterm")));
                            List<Classplan> classplans = classplanMapper.selectByExample(classplanExample);
                            reslist.addAll(classplans);
                        }

                    }
                }

                if(reslist == null || reslist.size() == 0){
                    res.put(18000,"此学年、学期下，您课程编排记录为空 ！");
                    return res;
                }else{
                    for (Classplan c : reslist) {
                        Classroom room = classroomMapper.selectByPrimaryKey(c.getClassroomId());
                        Teachtask task = teachtaskMapper.selectByPrimaryKey(c.getTeachtaskId());
                        Teacher teacher = teacherMapper.selectByPrimaryKey(task.getTeacherId());
                        Course course  = courseMapper.selectByPrimaryKey(task.getCourseId());

                        String classid  = task.getClassId();
                        String professionName = task.getProfessionName();
                        Integer startTime = task.getTeachtaskStarttime();
                        Integer endTime = task.getTeachtaskEndtime();


                        c.setCourseName(course.getCourseName());
                        c.setClassroomId(room.getClassroomId());
                        c.setClassroomName(room.getClassroomName()+"-"+room.getClassroomKind());
                        c.setTeacherId(teacher.getTeacherId());
                        c.setTeacherName(teacher.getTeacherName());

                        c.setClassid(classid);
                        c.setProfessionName(professionName);
                        c.setStartTime(startTime);
                        c.setEndTime(endTime);

                    }
                    res.put(20000,reslist);
                    return res;
                }

            }catch (Exception e){
                e.printStackTrace();
                res.put(18000,"角色:学生。获取指定学年、学期下的课表安排失败，内部错误！");
                return res;
            }

        }
        return null;




    }


}
//  版本一： 全部遍历一遍
//        boolean flag = false;
//        for(int t = 0 ; t < teachtasks.size() ;t++){
//            for(int i = 1 ; i <= 5 ; i ++ ){
//                for(int j = 1 ; j <= 4 ; j++ ){
//                    for(int c = 0 ; c < classrooms.size() ; c++){
//                        ClassplanExample classplanExample = new ClassplanExample();
//                        ClassplanExample.Criteria classrplanCriteria = classplanExample.createCriteria();
//                        classrplanCriteria.andClassplanYaerEqualTo(year);
//                        classrplanCriteria.andClassplanTermEqualTo(term);
//
//                        classrplanCriteria.andClassplanDayEqualTo(i);
//                        classrplanCriteria.andClassplanClassnumEqualTo(j);
//                        classrplanCriteria.andClassroomIdEqualTo(classrooms.get(c).getClassroomId());
//
//                        ArrayList<Classplan> tmp = (ArrayList) classplanMapper.selectByExample(classplanExample);
//
//                        if(tmp.size() >= 1 ) continue;
//                        else{
//                            //可以插入一条数据（排一门课）
//                            //加入一下arrayList
//                            Classplan classplan = new Classplan();
//                            classplan.setClassplanId(UUID.randomUUID().toString().substring(0,8));
//                            classplan.setTeachtaskId(teachtasks.get(t).getTeachtaskId());
//                            classplan.setClassroomId(classrooms.get(c).getClassroomId());
//
//                            classplan.setClassplanClassnum(j);
//                            classplan.setClassplanDay(i);
//                            classplan.setClassplanYaer(year);
//                            classplan.setClassplanTerm(term);
//                            System.out.println(classplan.toString());
//
//                            classplanMapper.insertSelective(classplan);
//
//                            arrayList.add(classplan);
//                            if(arrayList.size() == teachtasks.size()){
//                                // 排够了
//                                flag = true;
//                                break;
//                            }
//                        }
//                    }
//                    if(flag) break;
//                }
//                if(flag) break;
//            }
//            if(flag) break;
//        }

