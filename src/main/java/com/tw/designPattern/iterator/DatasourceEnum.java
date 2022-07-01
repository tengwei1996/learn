package com.tw.designPattern.iterator;

public enum DatasourceEnum {
    DATASOURCE;

    private ConcreteIterator concreteIterator;

    private DatasourceEnum(){
        concreteIterator = new ConcreteIterator();
    }

    public ConcreteIterator getInstance(){
        return concreteIterator;
    }

}
