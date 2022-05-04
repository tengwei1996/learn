package com.tw.designPattern.command.simple;

/**
 * 面条（具体命令）
 */
public class Noodles implements Breakfast{

    private NoodlesChef receiver;

    public Noodles(){
        receiver = new NoodlesChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
