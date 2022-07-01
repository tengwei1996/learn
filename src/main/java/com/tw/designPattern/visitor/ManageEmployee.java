package com.tw.designPattern.visitor;

/**
 * 管理层员工
 */
public class ManageEmployee implements Employee {

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 工作时长 单位小时
     */
    private int workTime;

    /**
     * 迟到时长 单位小时
     */
    private int lateTime;

    /**
     * 工资
     */
    double wage;

    public ManageEmployee(String name, int workTime, int lateTime, double wage) {
        this.name = name;
        this.workTime = workTime;
        this.lateTime = lateTime;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWorkTime() {
        return workTime;
    }

    public int getLateTime() {
        return lateTime;
    }

    public double getWage() {
        return wage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public void setLateTime(int lateTime) {
        this.lateTime = lateTime;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public void accept(Department department) {
        department.visit(this);
    }

    /**
     * 获取管理层员工 工作时长
     * 工作时长 = 正常上班时长 - 迟到时长 * 2
     * @return
     */
    int getTotalWorkTime(){
        return this.workTime * 8 - this.lateTime;
    }

    /**
     * 获取管理层员工 工资
     * 工资 = 基本工资 - 迟到时长 * 5
     * 迟到按五块钱一小时算
     * @return
     */
    double getTotalWage(){
        return this.wage - this.lateTime * 5;
    }
}
