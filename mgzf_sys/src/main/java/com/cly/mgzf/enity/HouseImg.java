package com.cly.mgzf.enity;

public class HouseImg {
    private Integer hiId;

    private Integer hiHId;

    private String hiImgurl;

    public Integer getHiId() {
        return hiId;
    }

    public void setHiId(Integer hiId) {
        this.hiId = hiId;
    }

    public Integer getHiHId() {
        return hiHId;
    }

    public void setHiHId(Integer hiHId) {
        this.hiHId = hiHId;
    }

    public String getHiImgurl() {
        return hiImgurl;
    }

    public void setHiImgurl(String hiImgurl) {
        this.hiImgurl = hiImgurl == null ? null : hiImgurl.trim();
    }
}