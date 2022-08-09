package com.tw.designPattern.expression;

/**
 * 减法表达式 非终结符表达式
 */
public class SubExpression extends AbstractNonTerminalExpression{

    public SubExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int interpret() {
        return this.leftExpression.interpret() - this.rightExpression.interpret();
    }
}
