package com.edusystem.service;

import java.util.HashMap;
import java.util.Map;

public interface KqService {
    public HashMap createKqTask(Map datamap, String token);
    public HashMap KqDk(Map datamap, String token);
    public HashMap getKqTaskList(Map datamap, String token);
    public HashMap getkqInfoRes(Map datamap, String token);
}
