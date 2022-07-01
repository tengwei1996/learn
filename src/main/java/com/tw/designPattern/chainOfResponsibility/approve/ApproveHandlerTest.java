package com.tw.designPattern.chainOfResponsibility.approve;

public class ApproveHandlerTest {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new ApproveHandlerOne()).addHandler(new ApproveHandlerTwo()).addHandler(new ApproveHandlerThree());
        chain.handleRequest();
    }
}
