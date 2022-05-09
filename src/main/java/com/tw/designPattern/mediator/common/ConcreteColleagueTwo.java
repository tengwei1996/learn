package com.tw.designPattern.mediator.common;

/**
 * 具体同事类
 */
public class ConcreteColleagueTwo extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        // 请中介者转发
        mediator.relay(this);
    }
}
