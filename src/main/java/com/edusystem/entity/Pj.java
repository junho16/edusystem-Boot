package com.edusystem.entity;

public class Pj {
    private String pjId;

    private String teacherId;

    private String studentId;

    private String teachtaskId;

    private String pjxId;

    private String pjxName;

    private Integer pjRes;

    private String pjRemark;

    public String getPjId() {
        return pjId;
    }

    public void setPjId(String pjId) {
        this.pjId = pjId == null ? null : pjId.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getTeachtaskId() {
        return teachtaskId;
    }

    public void setTeachtaskId(String teachtaskId) {
        this.teachtaskId = teachtaskId == null ? null : teachtaskId.trim();
    }

    public String getPjxId() {
        return pjxId;
    }

    public void setPjxId(String pjxId) {
        this.pjxId = pjxId == null ? null : pjxId.trim();
    }

    public String getPjxName() {
        return pjxName;
    }

    public void setPjxName(String pjxName) {
        this.pjxName = pjxName == null ? null : pjxName.trim();
    }

    public Integer getPjRes() {
        return pjRes;
    }

    public void setPjRes(Integer pjRes) {
        this.pjRes = pjRes;
    }

    public String getPjRemark() {
        return pjRemark;
    }

    public void setPjRemark(String pjRemark) {
        this.pjRemark = pjRemark == null ? null : pjRemark.trim();
    }
}