package com.tw.designPattern.decorator;

public class HighLevelPhone implements Phone{

    private String desc = "尊贵版手机";

    @Override
    public String desc() {
        return desc;
    }

    @Override
    public int getPrice() {
        return 5000;
    }
}
