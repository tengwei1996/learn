package com.tw.designPattern.proxy.staticProxy;

public class RealSubject implements Subject {
    @Override
    public void show() {
        System.out.println("show...");
    }
}
