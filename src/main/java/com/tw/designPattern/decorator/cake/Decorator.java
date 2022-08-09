package com.tw.designPattern.decorator.cake;

import java.math.BigDecimal;

/**
 * 抽象装饰者
 */
public class Decorator implements Cake{

    private Cake cake;

    public Decorator(Cake cake){
        this.cake = cake;
    }

    @Override
    public String getCakeDesc() {
        return this.cake.getCakeDesc();
    }

    @Override
    public BigDecimal getPrice() {
        return this.cake.getPrice();
    }
}
