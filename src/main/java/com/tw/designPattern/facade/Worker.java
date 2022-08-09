package com.tw.designPattern.facade;

/**
 * 员工 （子系统角色）
 */
public class Worker {

    private String name;

    private String job;

    public Worker(String name,String job){
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }


}
