package com.tw.designPattern.adapter.classAdapter;

public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void request() {
        specificRequest();
    }
}
