package com.tw.designPattern.mediator.common;

public class MediatorTest {

    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleagueOne();
        c2 = new ConcreteColleagueTwo();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
