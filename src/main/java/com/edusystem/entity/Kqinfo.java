package com.edusystem.entity;

import java.util.Date;

public class Kqinfo {
    private String kqinfoId;

    private String kqId;

    private String studentId;

    private String studentName;

    private String classId;

    private Integer kqinfoRes;

    private Date kqinfoTime;

    private String teachtaskId;

    private String courseId;

    private String courseName;

    public String getKqinfoId() {
        return kqinfoId;
    }

    public void setKqinfoId(String kqinfoId) {
        this.kqinfoId = kqinfoId == null ? null : kqinfoId.trim();
    }

    public String getKqId() {
        return kqId;
    }

    public void setKqId(String kqId) {
        this.kqId = kqId == null ? null : kqId.trim();
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

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public Integer getKqinfoRes() {
        return kqinfoRes;
    }

    public void setKqinfoRes(Integer kqinfoRes) {
        this.kqinfoRes = kqinfoRes;
    }

    public Date getKqinfoTime() {
        return kqinfoTime;
    }

    public void setKqinfoTime(Date kqinfoTime) {
        this.kqinfoTime = kqinfoTime;
    }

    public String getTeachtaskId() {
        return teachtaskId;
    }

    public void setTeachtaskId(String teachtaskId) {
        this.teachtaskId = teachtaskId == null ? null : teachtaskId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }
}