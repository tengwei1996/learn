package com.tw.designPattern.visitor.demo;

public class EmployeeTest {

    public static void main(String[] args) {
        Engineer engineerZ = new Engineer("小张");
        Engineer engineerW = new Engineer("小王");
        Engineer engineerL = new Engineer("小李");

        Manager managerZ = new Manager("张总");
        Manager managerW = new Manager("王总");
        Manager managerL = new Manager("李总");

        EmployeeStructure structure = new EmployeeStructure();
        structure.addEmployee(engineerZ).addEmployee(engineerW).addEmployee(engineerL).addEmployee(managerZ).addEmployee(managerW).addEmployee(managerL);
        structure.report(new CTOVisitor());
        System.out.println("---------------------------------------");
        structure.report(new CEOVisitor());
    }
}
