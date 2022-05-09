package com.tw.designPattern.state.sharedState;

public class ConcreteStateTwo extends ShareState{

    @Override
    public void handle(ShareContext context) {
        System.out.println("当前状态是：状态2");
        context.setState(context.getState("one"));
    }
}
