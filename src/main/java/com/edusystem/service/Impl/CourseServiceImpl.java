package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.*;
import com.edusystem.mapper.*;
import com.edusystem.service.CourseService;
import com.edusystem.util.JWTUtils;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 花菜
 * @date 2021/4/10 2:25
 */
@Slf4j
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    ClassMapper classMapper;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    CollegeMapper collegeMapper;

    @Autowired
    SysadminMapper sysadminMapper;

    @Autowired
    KcxzMapper kcxzMapper;

    @Autowired
    TeacherMapper teacherMapper;
    /**
     * 根据角色获取其可视的课程列表信息
     * @param pageNum
     * @param limit
     * @param token
     * @return
     */
    @Override
    public HashMap getCourseListWithRole(int pageNum, int limit , Map query , String token) {
        JSONObject queryObj = JSONObject.parseObject((String) query.get("query"));

        HashMap hashMap = new HashMap();
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        log.info("方法：获取课程列表信息。用户信息==》账号: userId=>{}", username);
        log.info("方法：获取课程列表信息。用户信息==》角色: userrole=>{}", loginrole);
        log.info("方法：获取课程列表信息。查询第{}页", pageNum);
        log.info("方法：获取课程列表信息。查询1页{}项", limit);

        //查询出所有课程信息==>前端已经根据角色显示其可以选择的班级 学院等选项
        CourseExample example = new CourseExample();
        CourseExample.Criteria criteria = example.createCriteria();
        criteria.andCourseIdIsNotNull();

        String collegeid = (String) queryObj.get("collegeid");
        if( !(collegeid == null || collegeid.equals(""))) {
            log.info("方法：获取课程列表信息。查询学院id为{}的课程", collegeid);
            criteria.andCollegeIdEqualTo(collegeid);
        }

        String kcxzid = (String) queryObj.get("kcxzid");
        if( !(kcxzid == null || kcxzid.equals(""))  ){
            log.info("方法：获取课程列表信息。查询课程性质id为{}的课程", kcxzid);
            criteria.andKcxzIdEqualTo(kcxzid);
        }
        String khfs = (String) queryObj.get("khfs");
        if( !(khfs == null || khfs.equals("")) ){
            log.info("方法：获取课程列表信息。查询课程考核方式为{}的课程", khfs);
            criteria.andCourseCheckkindEqualTo(khfs);
        }
        String keyword = (String) queryObj.get("keyword");
        if( !(keyword == null || keyword.equals("")) ){
            log.info("方法：获取课程列表信息。查询课程关键字为{}的课程", keyword);
            criteria.andCourseNameLike("%"+keyword+"%");
        }


        List<Course> coursesWithThisAdmin = courseMapper.selectByExample(example);
        int total = coursesWithThisAdmin.size();

        PageHelper.startPage(pageNum, limit);
        coursesWithThisAdmin = courseMapper.selectByExample(example);

        if (coursesWithThisAdmin == null) {
            log.info("方法：获取课程列表信息。未查询到课程列表信息");
            return null;
        } else {
            hashMap.put("total",total);
            hashMap.put("data", coursesWithThisAdmin);

        }
        return hashMap;
        //角色可以是admin==》该学院同学 superadmin=》所有同学 teacher==》此教师带的学生
//        switch (loginrole){
//            case "superadmin": {
//                //查询出所有课程信息
//                CourseExample example = new CourseExample();
//                CourseExample.Criteria criteria = example.createCriteria();
//                criteria.andCourseIdIsNotNull();
//
//                String collegeid = (String) queryObj.get("collegeid");
//                if( !(collegeid == null || collegeid.equals(""))) {
//                    log.info("方法：获取课程列表信息。查询学院id为{}的课程", collegeid);
//                    criteria.andCollegeIdEqualTo(collegeid);
//                }
//
//                String kcxzid = (String) queryObj.get("kcxzid");
//                if( !(kcxzid == null || kcxzid.equals(""))  ){
//                    log.info("方法：获取课程列表信息。查询课程性质id为{}的课程", kcxzid);
//                    criteria.andKcxzIdEqualTo(kcxzid);
//                }
//                String khfs = (String) queryObj.get("khfs");
//                if( !(khfs == null || khfs.equals("")) ){
//                    log.info("方法：获取课程列表信息。查询课程考核方式为{}的课程", khfs);
//                    criteria.andCourseCheckkindEqualTo(khfs);
//                }
//                String keyword = (String) queryObj.get("keyword");
//                if( !(keyword == null || keyword.equals("")) ){
//                    log.info("方法：获取课程列表信息。查询课程关键字为{}的课程", keyword);
//                    criteria.andCourseNameLike("%"+keyword+"%");
//                }
//
//
//                List<Course> coursesWithThisAdmin = courseMapper.selectByExample(example);
//                int total = coursesWithThisAdmin.size();
//
//                PageHelper.startPage(pageNum, limit);
//                coursesWithThisAdmin = courseMapper.selectByExample(example);
//
//                if (coursesWithThisAdmin == null) {
//                    log.info("方法：获取课程列表信息。未查询到课程列表信息");
//                    return null;
//                } else {
//                    hashMap.put("total",total);
//                    hashMap.put("data", coursesWithThisAdmin);
//
//                }
//                return hashMap;
//            }
//            case "admin": {
//                //查询出所有属于此学院的课程信息
//                //查询出所有课程信息
//
//            }
//            case "teacher": {
//                //查询出所有此教师教授了什么课 返回其课程信息
//                //但是我又想了下 应该是显示和学院admin一样的==》显示此学院的课程列表信息
//
//            }

    }



    /**
     * 根据角色获取其可视的学院列表
     * @param token
     * @return
     */
    @Override
    public ArrayList fetchShowCollegesList(String token) {
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("方法：获取课程列表-获取角色可查看的学院列表信息。用户信息==》账号: userId=>{}", username);
        log.info("方法：获取课程列表-获取角色可查看的学院列表信息。用户信息==》角色: userrole=>{}", loginrole);
        //角色可以是admin==》一个 superadmin=》所有
        switch (loginrole){
            case "superadmin": {
                CollegeExample example = new CollegeExample();
                CollegeExample.Criteria criteria = example.createCriteria();
                criteria.andCollegeIdIsNotNull();
                List<College> colleges = collegeMapper.selectByExample(example);
                if (colleges == null) {
                    log.info("方法：获取课程列表-获取角色可查看的学院列表信息。未查询到学院列表信息");
                    return null;
                } else {
                    return (ArrayList) colleges;
                }
            }
            case "admin": {
                //查询出属于哪个学院
                Sysadmin sysadmin = sysadminMapper.selectByPrimaryKey(username);
                log.info("方法：获取课程列表-获取角色可查看的学院列表信息。学院管理员{}属于学院id为==》{}的学院",username,sysadmin.getCollegeId());
                if(sysadmin.getCollegeId() == null || sysadmin.getCollegeId().equals(""))
                    log.info("方法：获取课程列表-获取角色可查看的学院列表信息。学院管理员不属于任何学院");
                else {
                    College college = collegeMapper.selectByPrimaryKey(sysadmin.getCollegeId());
                    ArrayList res = new ArrayList();
                    res.add(college);
                    return res;
                }
            }
            case "teacher": {
                //查询出属于哪个学院
                Teacher teacher = teacherMapper.selectByPrimaryKey(username);
                log.info("方法：获取课程列表-获取角色可查看的学院列表信息。教师{}属于学院id为==》{}的学院",username,teacher.getCollegeId());
                if(teacher.getCollegeId() == null || teacher.getCollegeId().equals(""))
                    log.info("方法：获取课程列表-获取角色可查看的学院列表信息。教师不属于任何学院");
                else {
                    College college = collegeMapper.selectByPrimaryKey(teacher.getCollegeId());
                    ArrayList res = new ArrayList();
                    res.add(college);
                    return res;
                }
            }
        }
        return null;
    }


    /**
     * 根据课程性质列表
     * @param token
     * @return
     */
    @Override
    public ArrayList fetchShowKcxzList(String token) {

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("方法：获取课程列表-获取课程性质列表信息。用户信息==》账号: userId=>{}", username);
        log.info("方法：获取课程列表-获取课程性质列表信息。用户信息==》角色: userrole=>{}", loginrole);

        KcxzExample example = new KcxzExample();
        KcxzExample.Criteria criteria = example.createCriteria();
        criteria.andKcxzIdIsNotNull();
        List<Kcxz> kcxzs = kcxzMapper.selectByExample(example);
        if(kcxzs == null || kcxzs.size() == 0){
            log.info("方法：获取课程列表-获取课程性质列表信息。查询结果为0");
            return null;
        }else {
            return (ArrayList) kcxzs;
        }

    }



    /**
     * 更新课程信息
     * @param jsonObject
     * @param token
     * @return
     */
    @Override
    public boolean updateCourseInfo(JSONObject jsonObject, String token) {

        /**
         * collegeId: "1"
         * collegeName: "计算机学院"
         * courseCheckkind: "考察"
         * courseCredit: "1123"
         * courseDescription: "学习计算机相关知识"
         * courseDesignweeks: 1
         * courseExperimenthours: 10
         * courseId: "1"
         * courseName: "计算机科学导论"
         * courseTheoryhours: 24
         * kcxzId: "1"
         * kcxzName: "必修-通识教育平台课"
         */
        Course course = new Course();
        course.setCollegeId((String) jsonObject.get("collegeId"));
        course.setCollegeName((String) jsonObject.get("collegeName"));

        course.setCourseCheckkind((String) jsonObject.get("courseCheckkind"));
        course.setCourseCredit(Integer.parseInt((String) jsonObject.get("courseCredit")));
        course.setCourseDescription((String) jsonObject.get("courseDescription"));
        course.setCourseDesignweeks(Integer.parseInt((String) jsonObject.get("courseDesignweeks")));
        course.setCourseExperimenthours(Integer.parseInt((String) jsonObject.get("courseExperimenthours")));

        course.setCourseId((String) jsonObject.get("courseId"));
        course.setCourseName((String) jsonObject.get("courseName"));
        course.setCourseTheoryhours(Integer.parseInt((String) jsonObject.get("courseTheoryhours")));
        course.setKcxzId((String) jsonObject.get("kcxzId"));
        course.setKcxzName((String) jsonObject.get("kcxzName"));

        int res = courseMapper.updateByPrimaryKeySelective(course);
        return res>=1? true:false;
    }


    /**
     * 新增课程信息
     * @param jsonObject
     * @param token
     * @return
     */
    @Override
    public HashMap<Integer,String> createCourseInfo(JSONObject jsonObject, String token) {
        /**
         * 返回值:
         * code msg
         * 18000错误
         * 20000正确
         *
         *      * collegeId: "1"
         *      * collegeName: "计算机学院"
         *      * courseCheckkind: "考试"
         *      * courseCredit: "1"
         *      * courseDescription: "1"
         *      * courseDesignweeks: "1"
         *      * courseExperimenthours: "1"
         *      * courseId: ""
         *      * courseName: "111"
         *      * courseTheoryhours: "1"
         *      * kcxzId: "1"
         *      * kcxzName: "必修-通识教育平台课"
         *
         */
        HashMap<Integer,String> res = new HashMap<>();
        Course course = new Course();
        course.setCollegeId((String) jsonObject.get("collegeId"));
        course.setCollegeName((String) jsonObject.get("collegeName"));

        course.setCourseCheckkind((String) jsonObject.get("courseCheckkind"));
        course.setCourseCredit(Integer.parseInt((String) jsonObject.get("courseCredit")));
        course.setCourseDescription((String) jsonObject.get("courseDescription"));
        course.setCourseDesignweeks(Integer.parseInt((String) jsonObject.get("courseDesignweeks")));
        course.setCourseExperimenthours(Integer.parseInt((String) jsonObject.get("courseExperimenthours")));

        course.setCourseId(UUID.randomUUID().toString().substring(0,8));
        course.setCourseName((String) jsonObject.get("courseName"));

        course.setCourseTheoryhours(Integer.parseInt((String) jsonObject.get("courseTheoryhours")));
        course.setKcxzId((String) jsonObject.get("kcxzId"));
        course.setKcxzName((String) jsonObject.get("kcxzName"));

        int ress = courseMapper.insertSelective(course);

        if(ress >= 1)
            res.put(20000,"新增课程信息成功！");
        else
            res.put(18000,"新增课程信息失败！服务器内部错误！");
        return res;
    }


    /**
     * 删除课程信息
     * @param id
     * @return
     */
    @Override
    public boolean deleteCourseInfo(String id) {
        int res = courseMapper.deleteByPrimaryKey(id);
        return res>=1?true:false;
    }


}
