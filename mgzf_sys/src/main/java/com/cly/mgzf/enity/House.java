package com.cly.mgzf.enity;

import java.util.Date;

public class House {
    private Integer hId;

    private String name;

    private Integer hLkId;

    private Integer hSpace;

    private Date date;

    private Integer hCtId;

    private Integer hArId;

    private Integer hSbId;

    private Integer hSbsId;

    private Integer hPwId;

    private Integer hHtId;

    private Integer hRtId;

    private Integer hDrNum;

    private Integer hToiletNum;

    private String hInfo;

    private Integer hStatuts;

    private Integer hPrice;

    private Integer hStId;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer gethLkId() {
        return hLkId;
    }

    public void sethLkId(Integer hLkId) {
        this.hLkId = hLkId;
    }

    public Integer gethSpace() {
        return hSpace;
    }

    public void sethSpace(Integer hSpace) {
        this.hSpace = hSpace;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer gethCtId() {
        return hCtId;
    }

    public void sethCtId(Integer hCtId) {
        this.hCtId = hCtId;
    }

    public Integer gethArId() {
        return hArId;
    }

    public void sethArId(Integer hArId) {
        this.hArId = hArId;
    }

    public Integer gethSbId() {
        return hSbId;
    }

    public void sethSbId(Integer hSbId) {
        this.hSbId = hSbId;
    }

    public Integer gethSbsId() {
        return hSbsId;
    }

    public void sethSbsId(Integer hSbsId) {
        this.hSbsId = hSbsId;
    }

    public Integer gethPwId() {
        return hPwId;
    }

    public void sethPwId(Integer hPwId) {
        this.hPwId = hPwId;
    }

    public Integer gethHtId() {
        return hHtId;
    }

    public void sethHtId(Integer hHtId) {
        this.hHtId = hHtId;
    }

    public Integer gethRtId() {
        return hRtId;
    }

    public void sethRtId(Integer hRtId) {
        this.hRtId = hRtId;
    }

    public Integer gethDrNum() {
        return hDrNum;
    }

    public void sethDrNum(Integer hDrNum) {
        this.hDrNum = hDrNum;
    }

    public Integer gethToiletNum() {
        return hToiletNum;
    }

    public void sethToiletNum(Integer hToiletNum) {
        this.hToiletNum = hToiletNum;
    }

    public String gethInfo() {
        return hInfo;
    }

    public void sethInfo(String hInfo) {
        this.hInfo = hInfo == null ? null : hInfo.trim();
    }

    public Integer gethStatuts() {
        return hStatuts;
    }

    public void sethStatuts(Integer hStatuts) {
        this.hStatuts = hStatuts;
    }

    public Integer gethPrice() {
        return hPrice;
    }

    public void sethPrice(Integer hPrice) {
        this.hPrice = hPrice;
    }

    public Integer gethStId() {
        return hStId;
    }

    public void sethStId(Integer hStId) {
        this.hStId = hStId;
    }
}