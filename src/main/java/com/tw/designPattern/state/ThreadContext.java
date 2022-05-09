package com.tw.designPattern.state;

public class ThreadContext {

    private ThreadState threadState;

    public ThreadContext() {
        threadState = new New();
    }

    public ThreadState getThreadState() {
        return threadState;
    }

    public void setThreadState(ThreadState threadState) {
        this.threadState = threadState;
    }

    public void start() {
        ((New) threadState).start(this);
    }

    public void getCPU() {
        ((Runnable) threadState).getCPU(this);
    }

    public void suspend() {
        ((Running) threadState).suspend(this);
    }

    public void stop() {
        ((Running) threadState).stop(this);
    }

    public void resume() {
        ((Blocked) threadState).resume(this);
    }
}
