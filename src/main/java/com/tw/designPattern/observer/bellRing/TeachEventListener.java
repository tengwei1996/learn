package com.tw.designPattern.observer.bellRing;

/**
 * 具体观察者类：老师事件监听器
 */
public class TeachEventListener implements BellEventListener {

    @Override
    public void hearBell(RingEvent event) {
        if (event.getSound()){
            System.out.println("老师上课了...");
        }else {
            System.out.println("老师下课了...");
        }
    }
}
