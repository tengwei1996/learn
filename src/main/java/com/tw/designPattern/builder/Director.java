package com.tw.designPattern.builder;

public class Director {

    public AbstractBuilder builder;

    public Director(AbstractBuilder builder){
        this.builder = builder;
    }

    public Product buildProduct(){
        builder.buildPartA().buildPartB().buildPartC();
        return builder.getProduct();
    }
}
