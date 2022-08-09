package com.tw.designPattern.proxy.staticProxy;

/**
 * 目标角色(被代理类)
 */
public class RealSubject implements Subject {
    @Override
    public void show() {
        System.out.println("show...");
    }
}
