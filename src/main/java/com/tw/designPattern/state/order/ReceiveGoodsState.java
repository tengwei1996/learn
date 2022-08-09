package com.tw.designPattern.state.order;

/**
 * 订单已签收 具体状态角色
 */
public class ReceiveGoodsState extends OrderState{

    public ReceiveGoodsState(OrderContext context) {
        super(context);
    }

    @Override
    public void payOrder() {
        System.out.println("商品已付款，请勿重复付款！");
    }

    @Override
    public void deliverGoods() {
        System.out.println("商品已发货，请勿重复发货！");
    }

    @Override
    public void receiveGoods() {
        System.out.println("商品已查收，好评！");
    }
}
