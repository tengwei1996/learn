package com.tw.designPattern.factory.factoryMethod;

public class FactoryMethodTest {

    public static void main(String[] args) {

        ProductAFactoryMethod productAFactoryMethod = new ProductAFactoryMethod();
        ProductBFactoryMethod productBFactoryMethod = new ProductBFactoryMethod();
        Product productA = productAFactoryMethod.product();
        Product productB = productBFactoryMethod.product();
        productA.show();
        productB.show();
    }
}
