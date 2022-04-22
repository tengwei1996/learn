package com.tw.designPattern.bridge;

public class Wallet extends Bag {

    @Override
    protected String getName() {
        return color.getColor() + "钱包!";
    }
}
