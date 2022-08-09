package com.tw.designPattern.command.simple;

/**
 * 厨师 实现者/接收者
 */
public class Chef {

    public void cookHunTun(){
        System.out.println("厨师做好了馄饨！");
    }

    public void cookNoodles(){
        System.out.println("厨师做好了面条！");
    }
}
