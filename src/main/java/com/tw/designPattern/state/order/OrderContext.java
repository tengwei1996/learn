package com.tw.designPattern.state.order;

/**
 * 环境角色
 */
public class OrderContext {

    private OrderState payOrderState;

    private OrderState deliverOrderState;

    private OrderState receiveOrderState;

    private OrderState currentState;

    public OrderContext(){
        payOrderState = new PayOrderState(this);
        deliverOrderState = new DeliverOrderState(this);
        receiveOrderState = new ReceiveGoodsState(this);
        currentState = payOrderState;
    }

    public void setState(OrderState orderState){
        currentState = orderState;
    }

    public void payOrder() {
        currentState.payOrder();
    }

    public void deliverGoods() {
        currentState.deliverGoods();
    }

    public void receiveGoods() {
        currentState.receiveGoods();
    }
}
