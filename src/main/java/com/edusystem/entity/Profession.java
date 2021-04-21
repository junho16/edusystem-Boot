package com.edusystem.entity;

public class Profession {
    private String professionId;

    private String professionName;

    private String professionCreateyear;

    private Integer professionStudyyearnum;

    private String professionBelongsubject;

    private String collegeId;

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId == null ? null : professionId.trim();
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName == null ? null : professionName.trim();
    }

    public String getProfessionCreateyear() {
        return professionCreateyear;
    }

    public void setProfessionCreateyear(String professionCreateyear) {
        this.professionCreateyear = professionCreateyear == null ? null : professionCreateyear.trim();
    }

    public Integer getProfessionStudyyearnum() {
        return professionStudyyearnum;
    }

    public void setProfessionStudyyearnum(Integer professionStudyyearnum) {
        this.professionStudyyearnum = professionStudyyearnum;
    }

    public String getProfessionBelongsubject() {
        return professionBelongsubject;
    }

    public void setProfessionBelongsubject(String professionBelongsubject) {
        this.professionBelongsubject = professionBelongsubject == null ? null : professionBelongsubject.trim();
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }
}