package com.edusystem.service;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/17 17:42
 */
public interface TeachtaskService {

    public HashMap<Integer,String> createTeachtaskInfo(JSONObject jsonObject, String token) ;

    public HashMap getTeachtaskListWithRole(int pageNum, int limit, Map query, String token) ;

    public ArrayList fetchTeacherList(String token);

    public boolean handleTeachtaskStatus(String id, String status, String token);
}
