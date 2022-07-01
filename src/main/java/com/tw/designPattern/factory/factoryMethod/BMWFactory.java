package com.tw.designPattern.factory.factoryMethod;

/**
 * 具体工厂 宝马车工厂
 * 只负责生产宝马车
 */
public class BMWFactory implements CarFactory{

    @Override
    public Car productCar() {
        return new BMWCar();
    }
}
