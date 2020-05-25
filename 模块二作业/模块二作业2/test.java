package com.lagou.zuoye01;

public class test {
    public static void main(String[] args) {
        Phonedatataocan pc =new Phonedatataocan();//多态调用
        pc.show();
        //Phonedata pd =new Phonedata();
        //pd.show();
        Phonecalltaocan pt =new Phonecalltaocan();
        pt.show();//打印初始数据
        pt.call(50,"小卡");//接口实现
        Phonedatataocan pd =new Phonedatataocan();
        pd.show();//打印初始数据
        pd.data(30,"大卡");//接口实现
    }
}
