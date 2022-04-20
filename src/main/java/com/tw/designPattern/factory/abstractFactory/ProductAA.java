package com.tw.designPattern.factory.abstractFactory;

public class ProductAA implements ProductA {

    @Override
    public void show(String name) {
        System.out.println(name + "产品A的A创建成功");
    }
}
