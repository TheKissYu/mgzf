package com.cly.mgzf.enity;

public class HouseType {
    private Integer htId;

    private String htType;

    public Integer getHtId() {
        return htId;
    }

    public void setHtId(Integer htId) {
        this.htId = htId;
    }

    public String getHtType() {
        return htType;
    }

    public void setHtType(String htType) {
        this.htType = htType == null ? null : htType.trim();
    }
}