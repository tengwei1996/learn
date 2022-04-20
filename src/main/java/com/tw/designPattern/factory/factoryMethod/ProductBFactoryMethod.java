package com.tw.designPattern.factory.factoryMethod;

public class ProductBFactoryMethod implements AbstractFactoryMethod {

    @Override
    public Product product() {
        return new ProductB();
    }
}
