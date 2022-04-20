package com.tw.designPattern.proxy.dynamicProxy.jdk;

public class RealSubject implements Subject{
    @Override
    public void show() {
        System.out.println("show...");
    }
}
