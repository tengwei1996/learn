package com.tw.designPattern.bridge.car;

/**
 * 轿车 具体实现化角色
 */
public class Limousine implements Model{

    @Override
    public String modelDesc() {
        return "轿车";
    }
}
