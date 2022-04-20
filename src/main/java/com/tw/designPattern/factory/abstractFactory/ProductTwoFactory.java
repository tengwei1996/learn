package com.tw.designPattern.factory.abstractFactory;


public class ProductTwoFactory implements AbstractFactory {

    @Override
    public ProductA productA() {
        ProductA productAB = new ProductAB();
        return productAB;
    }

    @Override
    public ProductB productB() {
        ProductB productBB = new ProductBB();
        return productBB;
    }
}
