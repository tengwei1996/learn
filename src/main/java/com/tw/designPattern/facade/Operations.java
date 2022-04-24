package com.tw.designPattern.facade;

public class Operations extends Worker{

    public Operations(String name,String job){
        super(name,job);
    }

    public void operationAndMaintenance(){
        System.out.println(super.getName() + "-" + super.getJob() + "开始运维...");
    }
}
