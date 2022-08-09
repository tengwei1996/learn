package com.tw.designPattern.chainOfResponsibility.approve;

/**
 * 具体处理者
 */
public class ApproveHandlerTwo implements ApproveHandler{

    @Override
    public void handleRequest() {
        System.out.println("处理第二个请求!");
    }

}
