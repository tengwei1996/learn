package com.tw.designPattern.adapter.objectAdapter;

/**
 * 适配器(Adapter)光能适配器
 */
public class OpticalAdapter implements Motor{

    private OpticalMotor opticalMotor;

    public OpticalAdapter(){
        opticalMotor = new OpticalMotor();
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
