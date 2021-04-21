package com.edusystem.dto;
/**
 * @author 花菜
 * @date 2021/4/20 22:31
 */
public class XXKCDto {
    /**
    *  kcId: null,
    *  kcName: null,
    *  kcTeacher: null,
    *  kcSourseid: null,
    *  kcKindid: null,
    *  kcSourse: null,
    *  kcKind: null,
    *  kcAcademicyear: null,
    *  kcAcademicterm: null,
    *  kcStarttime: null,
    *  kcEndtime: null,
    *  kcCredit: null,
    *  kcLearnHours: null,
    *  kcIseveryweek : null,
    *  kcNumlimit: null,
    *  kcMaxlimit: null,
    *  kcSelnum: null,
    *  kcIsrank: null,
     *
     *  kcClassid
    */
    private String kcId;
    private String kcName;
    private String kcTeacher;
    private String kcSourseid;
    private String kcKindid;
    private String kcSourse;
    private String kcKind;
    private String kcAcademicyear;
    private String kcAcademicterm;
    private String kcStarttime;
    private String kcEndtime;
    private String kcCredit;
    private String kcLearnHours;
    private String kcIseveryweek ;
    private String kcNumlimit;
    private String kcMaxlimit;
    private String kcSelnum;
    private String kcIsrank;

    //新加一个字段来判断是否为校内素质选修课
    private String kcClassid;

    public String getKcClassid() {
        return kcClassid;
    }

    public void setKcClassid(String kcClassid) {
        this.kcClassid = kcClassid;
    }

    public String getKcId() {
        return kcId;
    }

    public void setKcId(String kcId) {
        this.kcId = kcId;
    }

    public String getKcName() {
        return kcName;
    }

    public void setKcName(String kcName) {
        this.kcName = kcName;
    }

    public String getKcTeacher() {
        return kcTeacher;
    }

    public void setKcTeacher(String kcTeacher) {
        this.kcTeacher = kcTeacher;
    }

    public String getKcSourseid() {
        return kcSourseid;
    }

    public void setKcSourseid(String kcSourseid) {
        this.kcSourseid = kcSourseid;
    }

    public String getKcKindid() {
        return kcKindid;
    }

    public void setKcKindid(String kcKindid) {
        this.kcKindid = kcKindid;
    }

    public String getKcSourse() {
        return kcSourse;
    }

    public void setKcSourse(String kcSourse) {
        this.kcSourse = kcSourse;
    }

    public String getKcKind() {
        return kcKind;
    }

    public void setKcKind(String kcKind) {
        this.kcKind = kcKind;
    }

    public String getKcAcademicyear() {
        return kcAcademicyear;
    }

    public void setKcAcademicyear(String kcAcademicyear) {
        this.kcAcademicyear = kcAcademicyear;
    }

    public String getKcAcademicterm() {
        return kcAcademicterm;
    }

    public void setKcAcademicterm(String kcAcademicterm) {
        this.kcAcademicterm = kcAcademicterm;
    }

    public String getKcStarttime() {
        return kcStarttime;
    }

    public void setKcStarttime(String kcStarttime) {
        this.kcStarttime = kcStarttime;
    }

    public String getKcEndtime() {
        return kcEndtime;
    }

    public void setKcEndtime(String kcEndtime) {
        this.kcEndtime = kcEndtime;
    }

    public String getKcCredit() {
        return kcCredit;
    }

    public void setKcCredit(String kcCredit) {
        this.kcCredit = kcCredit;
    }

    public String getKcLearnHours() {
        return kcLearnHours;
    }

    public void setKcLearnHours(String kcLearnHours) {
        this.kcLearnHours = kcLearnHours;
    }

    public String getKcIseveryweek() {
        return kcIseveryweek;
    }

    public void setKcIseveryweek(String kcIseveryweek) {
        this.kcIseveryweek = kcIseveryweek;
    }

    public String getKcNumlimit() {
        return kcNumlimit;
    }

    public void setKcNumlimit(String kcNumlimit) {
        this.kcNumlimit = kcNumlimit;
    }

    public String getKcMaxlimit() {
        return kcMaxlimit;
    }

    public void setKcMaxlimit(String kcMaxlimit) {
        this.kcMaxlimit = kcMaxlimit;
    }

    public String getKcSelnum() {
        return kcSelnum;
    }

    public void setKcSelnum(String kcSelnum) {
        this.kcSelnum = kcSelnum;
    }

    public String getKcIsrank() {
        return kcIsrank;
    }

    public void setKcIsrank(String kcIsrank) {
        this.kcIsrank = kcIsrank;
    }
}
