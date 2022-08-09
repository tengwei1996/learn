package com.tw.designPattern.decorator.cake1;



public class DecoratorTest {

    public static void main(String[] args) {
        Cake cake = new CommonCake();
        System.out.println(cake.getCakeDesc() + " 价格： " + cake.getPrice());
        cake = new MangoCakeDecorator(cake);
        System.out.println(cake.getCakeDesc() + " 价格： " + cake.getPrice());
        cake = new MangoCakeDecorator(cake);
        System.out.println(cake.getCakeDesc() + " 价格： " + cake.getPrice());
        cake = new GrapesCakeDecorator(cake);
        System.out.println(cake.getCakeDesc() + " 价格： " + cake.getPrice());
    }
}