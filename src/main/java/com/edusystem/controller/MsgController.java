package com.edusystem.controller;

import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.MsgServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/5/16 14:14
 */
@Slf4j
@RestController
@RequestMapping("msg")
public class MsgController {

    @Autowired
    MsgServiceImpl msgService;


    @PostMapping("/create")
    @ResponseBody
    public MyResponse createMsgInfo(
            HttpServletRequest request,
            @RequestParam Map data) {
        log.info("方法：创建校长信箱记录。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = msgService.createMsgInfo(data, request.getHeader("token"));
        String flag = (String) res.get(20000);
        result = flag != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功",(String) res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000),null);
        return result;
    }

    @GetMapping("/list")
    @ResponseBody
    public MyResponse getMsgList(
            HttpServletRequest request ) {
        log.info("方法：获取校长信箱记录。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = msgService.getMsgList( request.getHeader("token"));

        result =  res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功", res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000),null);
        return result;
    }

    @PostMapping("/huifu")
    @ResponseBody
    public MyResponse huifuMsg(
            HttpServletRequest request ,
            @RequestParam Map data) {
        log.info("方法：回复校长信箱问题。当前token为{}", request.getHeader("token"));
        MyResponse result;
        HashMap res = msgService.huifuMsg( data,request.getHeader("token"));

        result =  res.get(20000) != null ?
                new MyResponse(MyResponse.SUCCESS_CODE, "请求成功", res.get(20000)) :
                new MyResponse(MyResponse.Fail_CODE, (String) res.get(18000),null);
        return result;
    }
}
