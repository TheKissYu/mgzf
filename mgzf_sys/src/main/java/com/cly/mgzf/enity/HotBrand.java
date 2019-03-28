package com.cly.mgzf.enity;

public class HotBrand {
    private Integer hbId;

    private String hbName;

    public Integer getHbId() {
        return hbId;
    }

    public void setHbId(Integer hbId) {
        this.hbId = hbId;
    }

    public String getHbName() {
        return hbName;
    }

    public void setHbName(String hbName) {
        this.hbName = hbName == null ? null : hbName.trim();
    }
}