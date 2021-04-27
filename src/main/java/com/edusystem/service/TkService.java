package com.edusystem.service;

import java.util.HashMap;
import java.util.Map;

public interface TkService {
    public HashMap createTkRecord(Map data, String token);
    public HashMap updateTkRecord(Map data, String token);
    public HashMap getTkDataWithChart(Map data);
    public HashMap getTkDataWithTable(Map data , String token);
    public HashMap fetchTkInfo(String id);
    public HashMap getTkDataWithAdmin(Map data);
}
