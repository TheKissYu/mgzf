package com.cly.mgzf.enity;

public class LinkMan {
    private Integer lkId;

    private String lkName;

    private String lkTel;

    private String lkPassword;

    public Integer getLkId() {
        return lkId;
    }

    public void setLkId(Integer lkId) {
        this.lkId = lkId;
    }

    public String getLkName() {
        return lkName;
    }

    public void setLkName(String lkName) {
        this.lkName = lkName == null ? null : lkName.trim();
    }

    public String getLkTel() {
        return lkTel;
    }

    public void setLkTel(String lkTel) {
        this.lkTel = lkTel == null ? null : lkTel.trim();
    }

    public String getLkPassword() {
        return lkPassword;
    }

    public void setLkPassword(String lkPassword) {
        this.lkPassword = lkPassword == null ? null : lkPassword.trim();
    }
}