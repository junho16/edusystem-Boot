package com.edusystem.entity;

import java.util.Date;

public class Notice {
    private String noticeId;

    private Date noticeTime;

    private String noticeTitle;

    private String noticeFromid;

    private String noticeToid;

    private Integer noticeIsseen;

    private String noticeContent;

    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId == null ? null : noticeId.trim();
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeFromid() {
        return noticeFromid;
    }

    public void setNoticeFromid(String noticeFromid) {
        this.noticeFromid = noticeFromid == null ? null : noticeFromid.trim();
    }

    public String getNoticeToid() {
        return noticeToid;
    }

    public void setNoticeToid(String noticeToid) {
        this.noticeToid = noticeToid == null ? null : noticeToid.trim();
    }

    public Integer getNoticeIsseen() {
        return noticeIsseen;
    }

    public void setNoticeIsseen(Integer noticeIsseen) {
        this.noticeIsseen = noticeIsseen;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }
}