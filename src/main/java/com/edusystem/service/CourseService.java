package com.edusystem.service;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface CourseService {

    public HashMap getCourseListWithRole(int pageNum, int limit, Map query, String token);

    public ArrayList fetchShowCollegesList(String token);

    public ArrayList fetchShowKcxzList(String token);

    public boolean updateCourseInfo(JSONObject jsonObject, String token);

    public HashMap<Integer,String> createCourseInfo(JSONObject jsonObject, String token) ;

    public boolean deleteCourseInfo(String id) ;
}
