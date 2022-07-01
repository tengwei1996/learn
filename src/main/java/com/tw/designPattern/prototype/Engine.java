package com.tw.designPattern.prototype;

import java.io.Serializable;

/**
 * 原型类 发动机
 */
public class Engine implements Serializable {

    /**
     * 型号
     */
    private String modelNum;

    /**
     * 功率
     */
    private String power;

    public String getModelNum() {
        return modelNum;
    }

    public String getPower() {
        return power;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "modelNum='" + modelNum + '\'' +
                ", power='" + power + '\'' +
                '}';
    }

}
