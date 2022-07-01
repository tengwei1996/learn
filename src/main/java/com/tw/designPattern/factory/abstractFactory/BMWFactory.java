package com.tw.designPattern.factory.abstractFactory;

/**
 * 具体工厂 宝马工厂
 */
public class BMWFactory implements CarFactory{

    @Override
    public Engine productEngine() {
        return new BMWEngine();
    }

    @Override
    public Logo productLogo() {
        return new BMWLogo();
    }
}
