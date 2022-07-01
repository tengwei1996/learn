package com.tw.designPattern.builder;

/**
 * 抽象构造者
 */
public interface CarBuilder {

    CarBuilder buildEngine(String engine);

    CarBuilder buildCarBody(String carBody);

    CarBuilder buildAirConditioner(String airConditioner);

    CarBuilder buildSeat(String seat);

    CarBuilder buildWheels(String wheels);

    Car build();
}
