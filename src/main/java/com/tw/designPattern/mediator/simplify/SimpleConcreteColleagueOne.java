package com.tw.designPattern.mediator.simplify;

public class SimpleConcreteColleagueOne implements SimpleColleague{

    public SimpleConcreteColleagueOne(){
        SimpleMediator smd = SimpleMediator.getInstance();
        smd.register(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事1：收到请求。");
    }

    @Override
    public void send() {
        SimpleMediator smd = SimpleMediator.getInstance();
        System.out.println("具体同事1：发出请求...");
        // 请中介者转发
        smd.relay(this);
    }
}
