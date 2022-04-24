package com.tw.designPattern.facade;

public class ProjectManager extends Worker{

    public ProjectManager(String name,String job){
        super(name,job);
    }

    public void makeProjectPlan(){
        System.out.println(super.getName() + "-" + super.getJob() + "指定项目计划...");
    }

    public void analysisRequirement(){
        System.out.println(super.getName() + "-" + super.getJob() + "分析项目需求...");
    }
}
