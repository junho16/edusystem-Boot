package com.edusystem.entity;

import java.util.Date;

public class Tk {
    private String tkId;

    private String tkTkjsid;

    private String tkBtkjsid;

    private String teachtaskId;

    private Integer tkNeednum;

    private Integer tkRealnum;

    private Integer tkScore;

    private String tkComments;

    private Date tkTime;

    public String getTkId() {
        return tkId;
    }

    public void setTkId(String tkId) {
        this.tkId = tkId == null ? null : tkId.trim();
    }

    public String getTkTkjsid() {
        return tkTkjsid;
    }

    public void setTkTkjsid(String tkTkjsid) {
        this.tkTkjsid = tkTkjsid == null ? null : tkTkjsid.trim();
    }

    public String getTkBtkjsid() {
        return tkBtkjsid;
    }

    public void setTkBtkjsid(String tkBtkjsid) {
        this.tkBtkjsid = tkBtkjsid == null ? null : tkBtkjsid.trim();
    }

    public String getTeachtaskId() {
        return teachtaskId;
    }

    public void setTeachtaskId(String teachtaskId) {
        this.teachtaskId = teachtaskId == null ? null : teachtaskId.trim();
    }

    public Integer getTkNeednum() {
        return tkNeednum;
    }

    public void setTkNeednum(Integer tkNeednum) {
        this.tkNeednum = tkNeednum;
    }

    public Integer getTkRealnum() {
        return tkRealnum;
    }

    public void setTkRealnum(Integer tkRealnum) {
        this.tkRealnum = tkRealnum;
    }

    public Integer getTkScore() {
        return tkScore;
    }

    public void setTkScore(Integer tkScore) {
        this.tkScore = tkScore;
    }

    public String getTkComments() {
        return tkComments;
    }

    public void setTkComments(String tkComments) {
        this.tkComments = tkComments == null ? null : tkComments.trim();
    }

    public Date getTkTime() {
        return tkTime;
    }

    public void setTkTime(Date tkTime) {
        this.tkTime = tkTime;
    }
}