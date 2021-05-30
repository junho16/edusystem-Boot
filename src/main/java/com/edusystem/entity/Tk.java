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

    private Date tkTime;

    private String tkClasses;

    private String tkContentShort;

    private String tkJc;

    private String tkTitle;

    //    任课教师 学年 学期 课程名
    private String tk_btkTeacherName;
    private String tk_AcaYear;
    private String tk_AcaTerm;
    private String tk_CourseName;
    private String tk_College;
    private String tk_tkTeacherName;

    public String getTk_tkTeacherName() {
        return tk_tkTeacherName;
    }

    public void setTk_tkTeacherName(String tk_tkTeacherName) {
        this.tk_tkTeacherName = tk_tkTeacherName;
    }

    public String getTk_College() {
        return tk_College;
    }

    public void setTk_College(String tk_College) {
        this.tk_College = tk_College;
    }

    public String getTk_btkTeacherName() {
        return tk_btkTeacherName;
    }

    public void setTk_btkTeacherName(String tk_btkTeacherName) {
        this.tk_btkTeacherName = tk_btkTeacherName;
    }

    public String getTk_AcaYear() {
        return tk_AcaYear;
    }

    public void setTk_AcaYear(String tk_AcaYear) {
        this.tk_AcaYear = tk_AcaYear;
    }

    public String getTk_AcaTerm() {
        return tk_AcaTerm;
    }

    public void setTk_AcaTerm(String tk_AcaTerm) {
        this.tk_AcaTerm = tk_AcaTerm;
    }

    public String getTk_CourseName() {
        return tk_CourseName;
    }

    public void setTk_CourseName(String tk_CourseName) {
        this.tk_CourseName = tk_CourseName;
    }

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

    public Date getTkTime() {
        return tkTime;
    }

    public void setTkTime(Date tkTime) {
        this.tkTime = tkTime;
    }

    public String getTkClasses() {
        return tkClasses;
    }

    public void setTkClasses(String tkClasses) {
        this.tkClasses = tkClasses == null ? null : tkClasses.trim();
    }

    public String getTkContentShort() {
        return tkContentShort;
    }

    public void setTkContentShort(String tkContentShort) {
        this.tkContentShort = tkContentShort == null ? null : tkContentShort.trim();
    }

    public String getTkJc() {
        return tkJc;
    }

    public void setTkJc(String tkJc) {
        this.tkJc = tkJc == null ? null : tkJc.trim();
    }

    public String getTkTitle() {
        return tkTitle;
    }

    public void setTkTitle(String tkTitle) {
        this.tkTitle = tkTitle == null ? null : tkTitle.trim();
    }

    @Override
    public String toString() {
        return "Tk{" +
                "tkId='" + tkId + '\'' +
                ", tkTkjsid='" + tkTkjsid + '\'' +
                ", tkBtkjsid='" + tkBtkjsid + '\'' +
                ", teachtaskId='" + teachtaskId + '\'' +
                ", tkNeednum=" + tkNeednum +
                ", tkRealnum=" + tkRealnum +
                ", tkScore=" + tkScore +
                ", tkTime=" + tkTime +
                ", tkClasses='" + tkClasses + '\'' +
                ", tkContentShort='" + tkContentShort + '\'' +
                ", tkJc='" + tkJc + '\'' +
                ", tkTitle='" + tkTitle + '\'' +
                ", tk_btkTeacherName='" + tk_btkTeacherName + '\'' +
                ", tk_AcaYear='" + tk_AcaYear + '\'' +
                ", tk_AcaTerm='" + tk_AcaTerm + '\'' +
                ", tk_CourseName='" + tk_CourseName + '\'' +
                ", tk_College='" + tk_College + '\'' +
                ", tk_tkTeacherName='" + tk_tkTeacherName + '\'' +
                '}';
    }
}