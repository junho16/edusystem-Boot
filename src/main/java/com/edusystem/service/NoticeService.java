package com.edusystem.service;

import java.util.HashMap;
import java.util.Map;

public interface NoticeService {
    public HashMap getNoticeList(Map data, String token);

    public HashMap getMySendNoticeList(Map data, String token);

    public HashMap createNoticeInfo(Map data,  String token);

    public HashMap createNoticeCommentInfo(Map data,  String token);

    public HashMap updateNoticeState(String noticeid, int state);
}
