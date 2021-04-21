package com.edusystem.entity;

public class Score {
    private String scoreId;

    private String studentId;

    private String teachtaskId;

    private String courseId;

    private String courseName;

    private Integer scoreDeduce;

    private Integer scoreMid;

    private Integer scoreTest;

    private Integer scoreUsual;

    private Integer scoreEnd;

    private Integer scoreTotal;

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId == null ? null : scoreId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
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

    public Integer getScoreDeduce() {
        return scoreDeduce;
    }

    public void setScoreDeduce(Integer scoreDeduce) {
        this.scoreDeduce = scoreDeduce;
    }

    public Integer getScoreMid() {
        return scoreMid;
    }

    public void setScoreMid(Integer scoreMid) {
        this.scoreMid = scoreMid;
    }

    public Integer getScoreTest() {
        return scoreTest;
    }

    public void setScoreTest(Integer scoreTest) {
        this.scoreTest = scoreTest;
    }

    public Integer getScoreUsual() {
        return scoreUsual;
    }

    public void setScoreUsual(Integer scoreUsual) {
        this.scoreUsual = scoreUsual;
    }

    public Integer getScoreEnd() {
        return scoreEnd;
    }

    public void setScoreEnd(Integer scoreEnd) {
        this.scoreEnd = scoreEnd;
    }

    public Integer getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal(Integer scoreTotal) {
        this.scoreTotal = scoreTotal;
    }
}