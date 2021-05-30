package com.edusystem.entity;

import lombok.Data;

@Data
public class Classplan {
    @Override
    public String toString() {
        return "Classplan{" +
                "classplanId='" + classplanId + '\'' +
                ", teachtaskId='" + teachtaskId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", classroomId='" + classroomId + '\'' +
                ", classroomName='" + classroomName + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", classplanTime='" + classplanTime + '\'' +
                ", classplanClassnum=" + classplanClassnum +
                ", classplanDay=" + classplanDay +
                ", classplanWeek=" + classplanWeek +
                ", classplanYaer=" + classplanYaer +
                ", classplanTerm=" + classplanTerm +
                '}';
    }

    private String classid;
    private String professionName;
    private Integer startTime ;
    private Integer endTime ;


    private String classplanId;

    private String teachtaskId;

    private String courseName;

    private String classroomId;

    private String classroomName;

    private String teacherId;

    private String teacherName;

    private String classplanTime;

    private Integer classplanClassnum;

    private Integer classplanDay;

    private Integer classplanWeek;

    private Integer classplanYaer;

    private Integer classplanTerm;

    public Classplan(String classplanId, String teachtaskId, String classroomId, Integer classplanClassnum, Integer classplanDay,  Integer classplanYaer, Integer classplanTerm) {
        this.classplanId = classplanId;
        this.teachtaskId = teachtaskId;
        this.classroomId = classroomId;
        this.classplanClassnum = classplanClassnum;
        this.classplanDay = classplanDay;
        this.classplanYaer = classplanYaer;
        this.classplanTerm = classplanTerm;
    }
}