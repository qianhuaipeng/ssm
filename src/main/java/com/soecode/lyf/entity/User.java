package com.soecode.lyf.entity;

import java.util.List;

/**
 * author: alan.peng
 * description:
 * date: create in 10:51 2018/3/8
 * modified By：
 */
public class User {

    private int id;
    private String  userName;
    private String address;
    private List<Card> cards;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
