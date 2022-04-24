package com.tw.designPattern.decorator;

public class VideoDecorator extends PhoneDecorator{

    private String desc = "为手机添加一个视频通话功能";

    private int price = 500;

    private Phone phone;

    public VideoDecorator(Phone phone){
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
