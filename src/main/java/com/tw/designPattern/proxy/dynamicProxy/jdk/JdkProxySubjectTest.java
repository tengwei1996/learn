package com.tw.designPattern.proxy.dynamicProxy.jdk;

import java.lang.reflect.Proxy;

public class JdkProxySubjectTest {

    public static void main(String[] args) {
        // 要代理的真实对象
        Subject realSubject = new RealSubject();
        // 要代理哪个对象，就将该对象作为构造函数的实参
        JdkProxySubject handler = new JdkProxySubject(realSubject);
        // newProxyInstance(ClassLoader loader,Class<?>[] interfaces, InvocationHandler h)参数解释
        // ClassLoader loader:Java类加载器; 可以通过这个类型的加载器，在程序运行时，将生成的代理类加载到JVM即Java虚拟机中，以便运行时需要
        // Class<?>[] interfaces:被代理类的所有接口信息：便于生成的代理类可以具有代理类接口中的所有方法
        // InvocationHandler h:调用处理器：调用实现了InvocationHandler类的一个回调方法
        Subject subject = (Subject) Proxy.newProxyInstance(JdkProxySubjectTest.class.getClassLoader(), new Class[]{Subject.class}, handler);
        subject.show();
    }
}
