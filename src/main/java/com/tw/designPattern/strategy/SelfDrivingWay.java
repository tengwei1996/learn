package com.tw.designPattern.strategy;

/**
 * 自驾（具体策略（Concrete Strategy）类）
 */
public class SelfDrivingWay implements TravelWay {

    @Override
    public void travelWay() {
        System.out.println("自驾出去旅游！");
    }
}
