package com.tw.designPattern.templateMethod.life;

/**
 * 我的生活 具体模板
 */
public class MineLife extends Life{

    @Override
    void relax() {
        System.out.println("家人聊天放松一下...");
    }

    @Override
    Boolean isWorkday() {
        return false;
    }
}
