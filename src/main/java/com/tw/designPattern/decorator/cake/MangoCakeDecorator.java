package com.tw.designPattern.decorator.cake;

import java.math.BigDecimal;

/**
 * 具体装饰者
 */
public class MangoCakeDecorator extends Decorator{

    public MangoCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getCakeDesc(){
        return super.getCakeDesc() + "加一个芒果！";
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal("25"));
    }
}
