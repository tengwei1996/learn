package com.tw.designPattern.strategy;

/**
 * 坐火车 具体策略类
 */
public class TrainWay implements TravelWay{

    @Override
    public void travelWay() {
        System.out.println("坐火车出去旅游！");
    }
}
