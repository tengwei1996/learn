package com.tw.designPattern.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Traveller traveller = new Traveller();
        TravelWay planeWay = new PlaneWay();
        TravelWay selfDrivingWay = new SelfDrivingWay();
        TravelWay trainWay = new TrainWay();
        traveller.setTravelWay(planeWay);
        traveller.travelWay();
        traveller.setTravelWay(selfDrivingWay);
        traveller.travelWay();
        traveller.setTravelWay(trainWay);
        traveller.travelWay();

    }
}
