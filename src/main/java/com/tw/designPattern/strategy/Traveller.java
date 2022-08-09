package com.tw.designPattern.strategy;

/**
 * 旅行者 环境类
 */
public class Traveller {

    private TravelWay travelWay;

    public TravelWay getTravelWay() {
        return travelWay;
    }

    public void setTravelWay(TravelWay travelWay) {
        this.travelWay = travelWay;
    }

    public void travelWay(){
        travelWay.travelWay();
    }

}
