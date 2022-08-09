package com.tw.designPattern.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类
 */
public class CGlibProxySubject implements MethodInterceptor {


    /**
     * 代理目标对象
     * @param t 目标对象
     * @param <T>
     * @return
     */
    public <T> T getInstance(T t) {
        // 创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        // 为加强器指定要代理的目标对象（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(t.getClass());
        // 设置回调：对于代理类上所有方法的调用，都会调用Callback，而Callback则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);
        // 创建动态代理类并返回
        return (T) enhancer.create();
    }

    /**
     * @param o           cglib生成的代理对象
     * @param method      被代理对象的方法
     * @param objects     传入方法的参数
     * @param methodProxy 代理的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("show before...");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("show after...");
        return result;
    }
}
