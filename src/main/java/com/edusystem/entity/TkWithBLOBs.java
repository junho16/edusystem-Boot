package com.edusystem.entity;

public class TkWithBLOBs extends Tk {
    private String tkComments;

    private String tkTags;

    private String tkJudge;




    public String getTkComments() {
        return tkComments;
    }

    public void setTkComments(String tkComments) {
        this.tkComments = tkComments == null ? null : tkComments.trim();
    }

    public String getTkTags() {
        return tkTags;
    }

    public void setTkTags(String tkTags) {
        this.tkTags = tkTags == null ? null : tkTags.trim();
    }

    public String getTkJudge() {
        return tkJudge;
    }

    public void setTkJudge(String tkJudge) {
        this.tkJudge = tkJudge == null ? null : tkJudge.trim();
    }

    @Override
    public String toString() {
        return "TkWithBLOBs{" +

                "tkComments='" + tkComments + '\'' +
                ", tkTags='" + tkTags + '\'' +
                ", tkJudge='" + tkJudge + '\'' +
                '}';
    }
}