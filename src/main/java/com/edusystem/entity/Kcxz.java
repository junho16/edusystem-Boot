package com.edusystem.entity;

public class Kcxz {
    private String kcxzId;

    private String kcxzName;

    private String kcxzRemark;

    public String getKcxzId() {
        return kcxzId;
    }

    public void setKcxzId(String kcxzId) {
        this.kcxzId = kcxzId == null ? null : kcxzId.trim();
    }

    public String getKcxzName() {
        return kcxzName;
    }

    public void setKcxzName(String kcxzName) {
        this.kcxzName = kcxzName == null ? null : kcxzName.trim();
    }

    public String getKcxzRemark() {
        return kcxzRemark;
    }

    public void setKcxzRemark(String kcxzRemark) {
        this.kcxzRemark = kcxzRemark == null ? null : kcxzRemark.trim();
    }
}