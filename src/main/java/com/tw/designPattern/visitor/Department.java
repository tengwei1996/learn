package com.tw.designPattern.visitor;

public interface Department {

    void visit(ManageEmployee manageEmployee);

    void visit(CommonEmployee commonEmployee);
}
