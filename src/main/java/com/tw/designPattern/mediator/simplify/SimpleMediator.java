package com.tw.designPattern.mediator.simplify;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单单例中介者
 *
 * 在实际开发中，通常采用以下两种方法来简化中介者模式，使开发变得更简单。
 * 不定义中介者接口，把具体中介者对象实现成为单例。
 * 同事对象不持有中介者，而是在需要的时候直接获取中介者对象并调用。
 */
public class SimpleMediator {

    private static SimpleMediator smd = new SimpleMediator();

    private List<SimpleColleague> colleagueList = new ArrayList<>();

    private SimpleMediator(){}

    public static SimpleMediator getInstance(){
        return smd;
    }

    public void register(SimpleColleague colleague){
        if (!colleagueList.contains(colleague)){
            colleagueList.add(colleague);
        }
    }

    public void relay(SimpleColleague colleague){
        for (SimpleColleague simpleColleague : colleagueList){
            if (!simpleColleague.equals(colleague)){
                simpleColleague.receive();
            }
        }
    }


}
