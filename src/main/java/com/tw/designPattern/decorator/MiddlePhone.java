package com.tw.designPattern.decorator;

public class MiddlePhone implements Phone{

    private String desc = "普通版手机";
    @Override
    public String desc() {
        return desc;
    }

    @Override
    public int getPrice() {
        return 1500;
    }
}
