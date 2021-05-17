package com.edusystem.dto;

/**
 * @author 花菜
 * @date 2021/5/12 12:10
 */
public class ScoreDto {
    private String classId ;
    private String studentEmail;
    private String studentPhone;
    private String studentGender;
    private String collegeId;
    private String studentId;
    private String studentName;
    private String score_kq ;
    private String score_ps ;
    private String score_sy  ;
    private String score_qz  ;
    private String score_qm ;
    private Boolean show = false;


    //学生自己查成绩要用
    private String scoreSum;
    private String courseName;
    private String courseKcxz;
    private String courseCirdit;
    private String courseStudyHour;
    private String courseCheckKind;

    public String getScoreSum() {
        return scoreSum;
    }

    public void setScoreSum(String scoreSum) {
        this.scoreSum = scoreSum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseKcxz() {
        return courseKcxz;
    }

    public void setCourseKcxz(String courseKcxz) {
        this.courseKcxz = courseKcxz;
    }

    public String getCourseCirdit() {
        return courseCirdit;
    }

    public void setCourseCirdit(String courseCirdit) {
        this.courseCirdit = courseCirdit;
    }

    public String getCourseStudyHour() {
        return courseStudyHour;
    }

    public void setCourseStudyHour(String courseStudyHour) {
        this.courseStudyHour = courseStudyHour;
    }

    public String getCourseCheckKind() {
        return courseCheckKind;
    }

    public void setCourseCheckKind(String courseCheckKind) {
        this.courseCheckKind = courseCheckKind;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getScore_kq() {
        return score_kq;
    }

    public void setScore_kq(String score_kq) {
        this.score_kq = score_kq;
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

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }
}
