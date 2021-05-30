package com.edusystem.entity;

public class Kctj {
    private Integer kctjId;

    private Double kctjScore;

    private Double kctjHour;

    private String kctjBooknum;

    private Double kctjPrice;

    private Double kctjStudynum;

    private String kctjLink;

    private String kctjHard;

    private String kctjTitle;

    private String kctjContent;
    public Kctj() {

    }

    public Kctj(Integer kctjId, Double kctjScore, Double kctjHour, String kctjBooknum, Double kctjPrice, Double kctjStudynum, String kctjLink, String kctjHard, String kctjTitle, String kctjContent) {
        this.kctjId = kctjId;
        this.kctjScore = kctjScore;
        this.kctjHour = kctjHour;
        this.kctjBooknum = kctjBooknum;
        this.kctjPrice = kctjPrice;
        this.kctjStudynum = kctjStudynum;
        this.kctjLink = kctjLink;
        this.kctjHard = kctjHard;
        this.kctjTitle = kctjTitle;
        this.kctjContent = kctjContent;
    }

    public Kctj(Double kctjScore, Double kctjHour, String kctjBooknum, Double kctjPrice, Double kctjStudynum, String kctjLink, String kctjHard, String kctjTitle, String kctjContent) {
        this.kctjScore = kctjScore;
        this.kctjHour = kctjHour;
        this.kctjBooknum = kctjBooknum;
        this.kctjPrice = kctjPrice;
        this.kctjStudynum = kctjStudynum;
        this.kctjLink = kctjLink;
        this.kctjHard = kctjHard;
        this.kctjTitle = kctjTitle;
        this.kctjContent = kctjContent;
    }

    public Integer getKctjId() {
        return kctjId;
    }

    public void setKctjId(Integer kctjId) {
        this.kctjId = kctjId;
    }

    public Double getKctjScore() {
        return kctjScore;
    }

    public void setKctjScore(Double kctjScore) {
        this.kctjScore = kctjScore;
    }

    public Double getKctjHour() {
        return kctjHour;
    }

    public void setKctjHour(Double kctjHour) {
        this.kctjHour = kctjHour;
    }

    public String getKctjBooknum() {
        return kctjBooknum;
    }

    public void setKctjBooknum(String kctjBooknum) {
        this.kctjBooknum = kctjBooknum == null ? null : kctjBooknum.trim();
    }

    public Double getKctjPrice() {
        return kctjPrice;
    }

    public void setKctjPrice(Double kctjPrice) {
        this.kctjPrice = kctjPrice;
    }

    public Double getKctjStudynum() {
        return kctjStudynum;
    }

    public void setKctjStudynum(Double kctjStudynum) {
        this.kctjStudynum = kctjStudynum;
    }

    public String getKctjLink() {
        return kctjLink;
    }

    public void setKctjLink(String kctjLink) {
        this.kctjLink = kctjLink == null ? null : kctjLink.trim();
    }

    public String getKctjHard() {
        return kctjHard;
    }

    public void setKctjHard(String kctjHard) {
        this.kctjHard = kctjHard == null ? null : kctjHard.trim();
    }

    public String getKctjTitle() {
        return kctjTitle;
    }

    public void setKctjTitle(String kctjTitle) {
        this.kctjTitle = kctjTitle == null ? null : kctjTitle.trim();
    }

    public String getKctjContent() {
        return kctjContent;
    }

    public void setKctjContent(String kctjContent) {
        this.kctjContent = kctjContent == null ? null : kctjContent.trim();
    }
}