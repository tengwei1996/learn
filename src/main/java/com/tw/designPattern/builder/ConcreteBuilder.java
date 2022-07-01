package com.tw.designPattern.builder;

public class ConcreteBuilder extends AbstractBuilder{
    @Override
    public AbstractBuilder buildPartA() {
        product.setPartA("建造PartA");
        return this;
    }

    @Override
    public AbstractBuilder buildPartB() {
        product.setPartB("建造PartB");
        return this;
    }

    @Override
    public AbstractBuilder buildPartC() {
        product.setPartC("建造PartC");
        return this;
    }
}
