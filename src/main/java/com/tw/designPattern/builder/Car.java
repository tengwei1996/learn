package com.tw.designPattern.builder;

/**
 * 产品 汽车
 */
public class Car {

    /**
     * 发动机
     */
    private String engine;

    /**
     * 车身
     */
    private String carBody;

    /**
     * 空调
     */
    private String airConditioner;

    /**
     * 座椅
     */
    private String seat;

    /**
     * 车轮
     */
    private String wheels;

    public String getEngine() {
        return engine;
    }

    public String getCarBody() {
        return carBody;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public String getSeat() {
        return seat;
    }

    public String getWheels() {
        return wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", carBody='" + carBody + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", seat='" + seat + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
    }
}
