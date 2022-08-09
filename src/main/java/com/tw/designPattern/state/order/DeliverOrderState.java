package com.tw.designPattern.state.order;

/**
 * 订单已发货 具体状态角色
 */
public class DeliverOrderState extends OrderState{

    public DeliverOrderState(OrderContext context) {
        super(context);
    }

    @Override
    public void payOrder() {
        System.out.println("商品已付款，请勿重复付款！");
    }

    @Override
    public void deliverGoods() {
        this.context.setState(new ReceiveGoodsState(this.context));
        System.out.println("商品已发货！请注意查收！");
    }

    @Override
    public void receiveGoods() {
        System.out.println("商品未查收，请耐心等待！");
    }
}
