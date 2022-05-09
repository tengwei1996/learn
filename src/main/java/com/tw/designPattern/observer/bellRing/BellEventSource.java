package com.tw.designPattern.observer.bellRing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 目标类：事件源，铃
 */
public class BellEventSource {

    /**
     * 监听器容器
     */
    private List<BellEventListener> listenerList;

    public BellEventSource(){
        this.listenerList = new ArrayList<>();
    }

    /**
     * 给事件源绑定监听器
     * @param listener
     */
    public void addPersonListener(BellEventListener listener){
        listenerList.add(listener);
    }

    /**
     * 事件触发器，当铃声sound值变化时，出发事件
     * @param sound
     */
    public void ring(boolean sound){
        String type = sound ? "上课铃" : "下课铃";
        System.out.println(type + "响！");
        RingEvent event = new RingEvent(this, sound);
        notifies(event);
    }

    /**
     * 当事件发生时，通知绑定在该事件源上的所有监听器做出反应（调用事件处理方法）
     * @param event
     */
    protected void notifies(RingEvent event){
        BellEventListener listener = null;
        Iterator<BellEventListener> iterator = listenerList.iterator();
        while (iterator.hasNext()){
            listener = iterator.next();
            listener.hearBell(event);
        }
    }

}
