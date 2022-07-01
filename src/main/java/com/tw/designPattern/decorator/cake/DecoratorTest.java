package com.tw.designPattern.decorator.cake;

public class DecoratorTest {

    public static void main(String[] args) {
        Cake cake = new CommonCake();// 1
        cake = new Decorator(cake);// 2
        System.out.println(cake.getCakeDesc() + " 价格： " + cake.getPrice());
        cake = new MangoCakeDecorator(cake);// 3
        System.out.println(cake.getCakeDesc() + " 价格： " + cake.getPrice());
        cake = new MangoCakeDecorator(cake);// 4
        System.out.println(cake.getCakeDesc() + " 价格： " + cake.getPrice());
        cake = new GrapesCakeDecorator(cake); // 5
        System.out.println(cake.getCakeDesc() + " 价格： " + cake.getPrice());
    }
}
