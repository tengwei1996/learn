package com.tw.designPattern.iterator;

/**
 * 抽象迭代器角色
 */
public interface Iterator<T> {

    Object first();

    Object next();

    boolean hasNext();
}
