package com.tw.designPattern.observer.java.observer;

import java.util.Observable;

/**
 * 上下课铃声 被观察者
 */
public class BellRing extends Observable {

    /**
     * 铃声状态
     */
    private boolean ringState;

    public boolean getRingState() {
        return ringState;
    }

    public void notifyAllObserver(){
        this.ringState = !this.ringState;
        setChanged();
        notifyObservers();
    }
}
