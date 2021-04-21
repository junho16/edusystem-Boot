package com.edusystem.entity;

public class Pjx {
    private String pjxId;

    private String pjxName;

    public String getPjxId() {
        return pjxId;
    }

    public void setPjxId(String pjxId) {
        this.pjxId = pjxId == null ? null : pjxId.trim();
    }

    public String getPjxName() {
        return pjxName;
    }

    public void setPjxName(String pjxName) {
        this.pjxName = pjxName == null ? null : pjxName.trim();
    }
}