package com.tw.designPattern.visitor.demo;

/**
 * 访问者 抽象访问者
 */
public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
