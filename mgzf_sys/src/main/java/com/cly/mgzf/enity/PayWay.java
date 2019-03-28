package com.cly.mgzf.enity;

public class PayWay {
    private Integer pwId;

    private String pwType;

    public Integer getPwId() {
        return pwId;
    }

    public void setPwId(Integer pwId) {
        this.pwId = pwId;
    }

    public String getPwType() {
        return pwType;
    }

    public void setPwType(String pwType) {
        this.pwType = pwType == null ? null : pwType.trim();
    }
}