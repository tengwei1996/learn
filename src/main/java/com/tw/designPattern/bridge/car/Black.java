package com.tw.designPattern.bridge.car;

/**
 * 黑色 具体实现化角色
 */
public class Black implements Color {

    @Override
    public String color() {
        return "黑色的";
    }
}
