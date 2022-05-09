package com.tw.designPattern.state;

public class ThreadStateTest {

    public static void main(String[] args) {
        ThreadContext threadContext = new ThreadContext();
        threadContext.start();
        threadContext.getCPU();
        threadContext.suspend();
        threadContext.resume();
        threadContext.getCPU();
        threadContext.stop();
    }
}
