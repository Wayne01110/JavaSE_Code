package com.Wayne;

/**
 * 账户类
 */
public class Account {
    /**
     * 成员变量，私有
     */
    private String cardId;
    private String username; // 用户名
    private String password; // 密码
    private double money; // 账户余额
    private double quoteMoney; // 每次取现余额

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuoteMoney() {
        return quoteMoney;
    }

    public void setQuoteMoney(double quoteMoney) {
        this.quoteMoney = quoteMoney;
    }
}
