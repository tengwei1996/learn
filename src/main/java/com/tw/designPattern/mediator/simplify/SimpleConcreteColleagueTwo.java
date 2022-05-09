package com.tw.designPattern.mediator.simplify;

public class SimpleConcreteColleagueTwo implements SimpleColleague{

    public SimpleConcreteColleagueTwo(){
        SimpleMediator smd = SimpleMediator.getInstance();
        smd.register(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事2：收到请求。");
    }

    @Override
    public void send() {
        SimpleMediator smd = SimpleMediator.getInstance();
        System.out.println("具体同事2：发出请求...");
        // 请中介者转发
        smd.relay(this);
    }
}
