package com.tw.designPattern.expression;

/**
 * 非终结符表达式
 */
public abstract class AbstractNonTerminalExpression implements Expression{

    protected Expression leftExpression;

    protected Expression rightExpression;

    public AbstractNonTerminalExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
}
