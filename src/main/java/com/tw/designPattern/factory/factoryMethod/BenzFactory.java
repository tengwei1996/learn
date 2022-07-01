package com.tw.designPattern.factory.factoryMethod;

/**
 * 具体工厂 奔驰车工厂
 * 只负责生产奔驰车
 */
public class BenzFactory implements CarFactory{

    @Override
    public Car productCar() {
        return new BenzCar();
    }
}
