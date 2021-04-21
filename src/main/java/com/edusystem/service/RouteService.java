package com.edusystem.service;

import com.alibaba.fastjson.JSONArray;

/**
 * @author 花菜
 * @date 2021/4/1 1:32
 */
public interface RouteService {

    JSONArray getSuperAdminRoutes();
    JSONArray getRoleRoutes(String token);
}
