package com.tw.designPattern.bridge;

public class BridgeTest {

    public static void main(String[] args) {
//        Bag bag = new Wallet();
//        Color color = new Black();
        Bag bag = new HandBag();
        Color color = new Red();
        bag.setColor(color);
        String bagName = bag.getName();
        System.out.println(bagName);
    }
}
