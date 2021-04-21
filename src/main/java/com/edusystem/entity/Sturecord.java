package com.edusystem.entity;

import java.util.Date;

public class Sturecord {
    private String studentId;

    private String sturecordPolite;

    private Date sturecordRdsj;

    private Date sturecordGraduatedate;

    private String sturecordGraduatenumber;

    private String sturecordDiplomanumber;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getSturecordPolite() {
        return sturecordPolite;
    }

    public void setSturecordPolite(String sturecordPolite) {
        this.sturecordPolite = sturecordPolite == null ? null : sturecordPolite.trim();
    }

    public Date getSturecordRdsj() {
        return sturecordRdsj;
    }

    public void setSturecordRdsj(Date sturecordRdsj) {
        this.sturecordRdsj = sturecordRdsj;
    }

    public Date getSturecordGraduatedate() {
        return sturecordGraduatedate;
    }

    public void setSturecordGraduatedate(Date sturecordGraduatedate) {
        this.sturecordGraduatedate = sturecordGraduatedate;
    }

    public String getSturecordGraduatenumber() {
        return sturecordGraduatenumber;
    }

    public void setSturecordGraduatenumber(String sturecordGraduatenumber) {
        this.sturecordGraduatenumber = sturecordGraduatenumber == null ? null : sturecordGraduatenumber.trim();
    }

    public String getSturecordDiplomanumber() {
        return sturecordDiplomanumber;
    }

    public void setSturecordDiplomanumber(String sturecordDiplomanumber) {
        this.sturecordDiplomanumber = sturecordDiplomanumber == null ? null : sturecordDiplomanumber.trim();
    }
}