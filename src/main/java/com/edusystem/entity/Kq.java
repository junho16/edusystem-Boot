package com.edusystem.entity;

import java.math.BigDecimal;
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

    private Integer kqKind;

    private String kqAddress;

    private Integer kqFw;

    private String kqQdah;

    private BigDecimal kqLatitude;

    private BigDecimal kqLongitude;

    private Date kqStopTime;

    private String kqWifiAme;

    private String kqWifiId;

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

    public Integer getKqKind() {
        return kqKind;
    }

    public void setKqKind(Integer kqKind) {
        this.kqKind = kqKind;
    }

    public String getKqAddress() {
        return kqAddress;
    }

    public void setKqAddress(String kqAddress) {
        this.kqAddress = kqAddress == null ? null : kqAddress.trim();
    }

    public Integer getKqFw() {
        return kqFw;
    }

    public void setKqFw(Integer kqFw) {
        this.kqFw = kqFw;
    }

    public String getKqQdah() {
        return kqQdah;
    }

    public void setKqQdah(String kqQdah) {
        this.kqQdah = kqQdah == null ? null : kqQdah.trim();
    }

    public BigDecimal getKqLatitude() {
        return kqLatitude;
    }

    public void setKqLatitude(BigDecimal kqLatitude) {
        this.kqLatitude = kqLatitude;
    }

    public BigDecimal getKqLongitude() {
        return kqLongitude;
    }

    public void setKqLongitude(BigDecimal kqLongitude) {
        this.kqLongitude = kqLongitude;
    }

    public Date getKqStopTime() {
        return kqStopTime;
    }

    public void setKqStopTime(Date kqStopTime) {
        this.kqStopTime = kqStopTime;
    }

    public String getKqWifiAme() {
        return kqWifiAme;
    }

    public void setKqWifiAme(String kqWifiAme) {
        this.kqWifiAme = kqWifiAme == null ? null : kqWifiAme.trim();
    }

    public String getKqWifiId() {
        return kqWifiId;
    }

    public void setKqWifiId(String kqWifiId) {
        this.kqWifiId = kqWifiId == null ? null : kqWifiId.trim();
    }
}