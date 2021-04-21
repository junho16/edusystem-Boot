package com.edusystem.entity;

public class Classplan {
    private String classplanId;

    private String teachtaskId;

    private String courseName;

    private String classroomId;

    private String classroomName;

    private String teacherId;

    private String teacherName;

    private String classplanTime;

    private Integer classplanClassnum;

    private Integer classplanDay;

    private Integer classplanWeek;

    public String getClassplanId() {
        return classplanId;
    }

    public void setClassplanId(String classplanId) {
        this.classplanId = classplanId == null ? null : classplanId.trim();
    }

    public String getTeachtaskId() {
        return teachtaskId;
    }

    public void setTeachtaskId(String teachtaskId) {
        this.teachtaskId = teachtaskId == null ? null : teachtaskId.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId == null ? null : classroomId.trim();
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName == null ? null : classroomName.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getClassplanTime() {
        return classplanTime;
    }

    public void setClassplanTime(String classplanTime) {
        this.classplanTime = classplanTime == null ? null : classplanTime.trim();
    }

    public Integer getClassplanClassnum() {
        return classplanClassnum;
    }

    public void setClassplanClassnum(Integer classplanClassnum) {
        this.classplanClassnum = classplanClassnum;
    }

    public Integer getClassplanDay() {
        return classplanDay;
    }

    public void setClassplanDay(Integer classplanDay) {
        this.classplanDay = classplanDay;
    }

    public Integer getClassplanWeek() {
        return classplanWeek;
    }

    public void setClassplanWeek(Integer classplanWeek) {
        this.classplanWeek = classplanWeek;
    }
}