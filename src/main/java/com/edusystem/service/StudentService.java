package com.edusystem.service;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 花菜
 * @date 2021/4/3 15:54
 */
public interface StudentService {
//    public ArrayList getStudentListWithRole(int pageNuim , int limit , String token);

    public HashMap getStudentListWithRole(int pageNum, int limit, Map query, String token) ;

    public boolean updateStudentInfo(JSONObject jsonObject, String token);

    public HashMap<Integer,String> createStudentInfo(JSONObject jsonObject, String token);

    public boolean deleteStudentInfo(String id);

    public ArrayList getKyjymydData(String token);

    public ArrayList getSnkyjyData(String token) ;

    public HashMap getKyqxData(String token, String classid) ;

    public HashMap getJyqxData(String token, String classid) ;


    public ArrayList getClasses(String token) ;
}
