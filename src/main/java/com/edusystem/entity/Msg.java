package com.edusystem.entity;

import java.util.Date;

public class Msg {
    private String msgId;

    private String studentId;

    private String studentName;

    private String msgTitle;

    private String msgContent;

    private Date msgCreatetime;

    private String msgIsreply;

    private String msgReplycontent;

    private Date msgReplytime;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    public Date getMsgCreatetime() {
        return msgCreatetime;
    }

    public void setMsgCreatetime(Date msgCreatetime) {
        this.msgCreatetime = msgCreatetime;
    }

    public String getMsgIsreply() {
        return msgIsreply;
    }

    public void setMsgIsreply(String msgIsreply) {
        this.msgIsreply = msgIsreply == null ? null : msgIsreply.trim();
    }

    public String getMsgReplycontent() {
        return msgReplycontent;
    }

    public void setMsgReplycontent(String msgReplycontent) {
        this.msgReplycontent = msgReplycontent == null ? null : msgReplycontent.trim();
    }

    public Date getMsgReplytime() {
        return msgReplytime;
    }

    public void setMsgReplytime(Date msgReplytime) {
        this.msgReplytime = msgReplytime;
    }
}