package com.edusystem.entity;

public class Trainplan {
    private String trainplanId;

    private String collegeId;

    private String professionId;

    private String courseId;

    private Integer trainplanTerm;

    public String getTrainplanId() {
        return trainplanId;
    }

    public void setTrainplanId(String trainplanId) {
        this.trainplanId = trainplanId == null ? null : trainplanId.trim();
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId == null ? null : professionId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public Integer getTrainplanTerm() {
        return trainplanTerm;
    }

    public void setTrainplanTerm(Integer trainplanTerm) {
        this.trainplanTerm = trainplanTerm;
    }
}