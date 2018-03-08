package com.soecode.lyf.entity;

/**
 * author: alan.peng
 * description:
 * date: create in 10:49 2018/3/8
 * modified By：
 */
public class Card {

    private int id;
    private String userName;
    private String cardNo;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
