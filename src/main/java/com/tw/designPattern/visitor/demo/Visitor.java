package com.tw.designPattern.visitor.demo;

public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
