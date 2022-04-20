package com.tw.designPattern.factory.abstractFactory;

public class ProductAB implements ProductA {

    @Override
    public void show(String name) {
        System.out.println(name + "产品A的B创建成功");
    }
}
