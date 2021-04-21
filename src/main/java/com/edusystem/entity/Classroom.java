package com.edusystem.entity;

public class Classroom {
    private String classroomId;

    private String classroomName;

    private Integer classroomMaxnum;

    private String classroomKind;

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

    public Integer getClassroomMaxnum() {
        return classroomMaxnum;
    }

    public void setClassroomMaxnum(Integer classroomMaxnum) {
        this.classroomMaxnum = classroomMaxnum;
    }

    public String getClassroomKind() {
        return classroomKind;
    }

    public void setClassroomKind(String classroomKind) {
        this.classroomKind = classroomKind == null ? null : classroomKind.trim();
    }
}