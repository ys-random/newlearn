package com.lagou.zuoye01;
//（3）上网套餐类 特征：上网流量、每月资费 行为：显示所有套餐信息
public class Phonedatataocan implements Dataserver {
    private int data;
    private double money;

    public Phonedatataocan() {
    }

    public Phonedatataocan(int data, double money) {
       setData(data);
       setMoney(money);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void show(){
        System.out.println("当前上网套餐为上网流量为 "+getData()+"G;每月资费为"+getMoney()+"元");
    }

    @Override
    public void data(int data, String desc) {
        System.out.println("手机卡类型:"+desc+";当前上网套餐为上网流量为:"+data+"G;每月资费 "+getMoney()+"元");
    }
}
