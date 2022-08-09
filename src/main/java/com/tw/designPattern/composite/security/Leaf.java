package com.tw.designPattern.composite.security;

/**
 * 树叶节点
 */
public class Leaf implements Component {

    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问了！");
    }
}
