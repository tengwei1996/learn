package com.tw.designPattern.singleton.lazy;

public class LazySingletonInstanceTest {

    public static void main(String[] args) {

        LazySingletonInstance instance1 = LazySingletonInstance.getInstance();

        LazySingletonInstance instance2 = LazySingletonInstance.getInstance();

        System.out.println(instance1 == instance2);
    }
}
