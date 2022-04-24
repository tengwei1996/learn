package com.tw.designPattern.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        // 基础测试
        Phone middlePhone = new MiddlePhone();
        String middlePhoneDesc = middlePhone.desc();
        int middlePhonePrice = middlePhone.getPrice();
        System.out.println(middlePhoneDesc + "---" + middlePhonePrice);

        // 装饰器测试
        PhoneDecorator videoDecorator = new VideoDecorator(middlePhone);
        String decoratorDesc = videoDecorator.desc();
        int decoratorPrice = videoDecorator.getPrice();
        System.out.println(decoratorDesc + "---" + decoratorPrice);
    }
}
