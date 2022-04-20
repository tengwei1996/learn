package com.tw.designPattern.factory.abstractFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        ProductOneFactory oneFactory = new ProductOneFactory();
        String oneName = "一号工厂";
        ProductA productAA = oneFactory.productA();
        ProductB productBA = oneFactory.productB();
        productAA.show(oneName);
        productBA.show(oneName);
        String twoName = "二号工厂";
        ProductTwoFactory twoFactory = new ProductTwoFactory();
        ProductA productAB = twoFactory.productA();
        ProductB productBB = twoFactory.productB();
        productAB.show(twoName);
        productBB.show(twoName);

    }
}
