package com.tw.designPattern.observer.java;

import java.util.Observer;

public class OilFuturesTest {

    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        // 多方
        Observer bull = new Bull();
        // 空方
        Observer bear = new Bear();
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
