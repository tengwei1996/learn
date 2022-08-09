package com.tw.designPattern.chainOfResponsibility.approve;

/**
 * 具体处理者
 */
public class ApproveHandlerOne implements ApproveHandler{

    @Override
    public void handleRequest() {
        System.out.println("处理第一个请求!");
    }

}
