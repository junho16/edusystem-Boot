package com.edusystem.entity;

import java.util.Date;

public class Tip {
    private String tipId;

    private String tipUserid;

    private Integer tipKind;

    private String tipContent;

    private Date tipTime;

    private Integer tipIscheck;

    public String getTipId() {
        return tipId;
    }

    public void setTipId(String tipId) {
        this.tipId = tipId == null ? null : tipId.trim();
    }

    public String getTipUserid() {
        return tipUserid;
    }

    public void setTipUserid(String tipUserid) {
        this.tipUserid = tipUserid == null ? null : tipUserid.trim();
    }

    public Integer getTipKind() {
        return tipKind;
    }

    public void setTipKind(Integer tipKind) {
        this.tipKind = tipKind;
    }

    public String getTipContent() {
        return tipContent;
    }

    public void setTipContent(String tipContent) {
        this.tipContent = tipContent == null ? null : tipContent.trim();
    }

    public Date getTipTime() {
        return tipTime;
    }

    public void setTipTime(Date tipTime) {
        this.tipTime = tipTime;
    }

    public Integer getTipIscheck() {
        return tipIscheck;
    }

    public void setTipIscheck(Integer tipIscheck) {
        this.tipIscheck = tipIscheck;
    }
}