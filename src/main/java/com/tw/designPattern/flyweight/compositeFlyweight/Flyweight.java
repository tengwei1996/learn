package com.tw.designPattern.flyweight.compositeFlyweight;

/**
 * 抽象享元角色
 */
public interface Flyweight {

    /**
     * 一个示意性方法，参数state是外蕴状态，由外部传入
     * @param state
     */
    void operation(String state);
}
