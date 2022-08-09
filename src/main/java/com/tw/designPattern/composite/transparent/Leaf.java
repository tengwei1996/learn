package com.tw.designPattern.composite.transparent;

/**
 * 树叶节点
 */
public class Leaf implements Component {

    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException("叶子节点没有添加功能");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("叶子节点没有删除功能");
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
