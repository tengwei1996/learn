package com.tw.designPattern.command.simple;

/**
 * 面条 具体命令类
 */
public class Noodles implements Breakfast{

    private Chef receiver;

    public Noodles(){
        receiver = new Chef();
    }

    @Override
    public void cook() {
        receiver.cookNoodles();
        System.out.println("面条真好吃，下次还吃！");
    }
}
