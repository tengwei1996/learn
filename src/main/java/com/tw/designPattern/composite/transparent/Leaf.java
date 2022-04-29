package com.tw.designPattern.composite.transparent;

public class Leaf implements Component{

    String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int index) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问了！");
    }
}
