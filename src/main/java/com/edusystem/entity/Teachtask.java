package com.edusystem.entity;

public class Teachtask {
    private String teachtaskId;

    private String professionId;

    private String professionName;

    private String courseId;
    //需要新增其课程名称与课程所属院系
    private String courseName;
    private String collegeId;
    private String collegeName;
    private String teacherName;



    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    private String teacherId;

    private String classId;

    private Integer teachtaskMaxnum;

    private Integer teachtaskSelnum;

    private String teachtaskGradelimit;

    private Integer teachtaskAcademicyear;

    private Integer teachtaskAcademicterm;

    private Integer teachtaskStarttime;

    private Integer teachtaskEndtime;

    private Integer teachtaskIseveryweek;

    private Integer teachtaskNumlimit;

    private Integer teachtaskPriority;

    private Integer teachtaskIsrank;

    private String teachtaskRemaerk;

    public String getTeachtaskId() {
        return teachtaskId;
    }

    public void setTeachtaskId(String teachtaskId) {
        this.teachtaskId = teachtaskId == null ? null : teachtaskId.trim();
    }

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId == null ? null : professionId.trim();
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName == null ? null : professionName.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public Integer getTeachtaskMaxnum() {
        return teachtaskMaxnum;
    }

    public void setTeachtaskMaxnum(Integer teachtaskMaxnum) {
        this.teachtaskMaxnum = teachtaskMaxnum;
    }

    public Integer getTeachtaskSelnum() {
        return teachtaskSelnum;
    }

    public void setTeachtaskSelnum(Integer teachtaskSelnum) {
        this.teachtaskSelnum = teachtaskSelnum;
    }

    public String getTeachtaskGradelimit() {
        return teachtaskGradelimit;
    }

    public void setTeachtaskGradelimit(String teachtaskGradelimit) {
        this.teachtaskGradelimit = teachtaskGradelimit == null ? null : teachtaskGradelimit.trim();
    }

    public Integer getTeachtaskAcademicyear() {
        return teachtaskAcademicyear;
    }

    public void setTeachtaskAcademicyear(Integer teachtaskAcademicyear) {
        this.teachtaskAcademicyear = teachtaskAcademicyear;
    }

    public Integer getTeachtaskAcademicterm() {
        return teachtaskAcademicterm;
    }

    public void setTeachtaskAcademicterm(Integer teachtaskAcademicterm) {
        this.teachtaskAcademicterm = teachtaskAcademicterm;
    }

    public Integer getTeachtaskStarttime() {
        return teachtaskStarttime;
    }

    public void setTeachtaskStarttime(Integer teachtaskStarttime) {
        this.teachtaskStarttime = teachtaskStarttime;
    }

    public Integer getTeachtaskEndtime() {
        return teachtaskEndtime;
    }

    public void setTeachtaskEndtime(Integer teachtaskEndtime) {
        this.teachtaskEndtime = teachtaskEndtime;
    }

    public Integer getTeachtaskIseveryweek() {
        return teachtaskIseveryweek;
    }

    public void setTeachtaskIseveryweek(Integer teachtaskIseveryweek) {
        this.teachtaskIseveryweek = teachtaskIseveryweek;
    }

    public Integer getTeachtaskNumlimit() {
        return teachtaskNumlimit;
    }

    public void setTeachtaskNumlimit(Integer teachtaskNumlimit) {
        this.teachtaskNumlimit = teachtaskNumlimit;
    }

    public Integer getTeachtaskPriority() {
        return teachtaskPriority;
    }

    public void setTeachtaskPriority(Integer teachtaskPriority) {
        this.teachtaskPriority = teachtaskPriority;
    }

    public Integer getTeachtaskIsrank() {
        return teachtaskIsrank;
    }

    public void setTeachtaskIsrank(Integer teachtaskIsrank) {
        this.teachtaskIsrank = teachtaskIsrank;
    }

    public String getTeachtaskRemaerk() {
        return teachtaskRemaerk;
    }

    public void setTeachtaskRemaerk(String teachtaskRemaerk) {
        this.teachtaskRemaerk = teachtaskRemaerk == null ? null : teachtaskRemaerk.trim();
    }
}