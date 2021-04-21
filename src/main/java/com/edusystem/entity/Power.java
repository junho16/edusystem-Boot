package com.edusystem.entity;

public class Power {
    private String powerId;

    private Integer powerRose;

    private String powerDescript;

    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId == null ? null : powerId.trim();
    }

    public Integer getPowerRose() {
        return powerRose;
    }

    public void setPowerRose(Integer powerRose) {
        this.powerRose = powerRose;
    }

    public String getPowerDescript() {
        return powerDescript;
    }

    public void setPowerDescript(String powerDescript) {
        this.powerDescript = powerDescript == null ? null : powerDescript.trim();
    }
}