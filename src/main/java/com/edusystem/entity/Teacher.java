package com.edusystem.entity;

import java.util.Date;

public class Teacher {
    private String teacherId;

    private String collegeId;

    private String teacherIdnumber;

    private String teacherName;

    private String teacherGender;

    private Integer teacherAge;

    private String teacherPsd;

    private Date teacherBirthday;

    private String teacherEthnic;

    private String teacherEducation;

    private String teacherGraduatedschool;

    private String teacherGraduateddate;

    private String teacherWorktime;

    private String teacherDegree;

    private String teacherJobtitle;

    private String departmentId;

    private String teacherHometown;

    private String teacherWorkaddress;

    private String teacherAddress;

    private String teacherEmail;

    private String teacherPhone;

    private Integer teacherXgbz;

    private String teacherPic;

    private String collegeName;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getTeacherIdnumber() {
        return teacherIdnumber;
    }

    public void setTeacherIdnumber(String teacherIdnumber) {
        this.teacherIdnumber = teacherIdnumber == null ? null : teacherIdnumber.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTeacherGender() {
        return teacherGender;
    }

    public void setTeacherGender(String teacherGender) {
        this.teacherGender = teacherGender == null ? null : teacherGender.trim();
    }

    public Integer getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Integer teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getTeacherPsd() {
        return teacherPsd;
    }

    public void setTeacherPsd(String teacherPsd) {
        this.teacherPsd = teacherPsd == null ? null : teacherPsd.trim();
    }

    public Date getTeacherBirthday() {
        return teacherBirthday;
    }

    public void setTeacherBirthday(Date teacherBirthday) {
        this.teacherBirthday = teacherBirthday;
    }

    public String getTeacherEthnic() {
        return teacherEthnic;
    }

    public void setTeacherEthnic(String teacherEthnic) {
        this.teacherEthnic = teacherEthnic == null ? null : teacherEthnic.trim();
    }

    public String getTeacherEducation() {
        return teacherEducation;
    }

    public void setTeacherEducation(String teacherEducation) {
        this.teacherEducation = teacherEducation == null ? null : teacherEducation.trim();
    }

    public String getTeacherGraduatedschool() {
        return teacherGraduatedschool;
    }

    public void setTeacherGraduatedschool(String teacherGraduatedschool) {
        this.teacherGraduatedschool = teacherGraduatedschool == null ? null : teacherGraduatedschool.trim();
    }

    public String getTeacherGraduateddate() {
        return teacherGraduateddate;
    }

    public void setTeacherGraduateddate(String teacherGraduateddate) {
        this.teacherGraduateddate = teacherGraduateddate == null ? null : teacherGraduateddate.trim();
    }

    public String getTeacherWorktime() {
        return teacherWorktime;
    }

    public void setTeacherWorktime(String teacherWorktime) {
        this.teacherWorktime = teacherWorktime == null ? null : teacherWorktime.trim();
    }

    public String getTeacherDegree() {
        return teacherDegree;
    }

    public void setTeacherDegree(String teacherDegree) {
        this.teacherDegree = teacherDegree == null ? null : teacherDegree.trim();
    }

    public String getTeacherJobtitle() {
        return teacherJobtitle;
    }

    public void setTeacherJobtitle(String teacherJobtitle) {
        this.teacherJobtitle = teacherJobtitle == null ? null : teacherJobtitle.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getTeacherHometown() {
        return teacherHometown;
    }

    public void setTeacherHometown(String teacherHometown) {
        this.teacherHometown = teacherHometown == null ? null : teacherHometown.trim();
    }

    public String getTeacherWorkaddress() {
        return teacherWorkaddress;
    }

    public void setTeacherWorkaddress(String teacherWorkaddress) {
        this.teacherWorkaddress = teacherWorkaddress == null ? null : teacherWorkaddress.trim();
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress == null ? null : teacherAddress.trim();
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail == null ? null : teacherEmail.trim();
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone == null ? null : teacherPhone.trim();
    }

    public Integer getTeacherXgbz() {
        return teacherXgbz;
    }

    public void setTeacherXgbz(Integer teacherXgbz) {
        this.teacherXgbz = teacherXgbz;
    }

    public String getTeacherPic() {
        return teacherPic;
    }

    public void setTeacherPic(String teacherPic) {
        this.teacherPic = teacherPic == null ? null : teacherPic.trim();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", collegeId='" + collegeId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}