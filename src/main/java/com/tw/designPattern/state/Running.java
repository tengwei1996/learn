package com.tw.designPattern.state;

/**
 * 运行状态
 */
public class Running extends ThreadState{

    public Running(){
        stateName = "运行状态";
        System.out.println("当前线程处于：运行状态。");
    }

    public void suspend(ThreadContext threadContext){
        System.out.println("调用suspend()方法-->");
        if ("运行状态".equals(stateName)){
            threadContext.setThreadState(new Blocked());
        }else {
            System.out.println("当前线程不是运行状态，不能调用stop()方法。");
        }
    }

    public void stop(ThreadContext threadContext){
        System.out.println("调用stop()方法-->");
        if ("运行状态".equals(stateName)){
            threadContext.setThreadState(new Dead());
        }else {
            System.out.println("当前线程不是运行状态，不能调用stop()方法。");
        }
    }
}
