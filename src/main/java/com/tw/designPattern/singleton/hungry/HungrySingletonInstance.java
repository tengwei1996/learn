package com.tw.designPattern.singleton.hungry;

/**
 * 饿汉式单例模式
 */
public class HungrySingletonInstance {

    /**
     * 2.私有化变量声明
     */
    private static final   HungrySingletonInstance instance;

    static {
        instance = new HungrySingletonInstance();
    }

    /**
     * 1.私有化构造方法
     */
    private HungrySingletonInstance() {
    }

    /**
     * 3.提供公共的获取实例方法
     * @return
     */
    public static HungrySingletonInstance getInstance(){
        return instance;
    }

}
