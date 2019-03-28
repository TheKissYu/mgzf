package com.cly.mgzf.enity;

public class Street {
    private Integer stId;

    private String stName;

    private Integer stArId;

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public Integer getStArId() {
        return stArId;
    }

    public void setStArId(Integer stArId) {
        this.stArId = stArId;
    }
}