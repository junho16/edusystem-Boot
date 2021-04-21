package com.edusystem.entity;

public class Byqx {
    private Integer byqxId;

    private String studentId;

    private Integer byqxKind;

    private String byqxNameId;

    private String byqxName;

    private Integer byqxMyd;

    public Integer getByqxId() {
        return byqxId;
    }

    public void setByqxId(Integer byqxId) {
        this.byqxId = byqxId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Integer getByqxKind() {
        return byqxKind;
    }

    public void setByqxKind(Integer byqxKind) {
        this.byqxKind = byqxKind;
    }

    public String getByqxNameId() {
        return byqxNameId;
    }

    public void setByqxNameId(String byqxNameId) {
        this.byqxNameId = byqxNameId == null ? null : byqxNameId.trim();
    }

    public String getByqxName() {
        return byqxName;
    }

    public void setByqxName(String byqxName) {
        this.byqxName = byqxName == null ? null : byqxName.trim();
    }

    public Integer getByqxMyd() {
        return byqxMyd;
    }

    public void setByqxMyd(Integer byqxMyd) {
        this.byqxMyd = byqxMyd;
    }
}