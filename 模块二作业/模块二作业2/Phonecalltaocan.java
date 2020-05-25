package com.lagou.zuoye01;

public class Phonecalltaocan implements Callserver  {
    //（2）通话套餐类 特征：通话时长、短信条数、每月资费 行为: 显示所有套餐信息
    private int time;
    private int number;
    private double money;

    public Phonecalltaocan() {
    }

    public Phonecalltaocan(int time, int number, double money) {
        setTime(time);
        setNumber(number);
        setMoney(money);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int messagenum) {
        this.number = messagenum;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void  show(){
        System.out.println("当前套餐信息为通话时长 "+getTime()+"分钟;短信条数 "+getNumber()+"条；每月资费 "+getMoney()+"元");
    }

    @Override
    public void call(int time, String desc) {
        System.out.println("手机卡类型:"+desc+";当前套餐信息为通话时长:"+time+"分钟;短信条数:"+getNumber()+"条；每月资费 "+getMoney()+"元");
    }
}
