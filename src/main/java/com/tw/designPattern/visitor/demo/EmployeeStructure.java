package com.tw.designPattern.visitor.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象
 */
public class EmployeeStructure {

    List<Employee> list = new ArrayList<>();

    public EmployeeStructure addEmployee(Employee employee){
        list.add(employee);
        return this;
    }

    public void report(Visitor visitor){
        list.forEach(employee -> {
            employee.accept(visitor);
        });
    }
}
