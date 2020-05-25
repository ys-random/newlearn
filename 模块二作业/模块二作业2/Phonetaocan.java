package com.lagou.zuoye01;

public abstract class Phonetaocan {
    private double money;

    public Phonetaocan() {
    }

    public Phonetaocan(double money) {
        setMoney(money);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money=money;
       }

    public abstract void  show();
}
