package com.tw.designPattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStructure {

    List<Employee> employeeList = new ArrayList<>();

    public EmployeeStructure addEmployee(Employee employee){
        employeeList.add(employee);
        return this;
    }

    public void show(Department department){
        for (Employee emp:employeeList) {
            emp.accept(department);
        }
    }
}
