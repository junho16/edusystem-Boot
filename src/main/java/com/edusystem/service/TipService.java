package com.edusystem.service;

import java.util.HashMap;
import java.util.Map;

public interface TipService {
    public HashMap getTipList(Map data, String username);

    public HashMap updateTipState(String noticeid, int state);

    public HashMap createTip(String userid, int kind  , Map datamap) ;
}
