package com.tw.designPattern.decorator.cake;

import java.math.BigDecimal;

/**
 * 抽象构件
 */
public interface Cake {

    String getCakeDesc();

    BigDecimal getPrice();
}
