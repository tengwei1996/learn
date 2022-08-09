package com.tw.designPattern.chainOfResponsibility.approve;

/**
 * 具体处理者
 */
public class ApproveHandlerThree implements ApproveHandler{

    @Override
    public void handleRequest() {
        System.out.println("处理第三个请求！处理完成！");
    }
}
