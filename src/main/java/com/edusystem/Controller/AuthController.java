package com.edusystem.Controller;

import com.alibaba.fastjson.JSONArray;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.service.Impl.RouteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 根据用户的角色获取其可以执行的路由
 * @author 花菜
 * @date 2021/3/31 15:39
 */
@RestController
@RequestMapping("routes")
public class AuthController {
    @Autowired
    public RouteServiceImpl routeService;

    /**
     * 根据用户角色（token）返回路由信息
     */
    @GetMapping("/roleRoutes")
    @ResponseBody
    public MyResponse roleRoutes(@RequestParam String token) {
        JSONArray res = routeService.getRoleRoutes(token);
        MyResponse result = new MyResponse(MyResponse.SUCCESS_CODE,res);
        return result;
    }


    /**
     * 测试：返回超级管理员路由信息
     * 应该修改为根据用户角色返回路由信息 而且前端参数已加 自己改一下
     * @return
     */
    @GetMapping("/superAdminRoutes")
    @ResponseBody
    public MyResponse superAdminRoutes() {
        JSONArray res = routeService.getSuperAdminRoutes();
        MyResponse result = new MyResponse(MyResponse.SUCCESS_CODE,res);
        return result;
    }

    /**
     * 根据角色代码返回其路由信息
     * @return
     */


}
