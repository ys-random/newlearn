package com.lagou.zuoye01;

// （1）手机卡类 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量 行为：显示（卡号 + 用户名 + 当前余额）

public class Phonecardtype {
    private  String cardtype;
    private int cardnum;
    private String username;
    private int password;
    private double money;
    private int time;
    private int data;

    public Phonecardtype() {
    }

    public Phonecardtype(String cardtype, int cardnum, String username, int password, double money, int time, int data) {
        setCardtype(cardtype);
        setCardnum(cardnum);
        setUsername(username);
        setPassword(password);
        setMoney(money);
        setTime(time);
        setData(data);
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public int getCardnum() {
        return cardnum;
    }

    public void setCardnum(int cardnum) {
        this.cardnum = cardnum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}
