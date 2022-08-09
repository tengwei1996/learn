package com.tw.designPattern.visitor.demo;

/**
 * 员工 抽象元素 被访问者
 */
public interface Employee {

    void accept(Visitor visitor);
}
