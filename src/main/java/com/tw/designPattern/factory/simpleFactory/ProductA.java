package com.tw.designPattern.factory.simpleFactory;

public class ProductA implements Product {

    @Override
    public void show() {
        System.out.println("产品A创建成功");
    }
}
