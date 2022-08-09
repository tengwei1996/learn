package com.tw.designPattern.proxy.dynamicProxy.jdk;

/**
 * 目标角色(被代理类)
 */
public class RealSubject implements Subject{
    @Override
    public void show() {
        System.out.println("show...");
    }
}
