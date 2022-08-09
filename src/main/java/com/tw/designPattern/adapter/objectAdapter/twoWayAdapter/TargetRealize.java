package com.tw.designPattern.adapter.objectAdapter.twoWayAdapter;

/**
 * 目标实现(Target)
 */
public class TargetRealize implements TwoWayTarget{

    @Override
    public void request() {
        System.out.println("目标代码被调用！");
    }
}
