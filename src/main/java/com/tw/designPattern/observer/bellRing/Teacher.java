package com.tw.designPattern.observer.bellRing;

/**
 * 老师 具体观察者角色
 */
public class Teacher implements Observer{

    @Override
    public void desc(BellRing bellRing) {
        if (bellRing.getRingState()){
            System.out.println("上课铃声响了，老师上课了！");
        }else {
            System.out.println("下课铃声响了，老师下课了！");
        }
    }
}
