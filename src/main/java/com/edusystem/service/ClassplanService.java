package com.edusystem.service;

import java.util.HashMap;
import java.util.Map;

public interface ClassplanService {

    public HashMap zdpk(Map datamap, String token);
    public HashMap repk(Map datamap, String token);
    public HashMap fetchClassPlan(Map datamap, String token);
    public HashMap updateClassPlan(Map datamap, String token);
    public HashMap fetchClassPlanWithRole(Map datamap, String token);

}
