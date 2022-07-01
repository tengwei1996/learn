package com.tw.designPattern.factory.factoryMethod;

/**
 * 具体角色 奔驰车
 */
public class BenzCar implements Car{

    @Override
    public void run() {
        System.out.println("奔驰车行驶中...");
    }
}
