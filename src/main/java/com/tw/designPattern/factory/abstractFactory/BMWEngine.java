package com.tw.designPattern.factory.abstractFactory;

/**
 * 具体角色 宝马发动机
 */
public class BMWEngine implements Engine{
    @Override
    public void info() {
        System.out.println("宝马发动机。");
    }
}
