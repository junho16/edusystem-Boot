package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONArray;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.entity.Route;
import com.edusystem.entity.RouteExample;
import com.edusystem.mapper.RouteMapper;
import com.edusystem.service.RouteService;
import com.edusystem.util.JWTUtils;
import com.edusystem.util.MyUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 花菜
 * @date 2021/4/1 1:32
 */
@Slf4j
@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    public RouteMapper routeMapper;

    /**
     * 根据用户角色获取其路由表信息
     * @return
     */
    @Override
    public JSONArray getRoleRoutes(String token) {
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();
        log.info("获取用户信息==》账号: userId=>{}", username);
        log.info("获取用户信息==》角色: userrole=>{}", loginrole);
        int role_id = MyUtil.getRoleId(loginrole);
        log.info("获取用户角色id==》角色id: role_id=>{}", role_id);
        RouteExample example = new RouteExample();
        RouteExample.Criteria criteria  = example.createCriteria();
        criteria.andRouteRoseEqualTo(role_id);
        List<Route> res = routeMapper.selectByExampleWithBLOBs(example);
        if(res == null){
            return null;
        }else{
            return JSONArray.parseArray(res.get(0).getRouteUse());
        }
    }

    /**
     * 获取超级管理员的路由表信息
     * @return
     */
    @Override
    public JSONArray getSuperAdminRoutes() {
        RouteExample example = new RouteExample();
        RouteExample.Criteria criteria  = example.createCriteria();
        criteria.andRouteRoseEqualTo(0);//0代表超级管理员
        List<Route> res = routeMapper.selectByExampleWithBLOBs(example);
        return JSONArray.parseArray(res.get(0).getRouteUse());

    }

}
