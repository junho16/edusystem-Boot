package com.edusystem.entity;

public class SturecordWithBLOBs extends Sturecord {
    private String sturecordStudyhistory;

    private String sturecordJtcyqk;

    private String sturecordChangerecord;

    private String sturecordRewardhistory;

    private String sturecordPunishhistory;

    public String getSturecordStudyhistory() {
        return sturecordStudyhistory;
    }

    public void setSturecordStudyhistory(String sturecordStudyhistory) {
        this.sturecordStudyhistory = sturecordStudyhistory == null ? null : sturecordStudyhistory.trim();
    }

    public String getSturecordJtcyqk() {
        return sturecordJtcyqk;
    }

    public void setSturecordJtcyqk(String sturecordJtcyqk) {
        this.sturecordJtcyqk = sturecordJtcyqk == null ? null : sturecordJtcyqk.trim();
    }

    public String getSturecordChangerecord() {
        return sturecordChangerecord;
    }

    public void setSturecordChangerecord(String sturecordChangerecord) {
        this.sturecordChangerecord = sturecordChangerecord == null ? null : sturecordChangerecord.trim();
    }

    public String getSturecordRewardhistory() {
        return sturecordRewardhistory;
    }

    public void setSturecordRewardhistory(String sturecordRewardhistory) {
        this.sturecordRewardhistory = sturecordRewardhistory == null ? null : sturecordRewardhistory.trim();
    }

    public String getSturecordPunishhistory() {
        return sturecordPunishhistory;
    }

    public void setSturecordPunishhistory(String sturecordPunishhistory) {
        this.sturecordPunishhistory = sturecordPunishhistory == null ? null : sturecordPunishhistory.trim();
    }
}