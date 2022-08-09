package com.tw.designPattern.state.order;

/**
 * 订单已付款 具体状态角色
 */
public class PayOrderState extends OrderState{

    public PayOrderState(OrderContext context) {
        super(context);
    }

    @Override
    public void payOrder() {
        System.out.println("付款成功，商品即将出库发货！");
        this.context.setState(new DeliverOrderState(this.context));
    }

    @Override
    public void deliverGoods() {
        System.out.println("商品未付款，不能发货！");
    }

    @Override
    public void receiveGoods() {
        System.out.println("已收到商品，订单结束，记得好评哟！");
    }
}
