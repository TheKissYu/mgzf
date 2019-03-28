package com.cly.mgzf.enity;

public class Subway {
    private Integer sbId;

    private String sbName;

    private Integer sbCtId;

    public Integer getSbId() {
        return sbId;
    }

    public void setSbId(Integer sbId) {
        this.sbId = sbId;
    }

    public String getSbName() {
        return sbName;
    }

    public void setSbName(String sbName) {
        this.sbName = sbName == null ? null : sbName.trim();
    }

    public Integer getSbCtId() {
        return sbCtId;
    }

    public void setSbCtId(Integer sbCtId) {
        this.sbCtId = sbCtId;
    }
}