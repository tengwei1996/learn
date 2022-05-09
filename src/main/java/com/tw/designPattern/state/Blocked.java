package com.tw.designPattern.state;

/**
 * 阻塞状态
 */
public class Blocked extends ThreadState{

    public Blocked(){
        stateName = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态。");
    }

    public void resume(ThreadContext threadContext){
        System.out.println("调用resume()方法-->");
        if ("阻塞状态".equals(stateName)){
            threadContext.setThreadState(new Runnable());
        }else {
            System.out.println("当前线程不是阻塞状态，不能嗲用resume()方法。");
        }
    }
}
