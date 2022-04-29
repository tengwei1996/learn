package com.tw.designPattern.composite.security;

public class ArticlesTest {

    public static void main(String[] args) {
        float totalPrice = 0;
        Bag bigBag, mediumBag, smallRedBag, smallWhiteBag;
        Goods goods;
        bigBag = new Bag("大袋子");
        mediumBag = new Bag("中袋子");
        smallRedBag = new Bag("红色小袋子");
        smallWhiteBag = new Bag("白色小袋子");
        goods = new Goods("婺源特产", 2, 7.9f);
        smallRedBag.add(goods);
        goods = new Goods("婺源地图",1,9.9f);
        smallRedBag.add(goods);
        goods = new Goods("韶关香菇",2,68f);
        smallWhiteBag.add(goods);
        goods = new Goods("韶关红茶",3,180f);
        smallWhiteBag.add(goods);
        goods = new Goods("景德镇瓷器",1,380f);
        mediumBag.add(goods);
        mediumBag.add(smallRedBag);
        goods = new Goods("李宁牌运动鞋",1,198f);
        bigBag.add(goods);
        bigBag.add(smallWhiteBag);
        bigBag.add(mediumBag);
        System.out.println("您选购的商品有：");
        bigBag.show();
        totalPrice = bigBag.calculation();
        System.out.println("要支付的总价是：" + totalPrice + "元");
    }
}
