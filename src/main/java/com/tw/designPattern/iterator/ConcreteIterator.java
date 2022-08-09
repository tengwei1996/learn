package com.tw.designPattern.iterator;

import java.util.List;

/**
 * 具体迭代器角色
 */
public class ConcreteIterator<T> implements Iterator<T>{

    private List<T> list;

    private int index = -1;

    public ConcreteIterator(List<T> list){
        this.list = list;
    }

    @Override
    public T first() {
        index = 0;
        T o = list.get(index);
        return o;
    }

    @Override
    public T next() {
        T t = null;
        if (hasNext()){
            t = list.get(++index);
        }
        return t;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1){
            return true;
        }
        return false;
    }
}
