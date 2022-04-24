package com.tw.designPattern.decorator;

public class WifiChargeDecorator extends PhoneDecorator{

    private String desc = "为手机添加一个wifi充电功能";

    private int price = 1000;

    private Phone phone;

    public WifiChargeDecorator(Phone phone){
        this.phone = phone;
    }

    @Override
    public String desc() {
        return phone.desc() + "，" + desc;
    }

    @Override
    public int getPrice() {
        return phone.getPrice() + price;
    }
}
