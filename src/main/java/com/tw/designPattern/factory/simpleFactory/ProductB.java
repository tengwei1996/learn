package com.tw.designPattern.factory.simpleFactory;

public class ProductB implements Product {

    @Override
    public void show() {
        System.out.println("产品B创建成功");
    }
}
