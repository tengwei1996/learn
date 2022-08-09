package com.tw.designPattern.chainOfResponsibility;

/**
 * 系主任 具体处理者
 */
public class DepartmentHead extends Leader {
    @Override
    public void handleRequest(int leaveDays) {

        System.out.println("系主任批准你请假" + leaveDays + "天。");
        if (getNext() != null) {
            getNext().handleRequest(leaveDays);
        }
    }
}

