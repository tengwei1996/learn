package com.tw.designPattern.factory.abstractFactory;

/**
 * 抽象角色 汽车工厂
 */
public interface CarFactory {

    /**
     * 生产发动机
     * @return
     */
    Engine productEngine();

    /**
     * 生产log
     * @return
     */
    Logo productLogo();
}
