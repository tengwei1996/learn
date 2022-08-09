package com.tw.designPattern.chainOfResponsibility;

/**
 * 客户端
 */
public class LeaveApprovalTest {

    public static void main(String[] args) {
        // 组装责任链
        Leader classAdviser = new ClassAdviser();
        Leader departmentHead = new DepartmentHead();
        Leader dean = new Dean();
        // 不用建造者模式组装责任链
        // classAdviser.setNext(departmentHead);
        // departmentHead.setNext(dean);
        // dean.setNext(deanOfStudies);
        // 提交请求
        // classAdviser.handleRequest(20);
        // 建造者模式组装责任链
        Leader.BuildLeader buildLeader = new Leader.BuildLeader();
        // 这里给大家看的分明一点就不直接.handleRequest(20)了
        Leader leader = buildLeader.addLeader(classAdviser).addLeader(departmentHead).addLeader(dean).build();
        // 提交请求
        leader.handleRequest(20);
    }
}
