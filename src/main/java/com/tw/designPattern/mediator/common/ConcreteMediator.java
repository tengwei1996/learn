package com.tw.designPattern.mediator.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator{

    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)){
            colleagueList.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague o : colleagueList){
            if (!o.equals(colleague)){
                o.receive();
            }
        }
    }
}
