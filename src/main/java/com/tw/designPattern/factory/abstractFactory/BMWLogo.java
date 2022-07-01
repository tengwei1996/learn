package com.tw.designPattern.factory.abstractFactory;

/**
 * 具体角色 宝马logo
 */
public class BMWLogo implements Logo{

    @Override
    public void info() {
        System.out.println("宝马车标。");
    }
}
