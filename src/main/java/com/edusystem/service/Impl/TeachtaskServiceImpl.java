package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.*;
import com.edusystem.mapper.*;
import com.edusystem.service.TeachtaskService;
import com.edusystem.util.JWTUtils;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 花菜
 * @date 2021/4/17 19:28
 */
@Slf4j
@Service
public class TeachtaskServiceImpl implements TeachtaskService {

    @Autowired
    CollegeMapper collegeMapper;

    @Autowired
    TeachtaskMapper teachtaskMapper;

    @Autowired
    ProfessionMapper professionMapper;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    SysadminMapper sysadminMapper;

    @Override
    public HashMap<Integer, String> createTeachtaskInfo(JSONObject jsonObject, String token) {
        HashMap<Integer,String> res = new HashMap<>();
        Teachtask teachtask = new Teachtask();

        try{
            teachtask.setTeachtaskId(UUID.randomUUID().toString().substring(0,8));

            if((String) jsonObject.get("professionId") != null && !((String) jsonObject.get("professionId")).equals("")){
                teachtask.setProfessionId((String) jsonObject.get("professionId"));
                Profession profession = professionMapper.selectByPrimaryKey((String) jsonObject.get("professionId"));
                teachtask.setProfessionName(profession.getProfessionName());
            }
            if((String) jsonObject.get("classId") != null && !((String) jsonObject.get("classId")).equals("")){
                teachtask.setClassId((String) jsonObject.get("classId"));
            }

            teachtask.setTeacherId((String) jsonObject.get("teacherId"));

            teachtask.setCourseId((String) jsonObject.get("courseId"));
            teachtask.setTeachtaskMaxnum(Integer.parseInt(((String) jsonObject.get("teachtaskMaxnum"))));

            teachtask.setTeachtaskSelnum(Integer.parseInt(((String) jsonObject.get("teachtaskSelnum"))));


            teachtask.setTeachtaskGradelimit((String) jsonObject.get("teachtaskGradelimit"));

            teachtask.setTeachtaskAcademicyear(Integer.parseInt(((String) jsonObject.get("teachtaskAcademicyear"))));
            teachtask.setTeachtaskAcademicterm(Integer.parseInt(((String) jsonObject.get("teachtaskAcademicterm"))));

            teachtask.setTeachtaskStarttime(Integer.parseInt(((String) jsonObject.get("teachtaskStarttime"))));
            teachtask.setTeachtaskEndtime(Integer.parseInt(((String) jsonObject.get("teachtaskEndtime"))));

            teachtask.setTeachtaskIseveryweek(Integer.parseInt(((String) jsonObject.get("teachtaskIseveryweek"))));
            teachtask.setTeachtaskNumlimit(Integer.parseInt(((String) jsonObject.get("teachtaskNumlimit"))));
//        teachtask.setTeachtaskPriority(Integer.parseInt(((String) jsonObject.get(""))));
            //0代表 未排课
            teachtask.setTeachtaskIsrank(0);
            teachtask.setTeachtaskRemaerk((String) jsonObject.get("teachtaskRemaerk"));

        }catch (Exception e){
            e.printStackTrace();
            res.put(18000,"申请教学任务失败！数据格式错误！");
            return res;
        }
        int ress = teachtaskMapper.insertSelective(teachtask);

        if(ress >= 1)
            res.put(20000,"申请教学任务成功！");
        else
            res.put(18000,"申请教学任务失败！服务器内部错误！");
        return res;
    }
    /**
     * 根据角色获取其可视的教学任务列表信息
     * @param pageNum
     * @param limit
     * @param token
     * @return
     */
    @Override
    public HashMap getTeachtaskListWithRole(int pageNum, int limit , Map query , String token) {
        JSONObject queryObj = JSONObject.parseObject((String) query.get("query"));

        HashMap hashMap = new HashMap();
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        log.info("方法：获取教学任务列表信息。用户信息==》账号: userId=>{}", username);
        log.info("方法：获取教学任务列表信息。用户信息==》角色: userrole=>{}", loginrole);
        log.info("方法：获取教学任务列表信息。查询第{}页", pageNum);
        log.info("方法：获取教学任务列表信息。查询1页{}项", limit);

        //查询出所有信息==>前端已经根据角色显示其可以选择的班级 学院等选项
        TeachtaskExample example = new TeachtaskExample();
        TeachtaskExample.Criteria criteria = example.createCriteria();
        criteria.andTeacherIdIsNotNull();


        String teachtaskAcademicyear = (String) queryObj.get("teachtaskAcademicyear");
        if (!(teachtaskAcademicyear == null || teachtaskAcademicyear.equals(""))) {
            log.info("方法：获取教学任务列表信息。查询学年为{}的教学任务", teachtaskAcademicyear);
            criteria.andTeachtaskAcademicyearEqualTo( Integer.parseInt(teachtaskAcademicyear) );
        }
        String teachtaskAcademicterm = (String) queryObj.get("teachtaskAcademicterm");
        if (!(teachtaskAcademicterm == null || teachtaskAcademicterm.equals(""))) {
            log.info("方法：获取教学任务列表信息。查询学期为{}的教学任务", teachtaskAcademicterm);
            criteria.andTeachtaskAcademictermEqualTo( Integer.parseInt(teachtaskAcademicterm) );
        }
        String teachtaskStarttime = (String) queryObj.get("teachtaskStarttime");
        if (!(teachtaskStarttime == null || teachtaskStarttime.equals(""))) {
            log.info("方法：获取教学任务列表信息。查询课程开始周数为{}的教学任务", teachtaskStarttime);
            criteria.andTeachtaskStarttimeEqualTo( Integer.parseInt(teachtaskStarttime) );
        }
        String teachtaskEndtime = (String) queryObj.get("teachtaskEndtime");
        if (!(teachtaskEndtime == null || teachtaskEndtime.equals(""))) {
            log.info("方法：获取教学任务列表信息。查询课程结束周数为{}的教学任务", teachtaskEndtime);
            criteria.andTeachtaskAcademictermEqualTo( Integer.parseInt(teachtaskEndtime) );
        }


        String classid = (String) queryObj.get("classid");
        if (!(classid == null || classid.equals(""))) {
            log.info("方法：获取教学任务列表信息。查询班级id为{}的教学任务", classid);
            criteria.andClassIdEqualTo( classid );
        }
        String teachtaskGradelimit = (String) queryObj.get("teachtaskGradelimit");
        if (!(teachtaskGradelimit == null || teachtaskGradelimit.equals(""))) {
            log.info("方法：获取教学任务列表信息。查询年级为{}的教学任务", teachtaskGradelimit);
            criteria.andTeachtaskGradelimitEqualTo( teachtaskGradelimit );
        }


        //这个条件是管理员查询时会用到的字段--查询某个学院的某个教师开了什么课程
        String teacherid = (String) queryObj.get("teacherid");
        if (!(teacherid == null || teacherid.equals(""))) {
            log.info("方法：获取教学任务列表信息。查询教师id为{}的教学任务", teacherid);
            criteria.andTeacherIdEqualTo( teacherid );
        }

        ArrayList a= (ArrayList) teachtaskMapper.selectByExample(example);
        int total = a.size();


        PageHelper.startPage(pageNum, limit);
        ArrayList<Teachtask> resitem = (ArrayList) teachtaskMapper.selectByExample(example);
        for(int j = 0 ;  j < resitem.size() ; j++){
            //需要新增其课程名称与课程所属院系
            Course c = courseMapper.selectByPrimaryKey(resitem.get(j).getCourseId());
            Teacher t = teacherMapper.selectByPrimaryKey(resitem.get(j).getTeacherId());
            resitem.get(j).setCourseName(c.getCourseName());
            resitem.get(j).setCollegeId(c.getCollegeId());
            resitem.get(j).setCollegeName(c.getCollegeName());
            resitem.get(j).setTeacherName(t.getTeacherName());
        }


//        ArrayList xyzybj = (ArrayList) queryObj.get("xyzybj");
//        if ( xyzybj != null) {
//            for(int i = 0 ;i < xyzybj.size(); i++ ){
//                ArrayList xyzybjItem = (ArrayList) xyzybj.get(i);
//                log.info("方法：获取教学任务列表信息。查询学院id为{} 专业id为{} 班级id为{} 的教学任务", xyzybjItem.get(0),xyzybjItem.get(1),xyzybjItem.get(2));
//                criteria.andProfessionIdEqualTo((String)xyzybj.get(1));
//                criteria.andClassIdEqualTo((String)xyzybj.get(2));
//
//
//                ArrayList a= (ArrayList) teachtaskMapper.selectByExample(example);
//                total += a.size();
//
//
//                PageHelper.startPage(pageNum, limit);
//                ArrayList<Teachtask> resitem = (ArrayList) teachtaskMapper.selectByExample(example);
//                for(int j = 0 ;  j < resitem.size() ; j++){
//                    //需要新增其课程名称与课程所属院系
//                    Course c = courseMapper.selectByPrimaryKey(resitem.get(j).getCourseId());
//                    Teacher t = teacherMapper.selectByPrimaryKey(resitem.get(j).getTeacherId());
//                    resitem.get(j).setCourseName(c.getCourseName());
//                    resitem.get(j).setCollegeId(c.getCollegeId());
//                    resitem.get(j).setCollegeName(c.getCollegeName());
//                    resitem.get(j).setTeacherName(t.getTeacherName());
//                }
//
//                arrayList.addAll(resitem);
//            }
//        }else{
//            //年级限制与班级选择只能有一项--代表选修与否
//            ArrayList teachtaskGradelimit = (ArrayList) queryObj.get("teachtaskGradelimit");
//            if ( teachtaskGradelimit != null) {
//                for(int i = 0 ;i < teachtaskGradelimit.size(); i++ ){
//                    String gradeLimit = (String) teachtaskGradelimit.get(i);
//                    log.info("方法：获取教学任务列表信息。查询年级为{}的教学任务", gradeLimit);
//                    criteria.andTeachtaskGradelimitEqualTo(gradeLimit);
//
//
//                    ArrayList a= (ArrayList) teachtaskMapper.selectByExample(example);
//                    total += a.size();
//
//
//                    PageHelper.startPage(pageNum, limit);
//                    ArrayList<Teachtask> resitem= (ArrayList) teachtaskMapper.selectByExample(example);
//                    for(int j = 0 ;  j < resitem.size() ; j++){
//                        //需要新增其课程名称与课程所属院系
//                        Course c = courseMapper.selectByPrimaryKey(resitem.get(j).getCourseId());
//                        Teacher t = teacherMapper.selectByPrimaryKey(resitem.get(j).getTeacherId());
//                        resitem.get(j).setCourseName(c.getCourseName());
//                        resitem.get(j).setCollegeId(c.getCollegeId());
//                        resitem.get(j).setCollegeName(c.getCollegeName());
//                        resitem.get(j).setTeacherName(t.getTeacherName());
//
//                    }
//
//                    arrayList.addAll(resitem);
//                }
//            }else{
//                ArrayList a= (ArrayList) teachtaskMapper.selectByExample(example);
//                total += a.size();
//
//
//                PageHelper.startPage(pageNum, limit);
//                ArrayList<Teachtask> resitem= (ArrayList) teachtaskMapper.selectByExample(example);
//                for(int j = 0 ;  j < resitem.size() ; j++){
//                    //需要新增其课程名称与课程所属院系
//                    Course c = courseMapper.selectByPrimaryKey(resitem.get(j).getCourseId());
//                    Teacher t = teacherMapper.selectByPrimaryKey(resitem.get(j).getTeacherId());
//                    resitem.get(j).setCourseName(c.getCourseName());
//                    resitem.get(j).setCollegeId(c.getCollegeId());
//                    resitem.get(j).setCollegeName(c.getCollegeName());
//                    resitem.get(j).setTeacherName(t.getTeacherName());
//                }
//
//                arrayList.addAll(resitem);
//            }
//        }



//        String kcxzid = (String) queryObj.get("kcxzid");
//        if (!(kcxzid == null || kcxzid.equals(""))) {
//            log.info("方法：获取教学任务列表信息。查询课程性质id为{}的课程", kcxzid);
//            criteria.andKcxzIdEqualTo(kcxzid);
//        }
//        String khfs = (String) queryObj.get("khfs");
//        if (!(khfs == null || khfs.equals(""))) {
//            log.info("方法：获取课程列表信息。查询课程考核方式为{}的课程", khfs);
//            criteria.andCourseCheckkindEqualTo(khfs);
//        }



        if (resitem == null) {
            log.info("方法：获取教学任务列表信息。未查询到信息");
            return null;
        } else {
            hashMap.put("total", total);
            hashMap.put("data", resitem);

        }
        return hashMap;
    }


    /**
     * 根据角色获取其可视的教师列表
     * @param token
     * @return
     */
    @Override
    public ArrayList fetchTeacherList(String token) {
        ArrayList collegeList = new ArrayList();
        ArrayList res = new ArrayList();
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("方法：获取教师列表。用户信息==》账号: userId=>{}", username);
        log.info("方法：获取教师列表。用户信息==》角色: userrole=>{}", loginrole);
        //角色可以是admin/teacher==》给出一个学院的所有专业 superadmin=》所有学院的所有专业信息
        switch (loginrole){
            //查出该角色可以看几个学院的 -- 学院下有几个专业 -- 专业下有几个班？放map里算了
            case "superadmin": {
                CollegeExample collegeExample = new CollegeExample();
                CollegeExample.Criteria collegeExampleCriteria = collegeExample.createCriteria();
                collegeExampleCriteria.andCollegeIdIsNotNull();
                List<College> colleges = collegeMapper.selectByExample(collegeExample);
                if (colleges == null) {
                    log.info("方法：获取专业列表-获取角色可查看的学院列表信息。未查询到学院列表信息");
                    return null;
                } else {
                    collegeList = new ArrayList();
                    for(College college : colleges) {
                        //对每一个学院做一个对象
                        //collegeList是说有几个学院 都在这个collegeList列表里 教师是只有一个学院 clollegeMap是列表里的对象
                        HashMap clollegeMap = new HashMap();
                        clollegeMap.put("collegeid", college.getCollegeId());
                        clollegeMap.put("collegename", college.getCollegeName());

                        TeacherExample example = new TeacherExample();
                        TeacherExample.Criteria criteria = example.createCriteria();
                        criteria.andCollegeIdEqualTo(college.getCollegeId());

                        List<Teacher> teachers = teacherMapper.selectByExample(example);
                        if (teachers == null) {
                            log.info("方法：获取专业列表。未查询到学院下教师信息");
                            return null;
                        } else {
                            clollegeMap.put("teachers", teachers);
//                            ArrayList professionList = new ArrayList();
//                            for (Profession profession : professions) {
//                                HashMap professionMap = new HashMap();
//                                professionMap.put("professionid", profession.getProfessionId());
//                                professionMap.put("professionname", profession.getProfessionName());
//
//                                String pId = profession.getProfessionId();
//                                ClassExample classExample = new ClassExample();
//                                ClassExample.Criteria exampleCriteria = classExample.createCriteria();
//                                exampleCriteria.andProfessionIdEqualTo(pId);
//                                ArrayList<Class> classes = (ArrayList<Class>) classMapper.selectByExample(classExample);
//                                professionMap.put("classes", classes);
//                                professionList.add(professionMap);
//                            }
//                            clollegeMap.put("professions", professionList);
                        }
                        collegeList.add(clollegeMap);
                    }
                    return collegeList;
                }
            }
            case "admin": {
                //查询出属于哪个学院
                Sysadmin sysadmin = sysadminMapper.selectByPrimaryKey(username);
                log.info("方法：获取专业列表。学院管理员{}属于学院id为==》{}的学院",username,sysadmin.getCollegeId());
                if(sysadmin.getCollegeId() == null || sysadmin.getCollegeId().equals(""))
                    log.info("方法：获取专业列表。学院管理员不属于任何学院");
                else {
                    College college = collegeMapper.selectByPrimaryKey(sysadmin.getCollegeId());

                    //collegeList是说有几个学院 都在这个collegeList列表里 教师是只有一个学院 clollegeMap是列表里的对象
                    collegeList = new ArrayList();
                    HashMap clollegeMap = new HashMap();
                    clollegeMap.put("collegeid" ,  college.getCollegeId() );
                    clollegeMap.put("collegename" , college.getCollegeName());

                    TeacherExample example = new TeacherExample();
                    TeacherExample.Criteria criteria = example.createCriteria();
                    criteria.andCollegeIdEqualTo(college.getCollegeId());

                    List<Teacher> teachers = teacherMapper.selectByExample(example);
                    if (teachers == null) {
                        log.info("方法：获取专业列表。未查询到学院下教师信息");
                        return null;
                    } else {
                        clollegeMap.put("teachers", teachers);
                    }
                    collegeList.add(clollegeMap);

                }
                return collegeList;
            }
            case "teacher": {
                //查询出属于哪个学院
                Teacher teacher = teacherMapper.selectByPrimaryKey(username);
                log.info("方法：获取专业列表 。教师{}属于学院id为==》{}的学院",username,teacher.getCollegeId());
                if(teacher.getCollegeId() == null || teacher.getCollegeId().equals(""))
                    log.info("方法：获取专业列表 。教师不属于任何学院");
                else {
                    College college = collegeMapper.selectByPrimaryKey(teacher.getCollegeId());

                    //collegeList是说有几个学院 都在这个collegeList列表里 教师是只有一个学院 clollegeMap是列表里的对象
                    collegeList = new ArrayList();
                    HashMap clollegeMap = new HashMap();
                    clollegeMap.put("collegeid" ,  college.getCollegeId() );
                    clollegeMap.put("collegename" , college.getCollegeName());

                    TeacherExample example = new TeacherExample();
                    TeacherExample.Criteria criteria = example.createCriteria();
                    criteria.andCollegeIdEqualTo(college.getCollegeId());

                    List<Teacher> teachers = teacherMapper.selectByExample(example);
                    if (teachers == null) {
                        log.info("方法：获取专业列表。未查询到学院下教师信息");
                        return null;
                    } else {
                        clollegeMap.put("teachers", teachers);
                    }
                    collegeList.add(clollegeMap);

                }
                return collegeList;
            }
        }
        return null;
    }

    @Override
    public boolean handleTeachtaskStatus(String id, String status, String token) {
        Teachtask teachtask = new Teachtask();
        int res = -1;
        try{
            teachtask.setTeachtaskId(id);
            teachtask.setTeachtaskIsrank(Integer.parseInt(status));
            res = teachtaskMapper.updateByPrimaryKeySelective(teachtask);
        }catch (Exception e){
            e.printStackTrace();
        } 
        return res>=1? true:false;
    }


}
