package com.tw.designPattern.factory.factoryMethod;

/**
 * 具体角色 宝马车
 */
public class BMWCar implements Car{

    @Override
    public void run() {
        System.out.println("宝马车行驶中...");
    }
}
