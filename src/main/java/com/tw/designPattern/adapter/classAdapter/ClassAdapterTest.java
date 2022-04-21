package com.tw.designPattern.adapter.classAdapter;

public class ClassAdapterTest {

    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
