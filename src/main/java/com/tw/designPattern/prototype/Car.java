package com.tw.designPattern.prototype;

import java.io.Serializable;

/**
 * 原型类 汽车
 */
public class Car implements Serializable {

    private String carBody;

    private String wheels;

    private Engine engine;

    public String getCarBody() {
        return carBody;
    }

    public String getWheels() {
        return wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBody='" + carBody + '\'' +
                ", wheels='" + wheels + '\'' +
                ", engine=" + engine +
                '}';
    }

}
