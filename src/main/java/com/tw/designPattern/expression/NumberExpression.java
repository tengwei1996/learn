package com.tw.designPattern.expression;

/**
 * 数字表达式 终结符表达式
 */
public class NumberExpression implements Expression{

    private Integer value;

    public NumberExpression(Integer value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
