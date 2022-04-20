package com.tw.designPattern.factory.factoryMethod;

public class ProductAFactoryMethod implements AbstractFactoryMethod {

    @Override
    public Product product() {
        return new ProductA();
    }
}
