package com.tw.designPattern.state.order;

public class OrderContext {

    private OrderState payOrderState;

    private OrderState deliverOrderState;

    private OrderState receiveOrderState;

    private OrderState currentState;

    public OrderContext(){
        currentState = new PayOrderState(this);
    }
}
