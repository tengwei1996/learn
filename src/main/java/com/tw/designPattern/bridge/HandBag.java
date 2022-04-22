package com.tw.designPattern.bridge;

public class HandBag extends Bag {

    @Override
    protected String getName() {
        return color.getColor() + "挎包！";
    }
}
