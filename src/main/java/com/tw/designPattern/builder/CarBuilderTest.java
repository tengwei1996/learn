package com.tw.designPattern.builder;

public class CarBuilderTest {

    public static void main(String[] args) {
        Car car = new Car();
        CarBuilder builder = new ConcreteCarBuilder(car);
        builder.buildEngine("宝马B48B20C")
                .buildCarBody("宝马七系车身")
                .buildSeat("宝马七系座椅")
                .buildAirConditioner("宝马七系空调")
                .buildWheels("宝马七系车轮")
                .build();
        System.out.println(car);
    }
}
