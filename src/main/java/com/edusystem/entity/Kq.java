package com.edusystem.entity;

import java.util.Date;

public class Kq {
    private String kqId;

    private String classId;

    private String teachtaskId;

    private String courseId;

    private String courseName;

    private Date kqTime;

    private String teacherId;

    private Integer kqClassnum;

    public String getKqId() {
        return kqId;
    }

    public void setKqId(String kqId) {
        this.kqId = kqId == null ? null : kqId.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
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

    public Date getKqTime() {
        return kqTime;
    }

    public void setKqTime(Date kqTime) {
        this.kqTime = kqTime;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public Integer getKqClassnum() {
        return kqClassnum;
    }

    public void setKqClassnum(Integer kqClassnum) {
        this.kqClassnum = kqClassnum;
    }
}