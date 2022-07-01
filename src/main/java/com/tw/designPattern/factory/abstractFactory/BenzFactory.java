package com.tw.designPattern.factory.abstractFactory;

/**
 * 具体工厂 奔驰工厂
 */
public class BenzFactory implements CarFactory{

    @Override
    public Engine productEngine() {
        return new BenzEngine();
    }

    @Override
    public Logo productLogo() {
        return new BenzLogo();
    }
}
