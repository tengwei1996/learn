package com.tw.designPattern.factory.factoryMethod;


public class CarFactoryTest {

    public static void main(String[] args) {
        // 宝马车工厂
        BMWFactory bmwFactory = new BMWFactory();
        // 生产宝马车
        Car bmwCar = bmwFactory.productCar();
        // 宝马车行驶中
        bmwCar.run();
        // 奔驰车工厂
        BenzFactory benzFactory = new BenzFactory();
        // 生产奔驰车
        Car benzCar = benzFactory.productCar();
        // 奔驰车行驶中
        benzCar.run();
    }
}
