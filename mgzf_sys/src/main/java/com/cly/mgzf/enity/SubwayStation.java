package com.cly.mgzf.enity;

public class SubwayStation {
    private Integer sbsId;

    private String sbsName;

    private Integer sbsSbId;

    public Integer getSbsId() {
        return sbsId;
    }

    public void setSbsId(Integer sbsId) {
        this.sbsId = sbsId;
    }

    public String getSbsName() {
        return sbsName;
    }

    public void setSbsName(String sbsName) {
        this.sbsName = sbsName == null ? null : sbsName.trim();
    }

    public Integer getSbsSbId() {
        return sbsSbId;
    }

    public void setSbsSbId(Integer sbsSbId) {
        this.sbsSbId = sbsSbId;
    }
}