package com.edusystem.entity;

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