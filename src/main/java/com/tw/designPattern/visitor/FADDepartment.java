package com.tw.designPattern.visitor;

/**
 * 访问者 财务部
 */
public class FADDepartment implements Department{


    @Override
    public void visit(ManageEmployee manageEmployee) {
        String name = manageEmployee.getName();
        int totalWorkTime = manageEmployee.getTotalWorkTime();
        double totalWage = manageEmployee.getTotalWage();
        System.out.println("管理层：" + name + "本月工作时长：" + totalWorkTime + "小时。本月薪资：" + totalWage + "元");
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        String name = commonEmployee.getName();
        int totalWorkTime = commonEmployee.getTotalWorkTime();
        double totalWage = commonEmployee.getTotalWage();
        System.out.println("普通员工：" + name + "本月工作时长：" + totalWorkTime + "小时。本月薪资：" + totalWage + "元");
    }
}
