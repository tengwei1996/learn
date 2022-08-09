package com.tw.designPattern.visitor.demo;

import java.util.Random;

/**
 * 管理者 具体元素 被访问者
 */
public class Manager implements Employee{


    private String name;

    private int kpi;

    Manager(String name){
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProductNum(){
        return this.kpi * 10;
    }
}
