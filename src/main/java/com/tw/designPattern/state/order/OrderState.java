package com.tw.designPattern.state.order;

public abstract class OrderState {

    protected OrderContext context;

    public OrderState(OrderContext context){
        this.context = context;
    }

    public abstract void payOrder();

    public abstract void deliverGoods();

    public abstract void receiveGoods();
}
