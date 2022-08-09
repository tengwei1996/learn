package com.tw.designPattern.bridge.car;

public class CarTest {

    public static void main(String[] args) {
        Color red = new Red();
        Color black = new Black();
        BMWCar bmwCar = new BMWCar();
        String redBMW = bmwCar.desc(red);
        System.out.println(redBMW);
        BenzCar benzCar = new BenzCar();
        String blackBenz = benzCar.desc(black);
        System.out.println(blackBenz);
        System.out.println("-----------------------------------");
        Limousine limousine = new Limousine();
        Suv suv = new Suv();
        String redBmwLim = bmwCar.desc(red, limousine);
        System.out.println(redBmwLim);
        String blackBenzSuv = benzCar.desc(black, suv);
        System.out.println(blackBenzSuv);
    }
}
