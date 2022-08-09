package com.tw.designPattern.visitor.demo;

/**
 * CEO 具体访问者
 */
public class CEOVisitor implements Visitor{


    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.getName() + "KPI:" + engineer.getKpi());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.getName() + "KPI:" + manager.getKpi() + " 今年共完成项目：" + manager.getProductNum() + "个");
    }
}
