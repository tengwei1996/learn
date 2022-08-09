package com.tw.designPattern.decorator.cake1;

import java.math.BigDecimal;

/**
 * 具体装饰者
 */
public class MangoCakeDecorator implements Decorator {

    private Cake cake;

    public MangoCakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getCakeDesc(){
        return this.cake.getCakeDesc() + "加一个芒果！";
    }

    @Override
    public BigDecimal getPrice(){
        return this.cake.getPrice().add(new BigDecimal("25"));
    }
}
