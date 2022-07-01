package com.tw.designPattern.visitor;

/**
 * 抽象被访问者
 * 员工
 */
public interface Employee {

    void accept(Department department);
}
