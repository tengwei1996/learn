package com.tw.designPattern.facade;

/**
 * 开发攻城狮 (子系统角色)
 */
public class DevelopmentEngineer extends Worker{

    public DevelopmentEngineer(String name,String job){
        super(name,job);
    }

    public void develop(){
        System.out.println(super.getName() + "-" + super.getJob() + "开始研发...");
    }
}
