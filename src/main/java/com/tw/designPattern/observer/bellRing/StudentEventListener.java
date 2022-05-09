package com.tw.designPattern.observer.bellRing;

public class StudentEventListener implements BellEventListener {

    @Override
    public void hearBell(RingEvent event) {
        if (event.getSound()){
            System.out.println("同学们，上课了...");
        }else {
            System.out.println("同学们，下课了...");
        }
    }
}
