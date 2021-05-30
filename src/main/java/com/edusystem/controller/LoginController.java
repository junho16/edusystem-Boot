package com.edusystem.controller;

import com.alibaba.fastjson.JSONObject;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.LoginServiceImpl;
import com.edusystem.util.CommonUtil;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 登录
 * @author 花菜
 * @date 2021/4/1 22:36
 */
@Slf4j
@RestController
public class LoginController {

//    log.info("#########  info  #########");
//    log.debug("#########  debug  #########");
//    log.error("#########  error  #########");

    @Autowired
    LoginServiceImpl loginService;

    /**
     * {"code":20000,"data":{"token":"admin-token"}}
     * {"code":60204,"message":"Account and password are incorrect."}
     * @param requestJson
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public MyResponse login(@RequestBody JSONObject requestJson) {
        boolean isHasAll = CommonUtil.hasAllRequired(requestJson,"username,password,loginrole");
        MyResponse result;
        if(isHasAll){
            boolean isUser = loginService.login((String)requestJson.get("username"),(String)requestJson.get("password"),(String)requestJson.get("loginrole"));
            if(isUser){
                HashMap<String,String> hashMap = new HashMap<>();
                hashMap.put("username",(String)requestJson.get("username"));
                hashMap.put("loginrole",(String)requestJson.get("loginrole") );

                String token =  "{\"token\":\""+ JWTUtils.getToken(hashMap)+"\"}" ;
                JSONObject tokenOnject = JSONObject.parseObject(token);
                result = new MyResponse(MyResponse.SUCCESS_CODE,"请求成功",tokenOnject);
            }else{
                result = new MyResponse(MyResponse.Fail_CODE,"登录失败，账号密码不匹配！","");
            }
        }else{
            //冗余了 因为前端已经校验过是否为空
            result = new MyResponse(MyResponse.Fail_CODE,"字段缺失！","");
        }
        return result;
    }
//    jwt的使用如下=》在token中获取其中的信息
//    @PostMapping("/user/test")
//    public Map<String, Object> test(HttpServletRequest request) {
//        String token = request.getHeader("token");
//        DecodedJWT verify = JWTUtils.verify(token);
//        String id = verify.getClaim("id").asString();
//        String name = verify.getClaim("name").asString();
//        log.info("用户id：{}", id);
//        log.info("用户名: {}", name);
//        业务逻辑
//        Map<String, Object> map = new HashMap<>();
//        map.put("state", true);
//        map.put("msg", "请求成功");
//        return map;
//    }
}
