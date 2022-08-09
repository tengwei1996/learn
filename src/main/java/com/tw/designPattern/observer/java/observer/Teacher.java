package com.tw.designPattern.observer.java.observer;


import java.util.Observable;
import java.util.Observer;

/**
 * 老师 具体观察者角色
 */
public class Teacher implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        BellRing bellRing = (BellRing) o;
        if (bellRing.getRingState()) {
            System.out.println("上课铃声响了，老师上课了！");
        } else {
            System.out.println("下课铃声响了，老师下课了！");
        }
    }
}
