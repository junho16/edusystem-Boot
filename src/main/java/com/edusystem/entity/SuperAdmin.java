package com.edusystem.entity;

public class SuperAdmin {
    private String superadminId;

    private String superadminPsd;

    public String getSuperadminId() {
        return superadminId;
    }

    public void setSuperadminId(String superadminId) {
        this.superadminId = superadminId == null ? null : superadminId.trim();
    }

    public String getSuperadminPsd() {
        return superadminPsd;
    }

    public void setSuperadminPsd(String superadminPsd) {
        this.superadminPsd = superadminPsd == null ? null : superadminPsd.trim();
    }
}