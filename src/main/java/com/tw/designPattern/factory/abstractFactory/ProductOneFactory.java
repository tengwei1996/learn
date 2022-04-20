package com.tw.designPattern.factory.abstractFactory;

public class ProductOneFactory implements AbstractFactory {

    @Override
    public ProductA productA() {
        ProductA productAA = new ProductAA();
        return productAA;
    }

    @Override
    public ProductB productB() {
        ProductB productBA = new ProductBA();
        return productBA;
    }
}
