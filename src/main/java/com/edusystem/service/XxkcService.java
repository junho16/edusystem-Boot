package com.edusystem.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

public interface XxkcService {
    public HashMap fetchXXKCList(int pageNum, int limit, Map query, String token) ;

    public HashMap fetchSZKCList(int pageNum, int limit, Map query, String token) ;



    public boolean updateXXKCInfo(JSONObject data, @RequestParam String token) ;

    public HashMap<Integer,String> createXXKCInfo(JSONObject jsonObject, String token) ;

    public boolean deleteXXKCInfo(String id) ;


}

