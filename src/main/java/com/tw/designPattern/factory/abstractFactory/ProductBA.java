package com.tw.designPattern.factory.abstractFactory;

public class ProductBA implements ProductB {

    @Override
    public void show(String name) {
        System.out.println(name + "产品B的A创建成功");
    }
}
