package com.tw.designPattern.chainOfResponsibility.approve;

public class ApproveHandlerTwo implements ApproveHandler{
    @Override
    public void handleRequest() {
        System.out.println("处理第二个请求!");
    }
}
