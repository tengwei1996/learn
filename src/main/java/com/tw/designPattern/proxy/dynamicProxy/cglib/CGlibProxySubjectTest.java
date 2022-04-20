package com.tw.designPattern.proxy.dynamicProxy.cglib;

public class CGlibProxySubjectTest {

    public static void main(String[] args) {

        RealSubject instance = new CGlibProxySubject().getInstance(new RealSubject());
        instance.show();
    }
}
