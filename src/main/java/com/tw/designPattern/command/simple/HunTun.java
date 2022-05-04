package com.tw.designPattern.command.simple;

/**
 * 馄饨命令（具体命令）
 */
public class HunTun implements Breakfast{

    private HunTunChef receiver;

    public HunTun(){
        receiver = new HunTunChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
