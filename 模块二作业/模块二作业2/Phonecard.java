package com.lagou.zuoye01;

public enum Phonecard {

    mini("微型卡"),
    small("小卡"),
    big("大卡");

    private final String desc;

    Phonecard(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
