package com.tw.designPattern.observer.java.observer;

public class ObserverTest {

    public static void main(String[] args) {
        // 被观察者
        BellRing bellRing = new BellRing();
        // 观察者
        Student student = new Student();
        Teacher teacher = new Teacher();
        // 添加观察者
        bellRing.addObserver(student);
        bellRing.addObserver(teacher);
        bellRing.notifyAllObserver();
    }
}
