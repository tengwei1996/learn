package com.tw.designPattern.visitor;

/**
 * 场景：公司统计查看员工工作情况 查看工作时长和工资 人力资源部负责工作时长 财务部负责工资 员工又分为管理层和普通员工
 */
public class VisitorTest {

    public static void main(String[] args) {
        ManageEmployee manageZ = new ManageEmployee("张总", 8, 5, 10000.21);
        ManageEmployee manageW = new ManageEmployee("王总", 8, 5, 20000.21);
        ManageEmployee manageL = new ManageEmployee("李总", 8, 5, 30000.21);
        CommonEmployee commonZ = new CommonEmployee("小张", 10, 1, 8000.21);
        CommonEmployee commonW = new CommonEmployee("小王", 10, 10, 9000.21);
        CommonEmployee commonL = new CommonEmployee("小李", 10, 12, 7000.21);
        EmployeeStructure structure = new EmployeeStructure();
        structure.addEmployee(manageZ).addEmployee(manageW).addEmployee(manageL).addEmployee(commonZ).addEmployee(commonW).addEmployee(commonL);
        structure.show(new FADDepartment());
        System.out.println("--------------------------------------------------");
        structure.show(new HRDepartment());

    }
}
