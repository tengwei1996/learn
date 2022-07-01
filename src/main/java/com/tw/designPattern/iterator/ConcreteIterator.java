package com.tw.designPattern.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator{

    private List<Object> list = null;

    private int index = -1;

    public ConcreteIterator(){}

    public ConcreteIterator(List<Object> list){
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object o = list.get(index);
        return o;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (hasNext()){
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1){
            return true;
        }
        return false;
    }
}
