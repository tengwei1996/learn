package com.tw.designPattern.command.simple;

/**
 * 服务原（调用者）
 */
public class Waiter {

    private Breakfast hunTun,noodles;

    public void setHunTun(Breakfast hunTun) {
        this.hunTun = hunTun;
    }

    public void setNoodles(Breakfast noodles) {
        this.noodles = noodles;
    }

    public void chooseHunTun(){
        hunTun.cooking();
    }

    public void chooseNoodles(){
        noodles.cooking();
    }
}
