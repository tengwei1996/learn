package com.tw.designPattern.adapter.classAdapter;

/**
 * 适配者（真正访问的接口/类）
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("适配者中的代码被调用！");
    }
}
