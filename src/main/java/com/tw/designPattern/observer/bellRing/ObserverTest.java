package com.tw.designPattern.observer.bellRing;

public class ObserverTest {

    public static void main(String[] args) {
        // 观察者
        Student student = new Student();
        Teacher teacher = new Teacher();
        // 被观察者
        BellRing bellRing = new BellRing();
        // 注册观察者
        bellRing.addObserver(student).addObserver(teacher);
        // 上课
        bellRing.ring();
        System.out.println("-------------------------");
        // 下课
        bellRing.ring();
    }
}
