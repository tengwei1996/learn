package com.tw.designPattern.facade;

/**
 * 测试攻城狮
 */
public class QualityAssurance extends Worker{

    public QualityAssurance(String name,String job){
        super(name,job);
    }

    public void test(){
        System.out.println(super.getName() + "-" + super.getJob() + "开始测试...");
    }
}
