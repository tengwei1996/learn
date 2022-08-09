package com.tw.designPattern.adapter.objectAdapter;

public class MotorAdapterTest {

    public static void main(String[] args) {
        Motor electricAdapter = new ElectricAdapter();
        electricAdapter.drive();
        Motor opticalAdapter = new OpticalAdapter();
        opticalAdapter.drive();
    }
}
