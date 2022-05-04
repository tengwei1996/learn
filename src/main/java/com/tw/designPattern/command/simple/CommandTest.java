package com.tw.designPattern.command.simple;

public class CommandTest {

    public static void main(String[] args) {
        Breakfast hunTun = new HunTun();
        Breakfast noodles = new Noodles();
        Waiter waiter = new Waiter();
        waiter.setHunTun(hunTun);
        waiter.setNoodles(noodles);
        waiter.chooseHunTun();
        waiter.chooseNoodles();;
    }
}
