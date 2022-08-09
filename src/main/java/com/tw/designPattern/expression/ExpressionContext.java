package com.tw.designPattern.expression;

import java.util.Stack;

/**
 * 上下文环境
 */
public class ExpressionContext {

    private Stack<Expression> stack = new Stack<>();

    public ExpressionContext(String expression){
        this.parse(expression);
    }

    private void parse(String expression){
        // 表达式以空格分割 表达是不要错啊，这里主要关注的是设计模式，所以一些异常情况都没处理
        String[] elementArr = expression.split(" ");
        for (int i = 0;i < elementArr.length;i++){
            String element = elementArr[i];
            // 如果是+号 则从栈中取出之前入栈的值作为左边表达式 -同理
            if ("+".equals(element)){
                Expression leftExpression = stack.pop();
                // 然后取出+后面的那个数值
                // 比如啊 100 + 88 - 66 读到+这了 然后它++i就直接把88读了出来作为右边表达式
                NumberExpression rightExpression = new NumberExpression(Integer.valueOf(elementArr[++i]));
                // 进行加法表达式运算
                AddExpression addExpression = new AddExpression(leftExpression, rightExpression);
                // 将结果放入栈中
                // 这时候栈里啥也没有 把结果放进去 栈里就是188 然后你看两个else if 中都是pop出栈，又把栈里结果拿出来了 栈又空了
                // 每次栈里面都是运算过一次的结果
                // 这时候不是结果入栈完了，进行下一次循环了么，因为上面的++i 所以下表到了88这，然后下次循环又做了i++所以这时候下标在-号这了
                // 然后就走-号，-号就跟+号同理
                stack.push(new NumberExpression(addExpression.interpret()));
            }else if ("-".equals(element)){
                Expression leftExpression = stack.pop();
                NumberExpression rightExpression = new NumberExpression(Integer.valueOf(elementArr[++i]));
                SubExpression subExpression = new SubExpression(leftExpression, rightExpression);
                stack.push(new NumberExpression(subExpression.interpret()));
            }else {
                // 如果是数字的话 直接入栈
                stack.push(new NumberExpression(Integer.valueOf(element)));
            }
        }
    }

    public Integer calculate(){
        return stack.pop().interpret();
    }
}
