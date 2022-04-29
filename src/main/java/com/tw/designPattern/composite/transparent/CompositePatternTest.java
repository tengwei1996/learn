package com.tw.designPattern.composite.transparent;

public class CompositePatternTest {

    public static void main(String[] args) {
        Component c1 = new Composite();
        Component c2 = new Composite();
        Leaf leaf1 = new Leaf("1");
        Leaf leaf2 = new Leaf("2");
        Leaf leaf3 = new Leaf("3");
        c1.add(leaf1);
        c1.add(c2);
        c2.add(leaf2);
        c2.add(leaf3);
        c1.operation();
    }
}
