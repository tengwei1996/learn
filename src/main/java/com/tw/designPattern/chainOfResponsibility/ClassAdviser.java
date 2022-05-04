package com.tw.designPattern.chainOfResponsibility;

public class ClassAdviser extends Leader {


    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 2) {
            System.out.println("班主任批准你请假" + leaveDays + "天。");
        }else {
            if (getNext() != null){
                getNext().handleRequest(leaveDays);
            }else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
