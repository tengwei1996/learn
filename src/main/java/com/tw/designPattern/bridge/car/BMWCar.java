package com.tw.designPattern.bridge.car;

/**
 * 宝马车 扩展抽象化角色
 */
public class BMWCar extends Car {

    @Override
    public String desc(Color color) {
        return color.color() + "宝马";
    }

    @Override
    String desc(Color color, Model model) {
        return color.color() + "宝马" + model.modelDesc();
    }
}
