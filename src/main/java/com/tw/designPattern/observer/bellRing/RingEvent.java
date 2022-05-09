package com.tw.designPattern.observer.bellRing;

import java.util.EventObject;

/**
 * 铃声事件类：用于封装事件源及一些与使劲按相关的参数
 */
public class RingEvent extends EventObject {

    private static final long serialVersionUID = 1L;

    /**
     * true -- 上课铃声
     * false -- 下课铃声
     */
    private boolean sound;

    public RingEvent(Object source,boolean sound){
        super(source);
        this.sound = sound;
    }

    public void setSound(boolean sound){
        this.sound = sound;
    }

    public boolean getSound(){
        return sound;
    }
}
