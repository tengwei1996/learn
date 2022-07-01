package com.tw.designPattern.builder;

/**
 * 具体构造者
 */
public class ConcreteCarBuilder implements CarBuilder{

    Car car;

    public ConcreteCarBuilder(Car car){
        this.car = car;
    }

    @Override
    public CarBuilder buildEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder buildCarBody(String carBody) {
        car.setCarBody(carBody);
        return this;
    }

    @Override
    public CarBuilder buildAirConditioner(String airConditioner) {
        car.setAirConditioner(airConditioner);
        return this;
    }

    @Override
    public CarBuilder buildSeat(String seat) {
        car.setSeat(seat);
        return this;
    }

    @Override
    public CarBuilder buildWheels(String wheels) {
        car.setWheels(wheels);
        return this;
    }

    @Override
    public Car build() {
        return this.car;
    }

}
