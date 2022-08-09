package com.tw.designPattern.state.order;

/**
 * 订单状态 抽象状态角色
 */
public abstract class OrderState {

    protected OrderContext context;

    public OrderState(OrderContext context){
        this.context = context;
    }

    public abstract void payOrder();

    public abstract void deliverGoods();

    public abstract void receiveGoods();
}
