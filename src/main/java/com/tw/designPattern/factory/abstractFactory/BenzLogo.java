package com.tw.designPattern.factory.abstractFactory;

/**
 * 具体角色 奔驰车标
 */
public class BenzLogo implements Logo{

    @Override
    public void info() {
        System.out.println("奔驰车标。");
    }
}
