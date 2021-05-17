package com.edusystem.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

public class Student {
    private String studentId;

    private String studentIdnumber;

    private String collegeId;

    private String classId;

    private String studentName;

    private String studentGender;

    private Integer studentAge;

    private String studentPsd;

    private Date studentBirthday;

    private String studentRoomid;

    private String studentEthnic;

    private String studentRxrq;

    private String studentHometown;

    private String studentAddress;

    private String studentEmail;

    private String studentPhone;

    private Integer studentXgbz;

    private String studentPic;


    private String score_ps ;
    private String score_sy ;
    private String score_qz ;
    private String score_qm ;
    private String score_kq ;
    private String score_kf ;
    private Boolean show ;

    public String getScore_kq() {
        return score_kq;
    }

    public void setScore_kq(String score_kq) {
        this.score_kq = score_kq;
    }

    public String getScore_kf() {
        return score_kf;
    }

    public void setScore_kf(String score_kf) {
        this.score_kf = score_kf;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public String getScore_ps() {
        return score_ps;
    }

    public void setScore_ps(String score_ps) {
        this.score_ps = score_ps;
    }

    public String getScore_sy() {
        return score_sy;
    }

    public void setScore_sy(String score_sy) {
        this.score_sy = score_sy;
    }

    public String getScore_qz() {
        return score_qz;
    }

    public void setScore_qz(String score_qz) {
        this.score_qz = score_qz;
    }

    public String getScore_qm() {
        return score_qm;
    }

    public void setScore_qm(String score_qm) {
        this.score_qm = score_qm;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentIdnumber() {
        return studentIdnumber;
    }

    public void setStudentIdnumber(String studentIdnumber) {
        this.studentIdnumber = studentIdnumber == null ? null : studentIdnumber.trim();
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender == null ? null : studentGender.trim();
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentPsd() {
        return studentPsd;
    }

    public void setStudentPsd(String studentPsd) {
        this.studentPsd = studentPsd == null ? null : studentPsd.trim();
    }

    public Date getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getStudentRoomid() {
        return studentRoomid;
    }

    public void setStudentRoomid(String studentRoomid) {
        this.studentRoomid = studentRoomid == null ? null : studentRoomid.trim();
    }

    public String getStudentEthnic() {
        return studentEthnic;
    }

    public void setStudentEthnic(String studentEthnic) {
        this.studentEthnic = studentEthnic == null ? null : studentEthnic.trim();
    }

    public String getStudentRxrq() {
        return studentRxrq;
    }

    public void setStudentRxrq(String studentRxrq) {
        this.studentRxrq = studentRxrq == null ? null : studentRxrq.trim();
    }

    public String getStudentHometown() {
        return studentHometown;
    }

    public void setStudentHometown(String studentHometown) {
        this.studentHometown = studentHometown == null ? null : studentHometown.trim();
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress == null ? null : studentAddress.trim();
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail == null ? null : studentEmail.trim();
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone == null ? null : studentPhone.trim();
    }

    public Integer getStudentXgbz() {
        return studentXgbz;
    }

    public void setStudentXgbz(Integer studentXgbz) {
        this.studentXgbz = studentXgbz;
    }

    public String getStudentPic() {
        return studentPic;
    }

    public void setStudentPic(String studentPic) {
        this.studentPic = studentPic == null ? null : studentPic.trim();
    }
}