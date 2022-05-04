package com.tw.designPattern.strategy;

/**
 * 坐飞机（具体策略（Concrete Strategy）类）
 */
public class PlaneWay implements TravelWay{

    @Override
    public void travelWay() {
        System.out.println("坐飞机出去旅游！");
    }
}
