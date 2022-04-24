package com.tw.designPattern.decorator;

public class PhoneDecorator implements Phone{

    private String desc = "这是手机装饰器";

    @Override
    public String desc() {
        return desc;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
