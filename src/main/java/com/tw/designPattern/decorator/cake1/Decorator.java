package com.tw.designPattern.decorator.cake1;

import java.math.BigDecimal;

/**
 * 抽象装饰者
 */
public interface Decorator extends Cake {


    @Override
    String getCakeDesc();

    @Override
    BigDecimal getPrice();
}
