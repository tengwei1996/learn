package com.tw.designPattern.expression;

public class ExpressionTest {

    public static void main(String[] args) {
        ExpressionContext context = new ExpressionContext("100 + 666 + 888");
        System.out.println(context.calculate());
        context = new ExpressionContext("888 + 666 - 12312");
        System.out.println(context.calculate());

    }
}
