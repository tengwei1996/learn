package com.tw.designPattern.adapter.objectAdapter;

/**
 * 光能适配器
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
