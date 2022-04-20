package com.tw.designPattern.builder;

public class BuilderTest {

    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.buildProduct();
        System.out.println(product);
        System.out.println(product.getPartA() + product.getPartB() + product.getPartC());
    }
}
