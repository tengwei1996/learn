package com.tw.designPattern.facade;

/**
 * 开发经理
 */
public class DevelopManager extends Worker{

    public DevelopManager(String name,String job){
        super(name,job);
    }

    public void makeDevelopPlan(){
        System.out.println(super.getName() + "-" + super.getJob() + "制定研发计划...");
    }
}
