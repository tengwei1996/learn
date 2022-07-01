package com.tw.designPattern.decorator.cake;

import java.math.BigDecimal;

public class GrapesCakeDecorator extends Decorator{

    public GrapesCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getCakeDesc(){
        return super.getCakeDesc() + "加一个葡萄！";
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal("30"));
    }
}
