package com.tw.designPattern.singleton.lazy;

/**
 * 懒汉式单例模式
 */
public class LazySingletonInstance {

    /**
     * 2.私有化实例对象
     *
     */
    private static volatile LazySingletonInstance instance = null;

    /**
     * 1.私有化构造方法
     */
    private LazySingletonInstance(){}

    /**
     * 3.全局的公共获取实例方法
     * @return
     */
    public static LazySingletonInstance getInstance(){
        if (instance == null){// 1
            synchronized (LazySingletonInstance.class){
                if (instance == null){// 2
                    instance = new LazySingletonInstance();// 3
                }
            }
        }
        return instance;
    }
}
