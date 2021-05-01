package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.*;
import com.edusystem.entity.Class;
import com.edusystem.enums.GetEunm;
import com.edusystem.mapper.ByqxMapper;
import com.edusystem.mapper.ClassMapper;
import com.edusystem.mapper.StudentMapper;
import com.edusystem.mapper.SysadminMapper;
import com.edusystem.service.StudentService;
import com.edusystem.util.DateUtil;
import com.edusystem.util.JWTUtils;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 花菜
 * @date 2021/4/3 15:54
 */
@Slf4j
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    TipServiceImpl tipService;

    @Autowired
    ClassMapper classMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    SysadminMapper sysadminMapper;

    @Autowired
    ByqxMapper byqxMapper;

    /**
     * 根据角色获取其可视的学生列表信息
     * @return
     */
    @Override
    public HashMap getStudentListWithRole(int pageNum, int limit , Map query , String token) {
        JSONObject queryObj = JSONObject.parseObject((String) query.get("query"));
        HashMap hashMap = new HashMap();
        ArrayList res = new ArrayList();
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("获取用户信息==》账号: userId=>{}", username);
        log.info("获取用户信息==》角色: userrole=>{}", loginrole);
        log.info("查询第{}页", pageNum);
        log.info("查询1页{}项", limit);


        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
        studentCriteria.andStudentIdIsNotNull();
        /**
         * TODO-此处是bug --》 如果是教师或者是 管理员 第一次没有通过条件查询 查出的就是全部学生的信息了
          */

        String collegeid = (String) queryObj.get("collegeid");
        if( !(collegeid == null || collegeid.equals(""))) {
            log.info("方法：获取学生列表信息。查询学院id为{}下的学生", collegeid);
            studentCriteria.andCollegeIdEqualTo(collegeid);
        }

        String classid = (String) queryObj.get("classid");
        if( !(classid == null || classid.equals(""))  ){
            log.info("方法：获取学生列表信息。查询班级id为{}的学生", classid);
            studentCriteria.andClassIdEqualTo(classid);
        }
        String keyword = (String) queryObj.get("keyword");
        if( !(keyword == null || keyword.equals("")) ){
            log.info("方法：获取学生列表信息。查询课程关键字为{}的课程", keyword);
            studentCriteria.andStudentNameLike("%"+keyword+"%");
        }

        List<Student> studentList = studentMapper.selectByExample(studentExample);
        int total = studentList.size();

        PageHelper.startPage(pageNum, limit);
        studentList = studentMapper.selectByExample(studentExample);

        if (studentList == null) {
            log.info("方法：获取学生列表信息。未查询到学生列表信息");
            return null;
        } else {
            hashMap.put("total",total);
            hashMap.put("data", studentList);

        }
        return hashMap;
//        //角色可以是admin==》该学院同学 superadmin=》所有同学 teacher==》此教师带的学生
//        switch (loginrole){
//            case "teacher":{
//                ClassExample example = new ClassExample();
//                ClassExample.Criteria criteria  = example.createCriteria();
//                criteria.andTeacherIdEqualTo(username);
//                //查询出此教师教授的所有班级-->classWithThisTeacher
//                List<Class> classWithThisTeacher = classMapper.selectByExample(example);
//                if(classWithThisTeacher == null){
//                    return null;
//                }else{
//                    for(Class classItem : classWithThisTeacher ){
//                        HashMap hashMap = new HashMap();
//                        log.info("教师名为{}的教师教的班级id==》{}",username,classItem.getClassId());
//                        String class_id =  classItem.getClassId();
//                        StudentExample studentExample = new StudentExample();
//                        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
//                        studentCriteria.andClassIdEqualTo(class_id);
//
//                        //分页一下
//                        PageHelper.startPage(pageNum, limit);
//                        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);
//
//                        hashMap.put("total",studentsWithClassId.size());
//                        hashMap.put("data",studentsWithClassId);
//                        hashMap.put("classid",class_id);
//                        res.add(hashMap);
//                    }
//                }
//                return res;
//            }
//            case "admin":{
//
//                //查询出此管理员所在学院
//                Sysadmin sysadmin = sysadminMapper.selectByPrimaryKey(username);
//                log.info("学院管理员{}属于学院id为==》{}的学院",username,sysadmin.getCollegeId());
//
//                //查询出此管理员所在学院的所有班级-->classWithThisAdmin
//                ClassExample example = new ClassExample();
//                ClassExample.Criteria criteria  = example.createCriteria();
//                criteria.andCollegeIdEqualTo(sysadmin.getCollegeId());
//                List<Class> classWithThisAdmin = classMapper.selectByExample(example);
//
//                if(classWithThisAdmin == null){
//                    return null;
//                }else{
//                    for(Class classItem : classWithThisAdmin ){
//                        HashMap hashMap = new HashMap();
//                        log.info("学院id为{}下的班级id==》{}",sysadmin.getCollegeId(),classItem.getClassId());
//                        String class_id =  classItem.getClassId();
//                        StudentExample studentExample = new StudentExample();
//                        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
//                        studentCriteria.andClassIdEqualTo(class_id);
//
//                        //分页一下
//                        PageHelper.startPage(pageNum, limit);
//                        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);
//
//                        hashMap.put("total",studentsWithClassId.size());
//                        hashMap.put("data",studentsWithClassId);
//                        hashMap.put("classid",class_id);
//                        res.add(hashMap);
//                    }
//                }
//                return res;
//            }
//            case "superadmin":{
//
//                //查询出所在学院的所有班级-->classWithThisAdmin
//                ClassExample example = new ClassExample();
//                ClassExample.Criteria criteria  = example.createCriteria();
//                criteria.andClassIdIsNotNull();
//                List<Class> classWithThisAdmin = classMapper.selectByExample(example);
//                if(classWithThisAdmin == null){
//                    return null;
//                }else{
//                    for(Class classItem : classWithThisAdmin ){
//                        HashMap hashMap = new HashMap();
//                        log.info("超级管理员查询=》班级id为{}的班级", classItem.getClassId());
//                        String class_id =  classItem.getClassId();
//                        StudentExample studentExample = new StudentExample();
//                        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
//                        studentCriteria.andClassIdEqualTo(class_id);
//
//                        //分页一下
//                        PageHelper.startPage(pageNum, limit);
//                        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);
//
//                        hashMap.put("total",studentsWithClassId.size());
//                        hashMap.put("data",studentsWithClassId);
//                        hashMap.put("classid",class_id);
//                        res.add(hashMap);
//                    }
//                }
//                return res;
//
//            }
//            default:
//                throw new IllegalStateException("Unexpected value: " + loginrole);
//        }
    }

    /**
     * 更新学生信息
     * @param jsonObject
     * @param token
     * @return
     */
    @Override
    public boolean updateStudentInfo(JSONObject jsonObject, String token) {

        Student student = new Student();
        student.setStudentId( (String) jsonObject.get("studentId") );
        student.setStudentIdnumber( (String) jsonObject.get("studentIdnumber") );
        student.setCollegeId( (String) jsonObject.get("collegeId") );
        student.setClassId( (String) jsonObject.get("classId") );
        student.setStudentName( (String) jsonObject.get("studentName") );
        student.setStudentGender( (String) jsonObject.get("studentGender") );
        student.setStudentAge( (Integer) jsonObject.get("studentAge") );
        try {
            student.setStudentBirthday(DateUtil.getDateWithStr((String) jsonObject.get("studentBirthday")));
        } catch (ParseException e) {
            log.error("方法：更新学生信息。字符串转Date类型失败！");
            e.printStackTrace();
        }
        student.setStudentPsd(null);
        student.setStudentRoomid( (String) jsonObject.get("studentRoomid") );
        student.setStudentEthnic( (String) jsonObject.get("studentEthnic") );
        student.setStudentRxrq( (String) jsonObject.get("studentRxrq") );
        student.setStudentHometown( (String) jsonObject.get("studentHometown") );
        student.setStudentAddress( (String) jsonObject.get("studentAddress") );
        student.setStudentEmail( (String) jsonObject.get("studentEmail") );
        student.setStudentPhone( (String) jsonObject.get("studentPhone") );
        student.setStudentXgbz( Integer.parseInt((String) jsonObject.get("studentXgbz")) );
        student.setStudentPic( (String) jsonObject.get("studentPic") );

        int res = studentMapper.updateByPrimaryKeySelective(student);

        return res>=1? true:false;
    }

    /**
     * 新增学生信息
     * @param jsonObject
     * @param token
     * @return
     */
    @Override
    public HashMap<Integer,String> createStudentInfo(JSONObject jsonObject, String token) {
        /**
         * 返回值:
         * code msg
         * 18000错误
         * 20000正确
         */
        HashMap<Integer,String> res = new HashMap<>();
        Student student = new Student();
        student.setStudentId( (String) jsonObject.get("studentId") );
        Student stu = studentMapper.selectByPrimaryKey((String) jsonObject.get("studentId"));
        if(stu != null){
            res.put(18000,"此学号已被注册，请重新输入学号。");
            return res;
        }
        student.setStudentId( (String) jsonObject.get("studentId") );
        student.setStudentIdnumber( (String) jsonObject.get("studentIdnumber") );
        student.setCollegeId( (String) jsonObject.get("collegeId") );
        student.setClassId( (String) jsonObject.get("classId") );
        student.setStudentName( (String) jsonObject.get("studentName") );
        student.setStudentGender( (String) jsonObject.get("studentGender") );

        try {
//            student.setStudentAge( (Integer) jsonObject.get("studentAge") );
            student.setStudentAge(DateUtil.getAge(DateUtil.getDateWithStr((String) jsonObject.get("studentBirthday"))));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            student.setStudentBirthday(DateUtil.getDateWithStr((String) jsonObject.get("studentBirthday")));
        } catch (ParseException e) {
            log.error("方法：新增学生信息。字符串转Date类型失败！");
            e.printStackTrace();
        }

        //默认密码为学号
        student.setStudentPsd((String) jsonObject.get("studentId") );
        student.setStudentRoomid( (String) jsonObject.get("studentRoomid") );
        student.setStudentEthnic( (String) jsonObject.get("studentEthnic") );

        student.setStudentRxrq( (String) jsonObject.get("studentRxrq") );

        student.setStudentHometown( (String) jsonObject.get("studentHometown") );
        student.setStudentAddress( (String) jsonObject.get("studentAddress") );
        student.setStudentEmail( (String) jsonObject.get("studentEmail") );
        student.setStudentPhone( (String) jsonObject.get("studentPhone") );
        student.setStudentXgbz(
                (jsonObject.get("studentXgbz").equals("") || jsonObject.get("studentXgbz")== null) ?
                        0 : Integer.parseInt((String) jsonObject.get("studentXgbz")));

        student.setStudentPic( (String) jsonObject.get("studentPic") );
        int ress = studentMapper.insertSelective(student);

        if(ress >= 1){
            res.put(20000,"新增学生信息成功！");

            // 给用户添加通知
            tipService.createTip( (String) jsonObject.get("studentId") , 1,null);
        }
        else
            res.put(18000,"新增学生信息失败！服务器内部错误！");
        return res;
    }

    /**
     * 删除学生信息
     * @param id
     * @return
     */
    @Override
    public boolean deleteStudentInfo(String id) {
        int res = studentMapper.deleteByPrimaryKey(id);
        return res>=1?true:false;
    }


    /**
     * 根据用户角色获取可查询的 考研就业满意度 用以展示
     * @return
     */
    @Override
    public ArrayList getKyjymydData(String token) {
        ArrayList res = new ArrayList();
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("方法：获取考研就业满意度==》账号: userId=>{}", username);
        log.info("方法：获取考研就业满意度==》角色: userrole=>{}", loginrole);
        //角色可以是admin==》该学院同学 superadmin=》所有同学 teacher==》教师教的班级
        switch (loginrole){
            case "teacher":{


                //查询出此 教师 教授的所有班级-->classWithThisAdmin
                ClassExample example = new ClassExample();
                ClassExample.Criteria criteria  = example.createCriteria();
                criteria.andTeacherIdEqualTo(username);
                List<Class> classWithThisAdmin = classMapper.selectByExample(example);

                if(classWithThisAdmin == null){
                    log.warn("方法：获取考研就业满意度。教师名为{}的教师 没有带班级学生。",username);
                    return null;
                }else{
                    for(Class classItem : classWithThisAdmin ){

                        Integer jyrs = 0;
                        Integer kyrs = 0;
                        Integer mydSum = 0;

                        HashMap hashMap = new HashMap();
                        log.info("方法：获取考研就业满意度。教师名为{}的教师教的班级id==》{}",username,classItem.getClassId());
                        String class_id =  classItem.getClassId();
                        StudentExample studentExample = new StudentExample();
                        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
                        studentCriteria.andClassIdEqualTo(class_id);

                        //查出这个班有哪些人
                        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);

                        //获取其就业、考研人数以及满意度
                        for(Student student : studentsWithClassId){
                            //获取每个学生的具体情况
                            ByqxExample byqxExample = new ByqxExample();
                            ByqxExample.Criteria byqxCriteria  = byqxExample.createCriteria();
                            byqxCriteria.andStudentIdEqualTo(student.getStudentId());
                            List<Byqx> byqxList =  byqxMapper.selectByExample(byqxExample);
                            if(byqxList.size()!=1){
                                log.error("方法：获取考研就业满意度。错误！就业去向表中学号为{}的学生不是一个，可能有多个或不存在。",student.getStudentId());
                            }else{
                                Byqx byqx = byqxList.get(0);
                                //0考研 1工作 2考公 3无毕业去向
                                if(byqx.getByqxKind() == 0)
                                    kyrs++;
                                else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                    jyrs++;
                                mydSum += byqx.getByqxMyd();
                            }
                        }
                        hashMap.put("total",studentsWithClassId.size());
                        hashMap.put("ky",kyrs);
                        hashMap.put("jy",jyrs);
                        hashMap.put("myd",mydSum/studentsWithClassId.size());
                        hashMap.put("classid",class_id);
                        res.add(hashMap);
                    }
                }
                return res;
            }
            case "admin":{
                //查询出此管理员所在学院
                Sysadmin sysadmin = sysadminMapper.selectByPrimaryKey(username);
                log.info("方法：获取考研就业满意度。学院管理员{}属于学院id为==》{}的学院",username,sysadmin.getCollegeId());

                //查询出此管理员所在学院的所有班级-->classWithThisAdmin
                ClassExample example = new ClassExample();
                ClassExample.Criteria criteria  = example.createCriteria();
                criteria.andCollegeIdEqualTo(sysadmin.getCollegeId());
                List<Class> classWithThisAdmin = classMapper.selectByExample(example);

                if(classWithThisAdmin == null){
                    log.warn("方法：获取考研就业满意度。学院id为{}的学院 没有 班级信息。",sysadmin.getCollegeId());
                    return null;
                }else{
                    for(Class classItem : classWithThisAdmin ){

                        Integer jyrs = 0;
                        Integer kyrs = 0;
                        Integer studentNum = 0;
                        Integer mydSum = 0;

                        HashMap hashMap = new HashMap();
                        log.info("方法：获取考研就业满意度。学院id为{}下的班级id==》{}",sysadmin.getCollegeId(),classItem.getClassId());
                        String class_id =  classItem.getClassId();
                        StudentExample studentExample = new StudentExample();
                        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
                        studentCriteria.andClassIdEqualTo(class_id);

                        //查出这个班有哪些人
                        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);

                        //获取其就业、考研人数以及满意度
                        for(Student student : studentsWithClassId){
                            //获取每个学生的具体情况
                            ByqxExample byqxExample = new ByqxExample();
                            ByqxExample.Criteria byqxCriteria  = byqxExample.createCriteria();
                            byqxCriteria.andStudentIdEqualTo(student.getStudentId());
                            List<Byqx> byqxList =  byqxMapper.selectByExample(byqxExample);
                            if(byqxList.size()!=1){
                                log.error("方法：获取考研就业满意度。错误！就业去向表中学号为{}的学生不是一个，可能有多个或不存在。",student.getStudentId());
                            }else{
                                Byqx byqx = byqxList.get(0);
                                //0考研 1工作 2考公 3无毕业去向
                                if(byqx.getByqxKind() == 0)
                                    kyrs++;
                                else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                    jyrs++;
                                mydSum += byqx.getByqxMyd();
                            }
                        }
                        hashMap.put("total",studentsWithClassId.size());
                        hashMap.put("ky",kyrs);
                        hashMap.put("jy",jyrs);
                        hashMap.put("myd",mydSum/studentsWithClassId.size());
                        hashMap.put("classid",class_id);
                        res.add(hashMap);
                    }
                }
                return res;
            }
            case "superadmin":{

                //查询出此管理员所在学院的所有班级-->classWithThisAdmin
                ClassExample example = new ClassExample();
                ClassExample.Criteria criteria  = example.createCriteria();
                criteria.andClassIdIsNotNull();
                List<Class> classWithThisAdmin = classMapper.selectByExample(example);

                if(classWithThisAdmin == null){
                    log.warn("方法：获取考研就业满意度。超管查询到学校没有班级信息。");
                    return null;
                }else{
                    for(Class classItem : classWithThisAdmin ){

                        Integer jyrs = 0;
                        Integer kyrs = 0;
                        Integer mydSum = 0;

                        HashMap hashMap = new HashMap();
                        log.info("方法：获取考研就业满意度。超级管理员查询=》班级id为{}的班级。",classItem.getClassId());
                        String class_id =  classItem.getClassId();
                        StudentExample studentExample = new StudentExample();
                        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
                        studentCriteria.andClassIdEqualTo(class_id);

                        //查出这个班有哪些人
                        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);

                        //获取其就业、考研人数以及满意度
                        for(Student student : studentsWithClassId){
                            //获取每个学生的具体情况
                            ByqxExample byqxExample = new ByqxExample();
                            ByqxExample.Criteria byqxCriteria  = byqxExample.createCriteria();
                            byqxCriteria.andStudentIdEqualTo(student.getStudentId());
                            List<Byqx> byqxList =  byqxMapper.selectByExample(byqxExample);
                            if(byqxList.size()!=1){
                                log.error("方法：获取考研就业满意度。错误！就业去向表中学号为{}的学生不是一个，可能有多个或不存在。",student.getStudentId());
                            }else{
                                Byqx byqx = byqxList.get(0);
                                //0考研 1工作 2考公 3无毕业去向
                                if(byqx.getByqxKind() == 0)
                                    kyrs++;
                                else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                    jyrs++;
                                mydSum += byqx.getByqxMyd();
                            }
                        }
                        hashMap.put("total",studentsWithClassId.size());
                        hashMap.put("ky",kyrs);
                        hashMap.put("jy",jyrs);
                        hashMap.put("myd",mydSum/studentsWithClassId.size());
                        hashMap.put("classid",class_id);
                        res.add(hashMap);
                    }
                }
                return res;

            }
            default:
                throw new IllegalStateException("Unexpected value: " + loginrole);
        }
    }


    /**
     * 根据用户角色获取可查询的 近三年的考研就业以及总人数 用以展示
     * @return
     */
    @Override
    public ArrayList getSnkyjyData(String token) {
        ArrayList res = new ArrayList();

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("方法：获取近三年考研就业人数==》账号: userId=>{}", username);
        log.info("方法：获取近三年考研就业人数==》角色: userrole=>{}", loginrole);

        //今年的年份 用于判断近三年是哪三年
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy");
        Integer yearNow = Integer.parseInt(sdf.format(new Date()));

        //近三年的数据
        int[] jyrs = {0,0,0,0};
        int[] kyrs = {0,0,0,0};
        int[] rsSum = {0,0,0,0};
        //由入学日期判断 但此处判断其为近三年 （容易查 因为数据库里数据不行）
        int[] years = {0 , yearNow - 2 , yearNow - 3 , yearNow - 4};
//        Integer jyrsTotel_1 = 0;
//        Integer kyrsTotel_1 = 0;
//        Integer stuTotel_1 = 0;
//
//        Integer jyrsTotel_2 = 0;
//        Integer kyrsTotel_2 = 0;
//        Integer stuTotel_2 = 0;
//
//        Integer jyrsTotel_3 = 0;
//        Integer kyrsTotel_3 = 0;
//        Integer stuTotel_3 = 0;
//
//        由入学日期判断 但此处判断其为近三年 （容易查 因为数据库里数据不行）
//        Integer year_1 = yearNow - 4 - 1;
//        Integer year_2 = yearNow - 4 - 2;
//        Integer year_3 = yearNow - 4 - 3;
//        Integer year_1 = yearNow - 1;//入学年份为：2020
//        Integer year_2 = yearNow - 2;//入学年份为：2019
//        Integer year_3 = yearNow - 3;//入学年份为：2018

        //角色可以是admin==》该学院同学 superadmin=》所有同学 teacher==》教师教的班级
        switch (loginrole){
            case "teacher":{

                //查询出此 教师 教授的所有班级-->classWithThisAdmin
                ClassExample example = new ClassExample();
                ClassExample.Criteria criteria  = example.createCriteria();
                criteria.andTeacherIdEqualTo(username);
                List<Class> classWithThisAdmin = classMapper.selectByExample(example);

                if(classWithThisAdmin == null){
                    log.warn("方法：获取近三年考研就业人数。教师名为{}的教师 没有带班级学生。",username);
                    return null;
                }else{
                    for(Class classItem : classWithThisAdmin ){

                        log.info("方法：获取近三年考研就业人数。教师名为{}的教师教的班级id==》{}",username,classItem.getClassId());
                        String class_id =  classItem.getClassId();
                        StudentExample studentExample = new StudentExample();
                        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
                        studentCriteria.andClassIdEqualTo(class_id);

                        //查出这个班有哪些人
                        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);

                        //获取其就业、考研人数以及满意度
                        for(Student student : studentsWithClassId){

                            //获取每个学生的具体情况--入学日期格式：2021-04-09 00:19:50
                            int stuRxrq = Integer.parseInt((student.getStudentRxrq()).substring(0,4));


                            //获取其就业去向 考研or就业工作
                            ByqxExample byqxExample = new ByqxExample();
                            ByqxExample.Criteria byqxCriteria  = byqxExample.createCriteria();
                            byqxCriteria.andStudentIdEqualTo(student.getStudentId());
                            List<Byqx> byqxList =  byqxMapper.selectByExample(byqxExample);
                            if(byqxList.size()!=1){
                                log.error("方法：获取近三年考研就业人数。错误！就业去向表中学号为{}的学生不是一个，可能有多个或不存在。",student.getStudentId());
                            }else{
                                Byqx byqx = byqxList.get(0);
                                //0考研 1工作 2考公 3无毕业去向
                                if(stuRxrq == years[1]) {
                                    if(byqx.getByqxKind() == 0)
                                        kyrs[1]++;
                                    else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                        jyrs[1]++;
                                    rsSum[1] ++;
                                }else if(stuRxrq == years[2]) {
                                    if(byqx.getByqxKind() == 0)
                                        kyrs[2]++;
                                    else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                        jyrs[2]++;
                                    rsSum[2] ++;
                                }else if(stuRxrq == years[3]) {
                                    if(byqx.getByqxKind() == 0)
                                        kyrs[3]++;
                                    else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                        jyrs[3]++;
                                    rsSum[3] ++;
                                }
                            }
                        }
                    }
                }
                for(int i = 1 ; i <= 3;i++){
                    HashMap hashMap = new HashMap();
                    hashMap.put("year",years[i]);
                    hashMap.put("stuTotal",rsSum[i]);
                    hashMap.put("kySum",kyrs[i]);
                    hashMap.put("jySum",jyrs[i]);
                    res.add(hashMap);
                }
                return res;
            }
            case "admin":{
                //查询出此管理员所在学院
                Sysadmin sysadmin = sysadminMapper.selectByPrimaryKey(username);
                log.info("方法：获取近三年考研就业人数。学院管理员{}属于学院id为==》{}的学院",username,sysadmin.getCollegeId());

                //查询出此管理员所在学院的所有班级-->classWithThisAdmin
                ClassExample example = new ClassExample();
                ClassExample.Criteria criteria  = example.createCriteria();
                criteria.andCollegeIdEqualTo(sysadmin.getCollegeId());
                List<Class> classWithThisAdmin = classMapper.selectByExample(example);

                if(classWithThisAdmin == null){
                    log.warn("方法：获取近三年考研就业人数。学院id为{}的学院 没有 班级信息。",sysadmin.getCollegeId());
                    return null;
                }else{
                    for(Class classItem : classWithThisAdmin ){

                        log.info("方法：获取近三年考研就业人数。教师名为{}的教师教的班级id==》{}",username,classItem.getClassId());
                        String class_id =  classItem.getClassId();
                        StudentExample studentExample = new StudentExample();
                        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
                        studentCriteria.andClassIdEqualTo(class_id);

                        //查出这个班有哪些人
                        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);

                        //获取其就业、考研人数以及满意度
                        for(Student student : studentsWithClassId){

                            //获取每个学生的具体情况--入学日期格式：2021-04-09 00:19:50
                            int stuRxrq = Integer.parseInt((student.getStudentRxrq()).substring(0,4));


                            //获取其就业去向 考研or就业工作
                            ByqxExample byqxExample = new ByqxExample();
                            ByqxExample.Criteria byqxCriteria  = byqxExample.createCriteria();
                            byqxCriteria.andStudentIdEqualTo(student.getStudentId());
                            List<Byqx> byqxList =  byqxMapper.selectByExample(byqxExample);
                            if(byqxList.size()!=1){
                                log.error("方法：获取近三年考研就业人数。错误！就业去向表中学号为{}的学生不是一个，可能有多个或不存在。",student.getStudentId());
                            }else{
                                Byqx byqx = byqxList.get(0);
                                //0考研 1工作 2考公 3无毕业去向
                                if(stuRxrq == years[1]) {
                                    if(byqx.getByqxKind() == 0)
                                        kyrs[1]++;
                                    else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                        jyrs[1]++;
                                    rsSum[1] ++;
                                }else if(stuRxrq == years[2]) {
                                    if(byqx.getByqxKind() == 0)
                                        kyrs[2]++;
                                    else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                        jyrs[2]++;
                                    rsSum[2] ++;
                                }else if(stuRxrq == years[3]) {
                                    if(byqx.getByqxKind() == 0)
                                        kyrs[3]++;
                                    else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                        jyrs[3]++;
                                    rsSum[3] ++;
                                }
                            }
                        }
                    }
                }
                for(int i = 1 ; i <= 3;i++){
                    HashMap hashMap = new HashMap();
                    hashMap.put("year",years[i]);
                    hashMap.put("stuTotal",rsSum[i]);
                    hashMap.put("kySum",kyrs[i]);
                    hashMap.put("jySum",jyrs[i]);
                    res.add(hashMap);
                }
                return res;
            }
            case "superadmin":{

                //查询出此管理员所在学院的所有班级-->classWithThisAdmin
                ClassExample example = new ClassExample();
                ClassExample.Criteria criteria  = example.createCriteria();
                criteria.andClassIdIsNotNull();
                List<Class> classWithThisAdmin = classMapper.selectByExample(example);

                if(classWithThisAdmin == null){
                    log.warn("方法：获取近三年考研就业人数。超管查询到学校没有班级信息。");
                    return null;
                }else{
                    for(Class classItem : classWithThisAdmin ){

                        log.info("方法：获取近三年考研就业人数。教师名为{}的教师教的班级id==》{}",username,classItem.getClassId());
                        String class_id =  classItem.getClassId();
                        StudentExample studentExample = new StudentExample();
                        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
                        studentCriteria.andClassIdEqualTo(class_id);

                        //查出这个班有哪些人
                        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);

                        //获取其就业、考研人数以及满意度
                        for(Student student : studentsWithClassId){

                            //获取每个学生的具体情况--入学日期格式：2021-04-09 00:19:50
                            int stuRxrq = Integer.parseInt((student.getStudentRxrq()).substring(0,4));


                            //获取其就业去向 考研or就业工作
                            ByqxExample byqxExample = new ByqxExample();
                            ByqxExample.Criteria byqxCriteria  = byqxExample.createCriteria();
                            byqxCriteria.andStudentIdEqualTo(student.getStudentId());
                            List<Byqx> byqxList =  byqxMapper.selectByExample(byqxExample);
                            if(byqxList.size()!=1){
                                log.error("方法：获取近三年考研就业人数。错误！就业去向表中学号为{}的学生不是一个，可能有多个或不存在。",student.getStudentId());
                            }else{
                                Byqx byqx = byqxList.get(0);
                                //0考研 1工作 2考公 3无毕业去向
                                if(stuRxrq == years[1]) {
                                    if(byqx.getByqxKind() == 0)
                                        kyrs[1]++;
                                    else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                        jyrs[1]++;
                                    rsSum[1] ++;
                                }else if(stuRxrq == years[2]) {
                                    if(byqx.getByqxKind() == 0)
                                        kyrs[2]++;
                                    else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                        jyrs[2]++;
                                    rsSum[2] ++;
                                }else if(stuRxrq == years[3]) {
                                    if(byqx.getByqxKind() == 0)
                                        kyrs[3]++;
                                    else if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2)
                                        jyrs[3]++;
                                    rsSum[3] ++;
                                }
                            }
                        }
                    }
                }
                for(int i = 1 ; i <= 3;i++){
                    HashMap hashMap = new HashMap();
                    hashMap.put("year",years[i]);
                    hashMap.put("stuTotal",rsSum[i]);
                    hashMap.put("kySum",kyrs[i]);
                    hashMap.put("jySum",jyrs[i]);
                    res.add(hashMap);
                }
                return res;

            }
            default:
                throw new IllegalStateException("Unexpected value: " + loginrole);
        }
    }



    /**
     * 根据班级id获取考研去向详情 用以展示
     * @return
     */
    @Override
    public HashMap  getKyqxData(String token,String classid) {

        HashMap<String , Integer> hashMap = new HashMap();

        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
        studentCriteria.andClassIdEqualTo(classid);

        //查出这个班有哪些人
        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);

        //获取其就业、考研人数以及满意度
        for(Student student : studentsWithClassId){
            //获取每个学生的具体情况
            ByqxExample byqxExample = new ByqxExample();
            ByqxExample.Criteria byqxCriteria  = byqxExample.createCriteria();
            byqxCriteria.andStudentIdEqualTo(student.getStudentId());
            List<Byqx> byqxList =  byqxMapper.selectByExample(byqxExample);
            if(byqxList.size()!=1){
                log.error("方法：根据班级id获取考研去向详情。错误！就业去向表中学号为{}的学生不是一个，可能有多个或不存在。",student.getStudentId());
            }else{
                Byqx byqx = byqxList.get(0);
                //0考研 1工作 2考公 3无毕业去向
                if(byqx.getByqxKind() == 0){
                    if ((hashMap.get(byqx.getByqxName()) == null) || (hashMap.get(byqx.getByqxName()).equals(""))) {
                        hashMap.put(byqx.getByqxName(), 1);
                    } else {
                        hashMap.put(byqx.getByqxName(), hashMap.get(byqx.getByqxName()) + 1);
                    }
                }
            }
        }

        return hashMap;

    }

    /**
     * 根据班级id获取就业向详情 用以展示
     * @return
     */
    @Override
    public HashMap getJyqxData(String token,String classid) {

        HashMap<String , Integer> hashMap = new HashMap();

        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria studentCriteria  = studentExample.createCriteria();
        studentCriteria.andClassIdEqualTo(classid);

        //查出这个班有哪些人
        List<Student> studentsWithClassId = studentMapper.selectByExample(studentExample);

        //获取其就业情况
        for(Student student : studentsWithClassId){
            //获取每个学生的具体情况
            ByqxExample byqxExample = new ByqxExample();
            ByqxExample.Criteria byqxCriteria  = byqxExample.createCriteria();
            byqxCriteria.andStudentIdEqualTo(student.getStudentId());
            List<Byqx> byqxList =  byqxMapper.selectByExample(byqxExample);
            if(byqxList.size()!=1){
                log.error("方法：根据班级id获取就业去向详情。错误！就业去向表中学号为{}的学生不是一个，可能有多个或不存在。",student.getStudentId());
            }else{
                Byqx byqx = byqxList.get(0);
                //0考研 1工作 2考公 3无毕业去向
                if(byqx.getByqxKind() == 1 || byqx.getByqxKind() == 2){
                    if ((hashMap.get(byqx.getByqxName()) == null) || (hashMap.get(byqx.getByqxName()).equals(""))) {
                        hashMap.put(byqx.getByqxName(), 1);
                    } else {
                        hashMap.put(byqx.getByqxName(), hashMap.get(byqx.getByqxName()) + 1);
                    }
                }
            }
        }

        return hashMap;

    }


    /**
     * 获取当前用户角色可以查看的班级列表
     * @return
     */
    @Override
    public ArrayList getClasses(String token) {
        ArrayList res = new ArrayList();
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("方法：获取当前用户角色可以查看的班级列表==》账号: userId=>{}", username);
        log.info("方法：获取当前用户角色可以查看的班级列表==》角色: userrole=>{}", loginrole);
        //角色可以是admin==》该学院同学 superadmin=》所有同学 teacher==》此教师带的学生
        switch (loginrole){
            case "teacher":{
                ClassExample example = new ClassExample();
                ClassExample.Criteria criteria  = example.createCriteria();
                criteria.andTeacherIdEqualTo(username);
                //查询出此教师教授的所有班级-->classWithThisTeacher
                List<Class> classWithThisTeacher = classMapper.selectByExample(example);
                for(Class c : classWithThisTeacher) res.add(c.getClassId());
                if(res == null){
                    log.info("方法：获取当前用户角色可以查看的班级列表。教师名为{}的教师没有带班级",username);
                    return null;
                }else{
                    return res;
                }
            }
            case "admin":{

                //查询出此管理员所在学院
                Sysadmin sysadmin = sysadminMapper.selectByPrimaryKey(username);
                log.info("方法：获取当前用户角色可以查看的班级列表。学院管理员{}属于学院id为==》{}的学院",username,sysadmin.getCollegeId());

                //查询出此管理员所在学院的所有班级-->classWithThisAdmin
                ClassExample example = new ClassExample();
                ClassExample.Criteria criteria  = example.createCriteria();
                criteria.andCollegeIdEqualTo(sysadmin.getCollegeId());
                List<Class> classWithThisAdmin = classMapper.selectByExample(example);

                for(Class c : classWithThisAdmin) res.add(c.getClassId());
                if(res == null){
                    log.info("方法：获取当前用户角色可以查看的班级列表。学院id为{}的学院下没有班级",sysadmin.getCollegeId());
                    return null;
                }else{
                    return res;
                }
            }
            case "superadmin":{

                //查询出所有学院的所有班级-->classWithThisAdmin
                ClassExample example = new ClassExample();
                ClassExample.Criteria criteria  = example.createCriteria();
                criteria.andClassIdIsNotNull();
                List<Class> classWithThisAdmin = classMapper.selectByExample(example);

                for(Class c : classWithThisAdmin) res.add(c.getClassId());
                if(res == null){
                    log.info("方法：获取当前用户角色可以查看的班级列表。没有查到任何学院");
                    return null;
                }else{
                    return res;
                }
            }
            default:
                throw new IllegalStateException("Unexpected value: " + loginrole);
        }
    }

}
