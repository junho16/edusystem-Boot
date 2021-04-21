package com.edusystem.entity;

public class College {
    private String collegeId;

    private String collegeName;

    private String collegePrincipal;

    private Integer collegeWorkernum;

    private Integer collegeStudentnum;

    private String collegePhone;

    private String collegeAddress;

    private String collegeBuildingaddress;

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getCollegePrincipal() {
        return collegePrincipal;
    }

    public void setCollegePrincipal(String collegePrincipal) {
        this.collegePrincipal = collegePrincipal == null ? null : collegePrincipal.trim();
    }

    public Integer getCollegeWorkernum() {
        return collegeWorkernum;
    }

    public void setCollegeWorkernum(Integer collegeWorkernum) {
        this.collegeWorkernum = collegeWorkernum;
    }

    public Integer getCollegeStudentnum() {
        return collegeStudentnum;
    }

    public void setCollegeStudentnum(Integer collegeStudentnum) {
        this.collegeStudentnum = collegeStudentnum;
    }

    public String getCollegePhone() {
        return collegePhone;
    }

    public void setCollegePhone(String collegePhone) {
        this.collegePhone = collegePhone == null ? null : collegePhone.trim();
    }

    public String getCollegeAddress() {
        return collegeAddress;
    }

    public void setCollegeAddress(String collegeAddress) {
        this.collegeAddress = collegeAddress == null ? null : collegeAddress.trim();
    }

    public String getCollegeBuildingaddress() {
        return collegeBuildingaddress;
    }

    public void setCollegeBuildingaddress(String collegeBuildingaddress) {
        this.collegeBuildingaddress = collegeBuildingaddress == null ? null : collegeBuildingaddress.trim();
    }
}