package com.edusystem.entity;

public class Course {
    private String courseId;

    private String courseName;

    private String kcxzId;

    private String kcxzName;

    private Integer courseCredit;

    private Integer courseTheoryhours;

    private Integer courseExperimenthours;

    private Integer courseDesignweeks;

    private String courseDescription;

    private String courseCheckkind;

    private String collegeId;

    private String collegeName;

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

    public String getKcxzId() {
        return kcxzId;
    }

    public void setKcxzId(String kcxzId) {
        this.kcxzId = kcxzId == null ? null : kcxzId.trim();
    }

    public String getKcxzName() {
        return kcxzName;
    }

    public void setKcxzName(String kcxzName) {
        this.kcxzName = kcxzName == null ? null : kcxzName.trim();
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Integer getCourseTheoryhours() {
        return courseTheoryhours;
    }

    public void setCourseTheoryhours(Integer courseTheoryhours) {
        this.courseTheoryhours = courseTheoryhours;
    }

    public Integer getCourseExperimenthours() {
        return courseExperimenthours;
    }

    public void setCourseExperimenthours(Integer courseExperimenthours) {
        this.courseExperimenthours = courseExperimenthours;
    }

    public Integer getCourseDesignweeks() {
        return courseDesignweeks;
    }

    public void setCourseDesignweeks(Integer courseDesignweeks) {
        this.courseDesignweeks = courseDesignweeks;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription == null ? null : courseDescription.trim();
    }

    public String getCourseCheckkind() {
        return courseCheckkind;
    }

    public void setCourseCheckkind(String courseCheckkind) {
        this.courseCheckkind = courseCheckkind == null ? null : courseCheckkind.trim();
    }

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
}