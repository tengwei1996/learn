package com.tw.designPattern.command.simple;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {

    public static void main(String[] args) {
        List<Breakfast> list = new ArrayList<>();
        Breakfast hunTun = new HunTun();
        Breakfast noodles = new Noodles();
        Waiter waiter = new Waiter(list);
        waiter.eatBreakfast(hunTun);
        waiter.eatBreakfast(noodles);
        System.out.println("-----------------早餐吃多个的---------------------");
        list.add(noodles);
        list.add(hunTun);
        waiter.earMoreBreakfast();

    }
}
