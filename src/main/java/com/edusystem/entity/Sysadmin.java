package com.edusystem.entity;

public class Sysadmin {
    private String sysadminId;

    private String sysadminPsd;

    private String collegeId;
    private String collegeName;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getSysadminId() {
        return sysadminId;
    }

    public void setSysadminId(String sysadminId) {
        this.sysadminId = sysadminId == null ? null : sysadminId.trim();
    }

    public String getSysadminPsd() {
        return sysadminPsd;
    }

    public void setSysadminPsd(String sysadminPsd) {
        this.sysadminPsd = sysadminPsd == null ? null : sysadminPsd.trim();
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }
}