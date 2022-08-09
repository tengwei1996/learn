package com.tw.designPattern.decorator.cake1;

import java.math.BigDecimal;

/**
 * 具体装饰者
 */
public class GrapesCakeDecorator implements Decorator {

    private Cake cake;

    public GrapesCakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getCakeDesc(){
        return this.cake.getCakeDesc() + "加一个葡萄！";
    }

    @Override
    public BigDecimal getPrice(){
        return this.cake.getPrice().add(new BigDecimal("30"));
    }
}
