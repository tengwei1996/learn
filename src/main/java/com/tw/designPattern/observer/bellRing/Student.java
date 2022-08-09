package com.tw.designPattern.observer.bellRing;

/**
 * 学生 具体观察者角色
 */
public class Student implements Observer{

    @Override
    public void desc(BellRing bellRing) {
        if (bellRing.getRingState()){
            System.out.println("上课铃声响了，学生们上课了！");
        }else {
            System.out.println("下课铃声响了，学生们下课了！");
        }
    }
}
