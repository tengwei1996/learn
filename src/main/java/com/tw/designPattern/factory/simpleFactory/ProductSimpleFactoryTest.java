package com.tw.designPattern.factory.simpleFactory;

public class ProductSimpleFactoryTest {

    public static void main(String[] args) {
        Product productA = ProductSimpleFactory.product("A");
        Product productB = ProductSimpleFactory.product("B");
        productA.show();
        productB.show();
    }
}
