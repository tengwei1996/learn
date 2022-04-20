package com.tw.designPattern.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxySubject implements InvocationHandler {

    //这个就是我们要代理的真实对象
    private Object subject;

    //构造方法，给我们要代理的真实对象赋初值
    public JdkProxySubject(Object subject) {
        this.subject = subject;
    }

    /**
     * @param proxy  指被代理的对象
     * @param method 要调用的方法
     * @param args   方法调用时所需要的参数
     * @return
     * @throws Throwable
     * InvocationHandler接口的子类可以看做代理的最终操作类
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 被代理类方法执行之前
        System.out.println("show before...");
        Object result = null;
        try {
            // 利用反射机制，动态执行目标（被代理类）的方法
            result = method.invoke(subject, args);
        } catch (Exception e) {
            // 目标（被代理类）方法执行发生异常
            System.out.println("show after throw exception...");
        }
        // 被代理类方法执行之后
        System.out.println("show after...");
        return result;
    }
}
