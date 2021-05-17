package com.edusystem.service;

import java.util.HashMap;
import java.util.Map;

public interface MsgService {
    public HashMap createMsgInfo(Map datamap, String token) ;
    public HashMap getMsgList( String token) ;
    public HashMap huifuMsg( Map datamap, String token) ;
}
