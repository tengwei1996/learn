package com.tw.designPattern.decorator;

public class StandardPhone implements Phone{

    private String desc = "标准版手机";

    @Override
    public String desc() {
        return desc;
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
