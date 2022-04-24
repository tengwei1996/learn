package com.tw.designPattern.facade;

public class QualityAssurance extends Worker{

    public QualityAssurance(String name,String job){
        super(name,job);
    }

    public void test(){
        System.out.println(super.getName() + "-" + super.getJob() + "开始测试...");
    }
}
