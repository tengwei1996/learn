package com.tw.designPattern.mediator.common;

/**
 * 具体同事类
 */
public class ConcreteColleagueOne extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        // 请中介者转发
        mediator.relay(this);
    }
}
