package com.tw.designPattern.facade;

/**
 * 运维攻城狮 (子系统角色)
 */
public class Operations extends Worker{

    public Operations(String name,String job){
        super(name,job);
    }

    public void operationAndMaintenance(){
        System.out.println(super.getName() + "-" + super.getJob() + "开始运维...");
    }
}
