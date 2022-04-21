package com.tw.designPattern.adapter.objectAdapter.twoWayAdapter;

/**
 * 适配者实现
 */
public class AdapteeRealize implements TwoWayAdaptee{

    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}
