package com.tw.designPattern.observer.bellRing;

import java.util.ArrayList;
import java.util.List;

/**
 * 上下课铃声 被观察者
 */
public class BellRing implements Subject{

    /**
     * 铃声状态
     */
    private boolean ringState;

    /**
     * 观察者集合
     */
    private List<Observer>  observerList = new ArrayList<>();

    public boolean getRingState() {
        return ringState;
    }

    @Override
    public void ring() {
        this.ringState = !this.ringState;
        notifyAllObserver();
    }

    /**
     * 添加观察者
     * @param observer
     */
    public BellRing addObserver(Observer observer){
        observerList.add(observer);
        return this;
    }

    /**
     * 移除观察者
     * @param observer
     */
    public BellRing removeObserver(Observer observer){
        observerList.remove(observer);
        return this;
    }


    public void notifyAllObserver(){
        observerList.stream().forEach(observer -> {
            observer.desc(this);
        });
    }




}
