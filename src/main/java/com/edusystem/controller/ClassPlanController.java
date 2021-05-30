package com.edusystem.controller;

import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.ClassplanServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/5/5 17:08
 */
@Slf4j
@RestController
@RequestMapping("classplan")
public class ClassPlanController {

    @Autowired
    ClassplanServiceImpl classplanService;

    /**
     * 学年 学期 课程任务id      教室*时间（一周5*4节课）
     * ==》排：
     * 学年 学期 的课程任务先找到
     * 遍历任务
     * 所有教室 5 * 4（随机10次 看数据库里是否有 如果都有 就全部遍历）
     *
     * ==》存：学年 学期 第几周(要不要呢？先不存) 周几 哪一节 哪个教室 哪个课程任务
     * ==》查：学年 学期 第几周(要不要呢？先不存) ==》找其课程任务 找周几 哪一节 哪个教室
     */
    @PostMapping("/paike")
    @ResponseBody
    public MyResponse zdpk(
            HttpServletRequest request,
            @RequestParam Map data) {


        log.info("方法：自动排课。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = classplanService.zdpk(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE,"请求成功", res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE,"请求失败",  res.get(18000));
        return result;
    }

    @PostMapping("/repk")
    @ResponseBody
    public MyResponse repk(
            HttpServletRequest request,
            @RequestParam Map data) {


        log.info("方法：重新排课。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = classplanService.repk(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }

    @PostMapping("/update")
    @ResponseBody
    public MyResponse updateClassPlan(
            HttpServletRequest request,
            @RequestParam Map data) {


        log.info("方法：人工手动换课。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = classplanService.updateClassPlan(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }


    /**
     * 获取指定学年、学期下的课表安排
     * @param request
     * @param data
     * @return
     */
    @GetMapping("/data")
    @ResponseBody
    public MyResponse fetchClassPlan(
            HttpServletRequest request,
            @RequestParam Map data) {


        log.info("方法：获取指定学年、学期下的课表安排。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = classplanService.fetchClassPlan(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }

    @GetMapping("/data/role")
    @ResponseBody
    public MyResponse fetchClassPlanWithRole(
            HttpServletRequest request,
            @RequestParam Map data) {


        log.info("方法：获取教师或者学生的视角下的课程编排列表。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = classplanService.fetchClassPlanWithRole(data, request.getHeader("token"));
        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功" , res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String)res.get(18000),null);
        return result;
    }

}
