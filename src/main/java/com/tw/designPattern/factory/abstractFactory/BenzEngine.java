package com.tw.designPattern.factory.abstractFactory;

/**
 * 具体角色 奔驰发动机
 */
public class BenzEngine implements Engine{
    @Override
    public void info() {
        System.out.println("奔驰发动机。");
    }
}
