package com.tw.designPattern.chainOfResponsibility;

/**
 * 院长 具体处理者
 */
public class Dean extends Leader {

    @Override
    public void handleRequest(int leaveDays) {

        System.out.println("院长批准你请假" + leaveDays + "天。");
        if (getNext() != null) {
            getNext().handleRequest(leaveDays);

        }
    }
}
