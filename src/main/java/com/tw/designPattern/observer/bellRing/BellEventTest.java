package com.tw.designPattern.observer.bellRing;

public class BellEventTest {

    public static void main(String[] args) {
        BellEventSource bellEventSource = new BellEventSource();
        bellEventSource.addPersonListener(new TeachEventListener());
        bellEventSource.addPersonListener(new StudentEventListener());
        bellEventSource.ring(true);
        System.out.println("-------------------------------");
        bellEventSource.ring(false);
    }
}
