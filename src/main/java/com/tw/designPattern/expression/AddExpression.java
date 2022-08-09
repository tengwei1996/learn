package com.tw.designPattern.expression;

/**
 * 加法表达式 非终结符表达式
 */
public class AddExpression extends AbstractNonTerminalExpression{

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int interpret() {
        return this.leftExpression.interpret() + this.rightExpression.interpret();
    }
}
