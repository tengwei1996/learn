package com.tw.designPattern.state;

/**
 * 就绪状态
 */
public class Runnable extends ThreadState{

    public Runnable(){
        stateName = "就绪状态";
        System.out.println("当前线程处于；就绪状态。");
    }

    public void getCPU(ThreadContext threadContext){
        System.out.println("获取CPU时间-->");
        if ("就绪状态".equals(stateName)){
            threadContext.setThreadState(new Running());
        }else {
            System.out.println("当前线程不是就绪状态，不能获取CPU。");
        }
    }
}
