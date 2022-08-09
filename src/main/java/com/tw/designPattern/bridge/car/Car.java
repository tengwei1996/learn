package com.tw.designPattern.bridge.car;

/**
 * 车 抽象化角色
 */
public abstract class Car {



    abstract String desc(Color color);

    abstract String desc(Color color,Model model);
}
