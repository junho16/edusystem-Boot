package com.edusystem.controller;

import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.KqServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/5/3 23:03
 */
@Slf4j
@RestController
@RequestMapping("kq")
public class KqController {

    @Autowired
    KqServiceImpl kqService;

    @GetMapping("/result")
    @ResponseBody
    public MyResponse getkqInfoRes(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：获取考勤任务的考勤结果。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = kqService.getkqInfoRes(data, request.getHeader("token"));

        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "获取考勤任务的考勤结果" ,  res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE ,(String) res.get(18000) , null);
        return result;
    }



    @PostMapping("/kqtask/create")
    @ResponseBody
    public MyResponse createKqTask(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：创建考勤任务。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = kqService.createKqTask(data, request.getHeader("token"));
        String flag = (String) res.get(20000);
        result = flag != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "创建考勤任务成功" , (String) res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE ,(String) res.get(18000) , null);
        return result;
    }



    @PostMapping("/kqdk")
    @ResponseBody
    public MyResponse dwKqDk(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：定位考勤打卡。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = kqService.KqDk(data, request.getHeader("token"));
        String flag = (String) res.get(20000);
        result = flag != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "定位考勤打卡" , (String) res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE ,(String) res.get(18000) , null);
        return result;
    }

    @GetMapping("/list")
    @ResponseBody
    public MyResponse getKqTaskList(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：获取考勤任务列表。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = kqService.getKqTaskList(data, request.getHeader("token"));

        result = res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "获取考勤任务列表" ,  res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE ,(String) res.get(18000) , null);
        return result;
    }

}
