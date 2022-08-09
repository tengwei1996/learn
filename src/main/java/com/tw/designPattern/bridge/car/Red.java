package com.tw.designPattern.bridge.car;

/**
 * 红色 具体实现化角色
 */
public class Red implements Color {

    @Override
    public String color() {
        return "红色的";
    }
}
