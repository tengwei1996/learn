package com.tw.designPattern.factory.abstractFactory;

public class FactoryTest {

    public static void main(String[] args) {
        // 创建宝马工厂
        BMWFactory bmwFactory = new BMWFactory();
        // 宝马发动机
        Engine bmwEngine = bmwFactory.productEngine();
        // 宝马车标
        Logo bmwLogo = bmwFactory.productLogo();
        bmwEngine.info();
        bmwLogo.info();
        // 创建奔驰工厂
        BenzFactory benzFactory = new BenzFactory();
        // 奔驰发动机
        Engine benzEngine = benzFactory.productEngine();
        // 奔驰车标
        Logo benzLogo = benzFactory.productLogo();
        benzEngine.info();
        benzLogo.info();

    }
}
