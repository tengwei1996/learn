package com.tw.designPattern.state.order;

public class OrderTest {

    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        orderContext.payOrder();
        orderContext.deliverGoods();
        orderContext.receiveGoods();
    }
}
