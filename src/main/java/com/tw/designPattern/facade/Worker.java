package com.tw.designPattern.facade;

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
