package com.tw.designPattern.facade;

public class DevelopmentEngineer extends Worker{

    public DevelopmentEngineer(String name,String job){
        super(name,job);
    }

    public void develop(){
        System.out.println(super.getName() + "-" + super.getJob() + "开始研发...");
    }
}
