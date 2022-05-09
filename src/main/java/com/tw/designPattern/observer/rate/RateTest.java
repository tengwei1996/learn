package com.tw.designPattern.observer.rate;

public class RateTest {

    public static void main(String[] args) {
        RMBRate rmbRate = new RMBRate();
        Company watcher1 = new ImportCompany();
        Company watcher2 = new ExportCompany();
        rmbRate.add(watcher1);
        rmbRate.add(watcher2);
        rmbRate.change(10);
        rmbRate.change(-10);
    }
}
