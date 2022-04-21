package com.tw.designPattern.adapter.objectAdapter.twoWayAdapter;

public class TwoWayAdapterTest {

    public static void main(String[] args) {
        TwoWayAdaptee adaptee = new AdapteeRealize();
        TwoWayAdapter twoWayTarget = new TwoWayAdapter(adaptee);
        System.out.println("目标通过双向适配器访问适配者！");
        twoWayTarget.request();
        TwoWayTarget target = new TargetRealize();
        TwoWayAdapter twoWayAdaptee = new TwoWayAdapter(target);
        System.out.println("适配者通过双向适配器访问目标！");
        twoWayAdaptee.specificRequest();
    }
}
