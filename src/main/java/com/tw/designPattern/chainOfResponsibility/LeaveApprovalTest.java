package com.tw.designPattern.chainOfResponsibility;

public class LeaveApprovalTest {

    public static void main(String[] args) {
        // 组装责任链
        Leader classAdviser = new ClassAdviser();
        Leader departmentHead = new DepartmentHead();
        Leader dean = new Dean();
        Leader deanOfStudies = new DeanOfStudies();
        classAdviser.setNext(departmentHead);
        departmentHead.setNext(dean);
        dean.setNext(deanOfStudies);
        // 提交请求
        classAdviser.handleRequest(20);
    }
}
