package com.tw.designPattern.factory.abstractFactory;

public class ProductBB implements ProductB {

    @Override
    public void show(String name) {
        System.out.println(name + "产品B的B创建成功");
    }
}
