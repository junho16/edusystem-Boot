package com.edusystem.entity;

import java.util.Date;
import java.util.List;

public class Notice {
    private String noticeId;

    private Date noticeTime;

    private String noticeTitle;

    private String noticeFromid;

    private String noticeToid;

    private Integer noticeIsseen;

    private String noticeKind;

    private String noticePid;

    private String noticeContent;

    private String notice_fromUserName;
    private String notice_fromUserRole;
    private String notice_fromPic;

    private List<Notice> notice_comments;
//    private String notice_fromName;


    @Override
    public String toString() {
        return "Notice{" +
                "noticeId='" + noticeId + '\'' +
                ", noticeTime=" + noticeTime +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeFromid='" + noticeFromid + '\'' +
                ", noticeToid='" + noticeToid + '\'' +
                ", noticeIsseen=" + noticeIsseen +
                ", noticeKind='" + noticeKind + '\'' +
                ", noticePid='" + noticePid + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", notice_fromUserName='" + notice_fromUserName + '\'' +
                ", notice_fromUserRole='" + notice_fromUserRole + '\'' +
                ", notice_fromPic='" + notice_fromPic + '\'' +
                ", notice_comments=" + notice_comments +
                '}';
    }

    public List<Notice> getNotice_comments() {
        return notice_comments;
    }

    public void setNotice_comments(List<Notice> notice_comments) {
        this.notice_comments = notice_comments;
    }

    public String getNotice_fromUserName() {
        return notice_fromUserName;
    }

    public void setNotice_fromUserName(String notice_fromUserName) {
        this.notice_fromUserName = notice_fromUserName;
    }

    public String getNotice_fromUserRole() {
        return notice_fromUserRole;
    }

    public void setNotice_fromUserRole(String notice_fromUserRole) {
        this.notice_fromUserRole = notice_fromUserRole;
    }

    public String getNotice_fromPic() {
        return notice_fromPic;
    }

    public void setNotice_fromPic(String notice_fromPic) {
        this.notice_fromPic = notice_fromPic;
    }

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

    public String getNoticeKind() {
        return noticeKind;
    }

    public void setNoticeKind(String noticeKind) {
        this.noticeKind = noticeKind == null ? null : noticeKind.trim();
    }

    public String getNoticePid() {
        return noticePid;
    }

    public void setNoticePid(String noticePid) {
        this.noticePid = noticePid == null ? null : noticePid.trim();
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }
}