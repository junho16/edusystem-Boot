package com.edusystem.controller;

import com.alibaba.fastjson.JSONObject;
import com.edusystem.entity.College;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.CourseServiceImpl;
import com.edusystem.util.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 课程控制器
 * @author 花菜
 * @date 2021/4/10 2:09
 */
@Slf4j
@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;

    @GetMapping("/list")
    @ResponseBody
    public MyResponse courseList(@RequestParam Map query, @RequestParam String token) {

        String mytoken = ((String) query.get("token"));
        log.info("方法：获取课程列表。-------------当前请求token为{}",token);
        log.info("方法：获取课程列表。当前mytoken为{}", mytoken );
        log.info("方法：获取课程列表。当前query为{}", query );
        /**
         * 请求参数==》格式 map有两个值
         2
         query={"page":1,"limit":20,"sort":"+id"}
         token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsb2d
         */
        JSONObject queryObj = JSONObject.parseObject((String) query.get("query"));
        boolean isHasAll = CommonUtil.hasAllRequired(queryObj,"page,limit");
        /**
         * TODO-这里不知道为什么 获取的token变成了双份==》eg：token为123 此处参数token打印出123,123。初步判断是因为map里有token字段了
         */
        log.info("方法：获取课程列表。当前用户token为{}",token);

        MyResponse result;
        if(isHasAll){
//            HashMap res = courseService.getCourseListWithRole((Integer)queryObj.get("page"),(Integer)queryObj.get("limit"),query,token);
            HashMap res = courseService.getCourseListWithRole((Integer)queryObj.get("page"),(Integer)queryObj.get("limit"),query,mytoken);
            result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
        }else{
            result = new MyResponse(MyResponse.Fail_CODE,"获取课程列表失败。参数错误！或是缺失参数或后台接收参数错误！");
        }
        return result;
    }


    @GetMapping("/showcolleges")
    @ResponseBody
    public MyResponse fetchShowCollegesList(@RequestParam String token) {
        log.info("方法：获取课程列表-获取角色可查看的学院列表。当前用户token为{}",token);
        MyResponse result;

        try{
            ArrayList<College> res = courseService.fetchShowCollegesList(token);
            result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
        }catch (Exception e){
            log.error("方法：获取课程列表-获取角色可查看的学院列表 失败。内部错误");
            result = new MyResponse(MyResponse.Fail_CODE,"方法：获取课程列表-获取角色可查看的学院列表 失败。内部错误");
        }
        return result;
    }

    @GetMapping("/showkcxz")
    @ResponseBody
    public MyResponse fetchShowKcxzList(@RequestParam String token) {
        log.info("方法：获取课程列表-获取课程性质列表。当前用户token为{}",token);
        MyResponse result;
        try{
            ArrayList<College> res = courseService.fetchShowKcxzList(token);
            result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
        }catch (Exception e){
            log.error("方法：获取课程列表-获取课程性质列表 失败。内部错误");
            result = new MyResponse(MyResponse.Fail_CODE,"方法：获取课程列表-获取课程性质列表 失败。内部错误");
        }
        return result;
    }


    @PostMapping("/update")
    @ResponseBody
    public MyResponse updateCourseInfo(@RequestParam String data, @RequestParam String token) {

        JSONObject crsUpdateData = JSONObject.parseObject(data);
        log.info("方法：更新课程信息。当前token为{}",token);
        MyResponse result;
        Boolean res = courseService.updateCourseInfo(crsUpdateData,token);
        result = res?
                new MyResponse(MyResponse.SUCCESS_CODE,"update course info success!"):
                new MyResponse(MyResponse.Fail_CODE,"update course info fail!");
        return result;
    }


    @PostMapping("/create")
    @ResponseBody
    public MyResponse createCourseInfo(@RequestParam String data, @RequestParam String token) {

        JSONObject stuCreateData = JSONObject.parseObject(data);
        log.info("方法：新增课程信息。当前token为{}",token);
        MyResponse result;
        HashMap res = courseService.createCourseInfo(stuCreateData,token);
        String flag = (String) res.get(20000);
        result = flag!=null?
                new MyResponse(MyResponse.SUCCESS_CODE,(String) res.get(20000)):
                new MyResponse(MyResponse.Fail_CODE,(String) res.get(18000));
        return result;
    }



    @PostMapping("/delete")
    @ResponseBody
    public MyResponse deleteCourseInfo(@RequestParam String courseId, @RequestParam String token) {
        /**
         * 请求参数==》格式
         * id:XXX token:XXX
         */
        log.info("方法：删除课程信息。当前token为{}",token);
        log.info("方法：删除课程信息。删除编码为 {} 的课程",courseId);
        MyResponse result;
        boolean res = courseService.deleteCourseInfo(courseId);
        result = res?
                new MyResponse(MyResponse.SUCCESS_CODE,"delete course info success!"):
                new MyResponse(MyResponse.Fail_CODE,"delete course info fail!");
        return result;
    }

}
