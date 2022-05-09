package com.tw.designPattern.state.sharedState;

public class ConcreteStateOne extends ShareState{

    @Override
    public void handle(ShareContext context) {
        System.out.println("当前状态是：状态1");
        context.setState(context.getState("two"));
    }
}
