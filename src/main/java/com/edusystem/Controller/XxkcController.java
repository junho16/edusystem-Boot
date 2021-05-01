package com.edusystem.Controller;

import com.alibaba.fastjson.JSONObject;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.XxkcServiceImpl;
import com.edusystem.service.XxkcService;
import com.edusystem.util.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/19 13:47
 */
@Slf4j
@RestController
@RequestMapping("xxkc")
public class XxkcController {

    @Autowired
    XxkcServiceImpl xxkcService;

    @GetMapping("/list")
    @ResponseBody
    public MyResponse fetchXXKCList(@RequestParam Map query, @RequestParam String token) {

        String mytoken = ((String) query.get("token"));
        log.info("方法：获取选修课程列表。-------------当前请求token为{}",token);
        log.info("方法：获取选修课程列表。当前mytoken为{}", mytoken );
        log.info("方法：获取选修课程列表。当前query为{}", query );
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
        log.info("方法：获取选修课程列表。当前用户token为{}",token);

        MyResponse result;
        if(isHasAll){
//            HashMap res = courseService.getCourseListWithRole((Integer)queryObj.get("page"),(Integer)queryObj.get("limit"),query,token);
            HashMap res = xxkcService.fetchXXKCList((Integer)queryObj.get("page"),(Integer)queryObj.get("limit"),query,mytoken);
            result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
        }else{
            result = new MyResponse(MyResponse.Fail_CODE,"获取选修课程列表。参数错误！或是缺失参数或后台接收参数错误！");
        }
        return result;
    }


    @GetMapping("/szkclist")
    @ResponseBody
    public MyResponse fetchSZKCList(@RequestParam Map query, @RequestParam String token) {

        String mytoken = ((String) query.get("token"));
        log.info("方法：获取校内素质选修课程列表。-------------当前请求token为{}",token);
        log.info("方法：获取校内素质选修课程列表。当前mytoken为{}", mytoken );
        log.info("方法：获取校内素质选修课程列表。当前query为{}", query );
        /**
         * 请求参数==》格式 map有两个值
         2
         query={"page":1,"limit":20,"sort":"+id"}
         token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsb2d
         */
        JSONObject queryObj = JSONObject.parseObject((String) query.get("query"));
        boolean isHasAll = CommonUtil.hasAllRequired(queryObj,"page,limit");
        log.info("方法：获取校内素质选修课程列表。当前用户token为{}",token);

        MyResponse result;
        if(isHasAll){
            HashMap res = xxkcService.fetchSZKCList((Integer)queryObj.get("page"),(Integer)queryObj.get("limit"),query,mytoken);
            result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
        }else{
            result = new MyResponse(MyResponse.Fail_CODE,"获取校内素质选修课程列表。参数错误！或是缺失参数或后台接收参数错误！");
        }
        return result;
    }

    @PostMapping("/update")
    @ResponseBody
    public MyResponse updateXXKCInfo(@RequestParam String data, @RequestParam String token) {

        JSONObject crsUpdateData = JSONObject.parseObject(data);
        log.info("方法：更新网课信息。当前token为{}",token);
        MyResponse result;
        Boolean res = xxkcService.updateXXKCInfo(crsUpdateData,token);
        result = res?
                new MyResponse(MyResponse.SUCCESS_CODE,"update xxkc info success!"):
                new MyResponse(MyResponse.Fail_CODE,"update xxkc info fail!");
        return result;
    }

    @PostMapping("/create")
    @ResponseBody
    public MyResponse createXXKCInfo(@RequestParam String data, @RequestParam String token) {
        JSONObject stuCreateData = JSONObject.parseObject(data);
        log.info("方法：新增网课信息。当前token为{}",token);
        MyResponse result;
        HashMap res = xxkcService.createXXKCInfo(stuCreateData,token);
        String flag = (String) res.get(20000);
        result = flag!=null?
                new MyResponse(MyResponse.SUCCESS_CODE,(String) res.get(20000)):
                new MyResponse(MyResponse.Fail_CODE,(String) res.get(18000));
        return result;
    }

    @PostMapping("/delete")
    @ResponseBody
    public MyResponse deleteXXKCInfo(@RequestParam String courseId, @RequestParam String token) {
        /**
         * 请求参数==》格式
         * id:XXX token:XXX
         */
        log.info("方法：删除网课信息。当前token为{}",token);
        log.info("方法：删除网课信息。删除编码为 {} 的课程",courseId);
        MyResponse result;
        boolean res = xxkcService.deleteXXKCInfo(courseId);
        result = res?
                new MyResponse(MyResponse.SUCCESS_CODE,"delete xxkc info success!"):
                new MyResponse(MyResponse.Fail_CODE,"delete xxkc info fail!");
        return result;
    }




}
