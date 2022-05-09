package com.tw.designPattern.mediator.simplify;

public class SimpleMediatorTest {


    public static void main(String[] args) {
        SimpleColleague c1, c2;
        c1 = new SimpleConcreteColleagueOne();
        c2 = new SimpleConcreteColleagueTwo();
        c1.send();
        System.out.println("-----------------");
        c2.send();
    }
}
