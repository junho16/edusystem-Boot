package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.*;
import com.edusystem.mapper.*;
import com.edusystem.service.ClassplanService;
import com.edusystem.util.JWTUtils;
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

    @Override
    public HashMap zdpk(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        Integer year = (Integer) data.get("year");
        Integer term = (Integer) data.get("term");

        if(year == null || term == null){
            res.put(18000,"错误，参数缺失，请选择学年月学期！");
            return res;
        }else{
            log.info("方法：排课。查询学年为{}的教学任务", year);
            log.info("方法：排课。查询学期为{}的教学任务", term);
        }

        ArrayList<Classplan> arrayList = new ArrayList();

        TeachtaskExample example = new TeachtaskExample();
        TeachtaskExample.Criteria criteria = example.createCriteria();
        criteria.andTeacherIdIsNotNull();
        criteria.andTeachtaskAcademictermEqualTo(term);
        criteria.andTeachtaskAcademicyearEqualTo(year);

        //查出有哪些课程是此学年 此学期的
        ArrayList<Teachtask> teachtasks = (ArrayList) teachtaskMapper.selectByExample(example);



        ClassroomExample classroomExample = new ClassroomExample();
        ClassroomExample.Criteria classCriteria = classroomExample.createCriteria();
        classCriteria.andClassroomIdIsNotNull();
        //查出有哪些教室
        ArrayList<Classroom> classrooms = (ArrayList) classroomMapper.selectByExample(classroomExample);



        for(int t = 0 ; t < teachtasks.size() ;t++){
            //针对每一个教学任务 先随机20次 如果20次的随机值都有课程安排 则开始全部遍历
            int num = 20;
            boolean needFindAll = true;
            while (num-- != 0){
                int day = (int)( 1 + Math.random() * (5 - 1 + 1));
                int classnum = (int)( 1 + Math.random() * (4 - 1 + 1));
                int classroomid = (int)( 1 + Math.random() * (classrooms.size()-1 - 0 + 1));
                ClassplanExample classplanExample = new ClassplanExample();
                ClassplanExample.Criteria classrplanCriteria = classplanExample.createCriteria();
                classrplanCriteria.andClassplanYaerEqualTo(year);
                classrplanCriteria.andClassplanTermEqualTo(term);

                classrplanCriteria.andClassplanDayEqualTo(day);
                classrplanCriteria.andClassplanClassnumEqualTo(classnum);
                classrplanCriteria.andClassroomIdEqualTo(classrooms.get(classroomid).getClassroomId());

                ArrayList<Classplan> tmp = (ArrayList) classplanMapper.selectByExample(classplanExample);

                if(tmp.size() >= 1 ) {
                    continue;
                } else {
                    //可以插入一条数据（排一门课）
                    //加入一下arrayList
                    Classplan classplan = new Classplan();
                    classplan.setClassplanId(UUID.randomUUID().toString().substring(0, 8));
                    classplan.setTeachtaskId(teachtasks.get(t).getTeachtaskId());
                    classplan.setClassroomId(classrooms.get(classroomid).getClassroomId());

                    classplan.setClassplanClassnum(classnum);
                    classplan.setClassplanDay(day);
                    classplan.setClassplanYaer(year);
                    classplan.setClassplanTerm(term);


                    classplanMapper.insertSelective(classplan);

                    arrayList.add(classplan);
                    needFindAll = false;
                    break;
                }
            }

            if(needFindAll){
                boolean flag = false;
                for(int i = 1 ; i <= 5 ; i ++ ){
                    for(int j = 1 ; j <= 4 ; j++ ){
                        for(int c = 0 ; c < classrooms.size() ; c++){
                            ClassplanExample classplanExample = new ClassplanExample();
                            ClassplanExample.Criteria classrplanCriteria = classplanExample.createCriteria();
                            classrplanCriteria.andClassplanYaerEqualTo(year);
                            classrplanCriteria.andClassplanTermEqualTo(term);

                            classrplanCriteria.andClassplanDayEqualTo(i);
                            classrplanCriteria.andClassplanClassnumEqualTo(j);
                            classrplanCriteria.andClassroomIdEqualTo(classrooms.get(c).getClassroomId());

                            ArrayList<Classplan> tmp = (ArrayList) classplanMapper.selectByExample(classplanExample);

                            if(tmp.size() >= 1 ) continue;
                            else{
                                //可以插入一条数据（排一门课）
                                //加入一下arrayList
                                Classplan classplan = new Classplan();
                                classplan.setClassplanId(UUID.randomUUID().toString().substring(0,8));
                                classplan.setTeachtaskId(teachtasks.get(t).getTeachtaskId());
                                classplan.setClassroomId(classrooms.get(c).getClassroomId());

                                classplan.setClassplanClassnum(j);
                                classplan.setClassplanDay(i);
                                classplan.setClassplanYaer(year);
                                classplan.setClassplanTerm(term);


                                classplanMapper.insertSelective(classplan);

                                arrayList.add(classplan);
                                if(arrayList.size() == teachtasks.size()){
                                    // 排够了
                                    flag = true;
                                    break;
                                }
                            }
                        }
                        if(flag) break;
                    }
                    if(flag) break;
                }
            }

        }


        if(arrayList.size() == teachtasks.size()){
            res.put(20000,arrayList);
        }else{
            res.put(18000,"排课失败，教室已被排满！");
        }
        return res;

    }

    @Override
    public HashMap fetchClassPlan(Map datamap, String token) {
        HashMap<Integer, Object> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        Integer year = (Integer) data.get("teachtaskAcademicyear");
        Integer term = (Integer) data.get("teachtaskAcademicterm");

        if(year == null || term == null){
            res.put(18000,"错误，参数缺失，请选择学年月学期！");
            return res;
        }else{
            log.info("方法：获取指定学年、学期下的课表安排。查询学年为{}的课表信息", year);
            log.info("方法：获取指定学年、学期下的课表安排。查询学期为{}的课表信息", term);
        }

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
            for (Classplan c : classplans) {
                Classroom room = classroomMapper.selectByPrimaryKey(c.getClassroomId());
                Teachtask task = teachtaskMapper.selectByPrimaryKey(c.getTeachtaskId());
                Teacher teacher = teacherMapper.selectByPrimaryKey(task.getTeacherId());
                Course course  = courseMapper.selectByPrimaryKey(task.getCourseId());

                String classid  = task.getClassId();
                String professionName = task.getProfessionName();
                Integer startTime = task.getTeachtaskStarttime();
                Integer endTime = task.getTeachtaskEndtime();
            }


            //        if(arrayList.size() == teachtasks.size()){
//            res.put(20000,arrayList);
//        }else{
//            res.put(18000,"排课失败，教室已被排满！");
//        }
            return res;
        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"获取指定学年、学期下的课表安排失败，内部错误！");
            return res;
        }





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

