package com.tw.designPattern.chainOfResponsibility.approve;

public class ApproveHandlerOne implements ApproveHandler{
    @Override
    public void handleRequest() {
        System.out.println("处理第一个请求!");
    }
}
