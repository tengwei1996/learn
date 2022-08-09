package com.tw.designPattern.chainOfResponsibility;

/**
 * 班主任 具体处理者
 */
public class ClassAdviser extends Leader {


    @Override
    public void handleRequest(int leaveDays) {

        System.out.println("班主任批准你请假" + leaveDays + "天。");
        if (getNext() != null) {
            getNext().handleRequest(leaveDays);
        }
    }
}
