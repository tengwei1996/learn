package com.tw.designPattern.bridge.car;

/**
 * 奔驰车 扩展抽象化角色
 */
public class BenzCar extends Car{



    @Override
    public String desc(Color color) {
        return color.color() +  "奔驰";
    }

    @Override
    String desc(Color color, Model model) {
        return color.color() + "奔驰" + model.modelDesc();
    }
}
