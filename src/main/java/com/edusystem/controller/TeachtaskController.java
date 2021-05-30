package com.edusystem.controller;

import com.alibaba.fastjson.JSONObject;
import com.edusystem.entity.College;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.TeachtaskServiceImpl;
import com.edusystem.util.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/17 17:40
 */
@Slf4j
@RestController
@RequestMapping("teachtask")
public class TeachtaskController {

    @Autowired
    TeachtaskServiceImpl teachtaskService;

    @PostMapping("/create")
    @ResponseBody
    public MyResponse createTeachtaskInfo(@RequestParam String data, @RequestParam String token) {

        JSONObject stuCreateData = JSONObject.parseObject(data);
        log.info("方法：新增授课信息。当前token为{}",token);
        MyResponse result;
        HashMap res = teachtaskService.createTeachtaskInfo(stuCreateData,token);
        String flag = (String) res.get(20000);
        result = flag!=null?
                new MyResponse(MyResponse.SUCCESS_CODE,(String) res.get(20000),(String) res.get(20000)):
                new MyResponse(MyResponse.Fail_CODE,(String) res.get(18000),(String) res.get(18000));
        return result;
    }

    @GetMapping("/list")
    @ResponseBody
    public MyResponse fetchTeachTaskList(@RequestParam Map query, @RequestParam String token) {
//        System.out.println(data);
//        HashMap query = data;
//        System.out.println(JSON.parse(data));
//        JSONObject jsonObject = JSON.parseObject(data);
//        System.out.println(jsonObject);
//        HashMap query = JSON.parseObject(data, HashMap.class);
//        HashMap query = (HashMap) data;
        System.out.println(query);
        String mytoken = ((String) query.get("token"));
        log.info("方法：获取教学任务列表。-------------当前请求token为{}",token);
        log.info("方法：获取教学任务列表。当前mytoken为{}", mytoken );
        log.info("方法：获取教学任务列表。当前query为{}", query );
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
        log.info("方法：获取教学任务列表。当前用户token为{}",token);

        MyResponse result;
        if(isHasAll){
//            HashMap res = courseService.getCourseListWithRole((Integer)queryObj.get("page"),(Integer)queryObj.get("limit"),query,token);
            HashMap res = teachtaskService.getTeachtaskListWithRole((Integer)queryObj.get("page"),(Integer)queryObj.get("limit"),query,mytoken);
            result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
        }else{
            result = new MyResponse(MyResponse.Fail_CODE,"获取教学任务列表失败。参数错误！或是缺失参数或后台接收参数错误！","获取教学任务列表失败。参数错误！或是缺失参数或后台接收参数错误！");
        }
        return result;
    }


    /**
     * 其实此方法应该写在教师controller里
     * 获取当前用户可以查看的哪些学院里有哪些老师
     * @param token
     * @return
     */
    @GetMapping("/teacherlist")
    @ResponseBody
    public MyResponse teacherlist(@RequestParam String token) {

        log.info("方法：获取教师列表。当前用户token为{}",token);

        MyResponse result;
        try{
            ArrayList<College> res = teachtaskService.fetchTeacherList(token);
            result = new MyResponse(MyResponse.SUCCESS_CODE,"success!",res);
        }catch (Exception e){
            log.error("方法：获取教师列表。内部错误");
            result = new MyResponse(MyResponse.Fail_CODE,"方法：获取教师列表。内部错误","方法：获取教师列表。内部错误");
        }
        return result;
    }

    /**
     * 更改教师 教学任务申请 状态
     * @param id
     * @param status
     * @param token
     * @return
     */
    @PostMapping("/status")
    @ResponseBody
    public MyResponse handleTeachtaskStatus(@RequestParam String id , @RequestParam String status , @RequestParam String token) {

        log.info("方法：更改教学任务 申请状态 。当前用户token为{}",token);

        MyResponse result;
        try{
            boolean res = teachtaskService.handleTeachtaskStatus(id, status, token);
            if(res) result = new MyResponse(MyResponse.SUCCESS_CODE,"success!");
            else result = new MyResponse(MyResponse.Fail_CODE,"fail");
        }catch (Exception e){
            log.error("方法：更改教学任务 申请状态。内部错误");
            result = new MyResponse(MyResponse.Fail_CODE,"方法：更改教学任务 申请状态。内部错误","方法：更改教学任务 申请状态。内部错误");
        }
        return result;
    }


}
