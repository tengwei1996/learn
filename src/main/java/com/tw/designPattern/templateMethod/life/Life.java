package com.tw.designPattern.templateMethod.life;

/**
 *生活 抽象模板
 */
public abstract class Life {

    final void life() {
        getUp();
        washGargle();
        eatBreakfast();
        if (isWorkday()) {
            work();
        }
        eatLunch();
        if (isWorkday()) {
            work();
        }
        if (isWorkday()) {
            afterWork();
        }
        eatDinner();
        relax();
        washGargle();
        sleep();
    }

    final void getUp() {
        System.out.println("起床...");
    }

    final void washGargle() {
        System.out.println("洗漱...");
    }

    final void eatBreakfast() {
        System.out.println("吃早饭...");
    }

    final void work() {
        System.out.println("工作...");
    }

    final void eatLunch() {
        System.out.println("吃午饭...");
    }

    final void afterWork() {
        System.out.println("下班...");
    }

    final void eatDinner() {
        System.out.println("吃晚饭...");
    }

    abstract void relax();

    final void sleep() {
        System.out.println("睡觉...");
    }

    /**
     * 钩子函数 是否是工作日
     * @return
     */
    abstract Boolean isWorkday();
}
