package com.tw.designPattern.decorator.cake;

import java.math.BigDecimal;

public class CommonCake implements Cake{

    @Override
    public String getCakeDesc() {
        return "这是一个普通蛋糕！";
    }

    @Override
    public BigDecimal getPrice()  {
        return new BigDecimal("100");
    }
}
