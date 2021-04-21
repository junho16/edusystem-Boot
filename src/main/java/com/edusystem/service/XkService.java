package com.edusystem.service;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public interface XkService {

    public HashMap<Integer, String> createXkInfo(JSONObject jsonObject, String token);

    public HashMap<Integer, String> selXXKC(String data, String token);

    public HashMap treedata(String token) ;


    public HashMap tabledata(Map query, String token);
}
