package com.tw.designPattern.command.simple;

/**
 * 馄饨 具体命令类
 */
public class HunTun implements Breakfast{

    private Chef receiver;

    public HunTun(){
        receiver = new Chef();
    }

    @Override
    public void cook() {
        receiver.cookHunTun();
        System.out.println("馄饨真好吃，下次还吃！");
    }
}
