package com.tw.designPattern.composite.security;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件：袋子
 */
public class Bag implements Articles{

    private String name;

    private List<Articles> bagList = new ArrayList<>();

    public Bag(String name){
        this.name = name;
    }

    public void add(Articles articles){
        bagList.add(articles);
    }

    public void remove(Articles articles){
        bagList.remove(articles);
    }

    public Articles getChild(int index){
        return bagList.get(index);
    }

    @Override
    public float calculation() {
        float totalPrice = 0;
        for (Articles articles : bagList){
            totalPrice += articles.calculation();
        }
        return totalPrice;
    }

    @Override
    public void show() {
        for (Articles articles : bagList){
            articles.show();
        }
    }
}
