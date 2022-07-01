package com.tw.designPattern.visitor.demo;

import java.util.Random;

public class Manager implements Employee{


    private String name;

    private int kpi;

    Manager(String name){
        this.name = name;
        this.kpi = new Random(10).nextInt();
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
