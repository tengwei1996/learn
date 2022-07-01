package com.tw.designPattern.chainOfResponsibility.approve;

public class ApproveHandlerThree implements ApproveHandler{
    @Override
    public void handleRequest() {
        System.out.println("处理第三个请求！处理完成！");
    }
}
