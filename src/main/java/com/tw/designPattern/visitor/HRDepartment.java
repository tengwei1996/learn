package com.tw.designPattern.visitor;

/**
 * 访问者 人力资源部
 */
public class HRDepartment implements Department{


    @Override
    public void visit(ManageEmployee manageEmployee) {
        String name = manageEmployee.getName();
        int totalWorkTime = manageEmployee.getTotalWorkTime();
        System.out.println("管理层：" + name + "本月工作时长：" + totalWorkTime + "，小时。本月迟到时长：" + manageEmployee.getLateTime() + "小时。");
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        String name = commonEmployee.getName();
        int totalWorkTime = commonEmployee.getTotalWorkTime();
        System.out.println("普通员工：" + name + "本月工作时长：" + totalWorkTime + "，小时。本月迟到时长：" + commonEmployee.getLateTime() + "小时。");
    }
}
