package com.edusystem.entity;

public class Clsandstu {
    private String clsandstuId;

    private String teachtaskId;

    private String studentId;

    public String getClsandstuId() {
        return clsandstuId;
    }

    public void setClsandstuId(String clsandstuId) {
        this.clsandstuId = clsandstuId == null ? null : clsandstuId.trim();
    }

    public String getTeachtaskId() {
        return teachtaskId;
    }

    public void setTeachtaskId(String teachtaskId) {
        this.teachtaskId = teachtaskId == null ? null : teachtaskId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }
}