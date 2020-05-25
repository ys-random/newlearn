package com.lagou.zuoye01;
//（4）用户消费信息类 特征：统计通话时长、统计上网流量、每月消费金额
public class Phoneuser {
    private int time;
    private int date;
    private double money;

    public Phoneuser() {
    }

    public Phoneuser(int time, int date, double money) {
        setTime(time);
        setDate(date);
        setMoney(money);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
