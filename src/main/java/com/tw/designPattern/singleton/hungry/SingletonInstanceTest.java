package com.tw.designPattern.singleton.hungry;

public class SingletonInstanceTest {

    public static void main(String[] args) {

        HungrySingletonInstance instance1 = HungrySingletonInstance.getInstance();

        HungrySingletonInstance instance2 = HungrySingletonInstance.getInstance();

        System.out.println(instance1 == instance2);
    }
}
