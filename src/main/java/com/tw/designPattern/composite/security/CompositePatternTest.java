package com.tw.designPattern.composite.security;

public class CompositePatternTest {

    public static void main(String[] args) {
        Composite c1 = new Composite();
        Composite c2 = new Composite();
        Leaf leaf1 = new Leaf("1");
        Leaf leaf2 = new Leaf("2");
        Leaf leaf3 = new Leaf("3");
        Leaf leaf4 = new Leaf("4");
        Leaf leaf5 = new Leaf("5");
        Leaf leaf6 = new Leaf("6");
        c1.add(leaf1);
        c1.add(leaf2);
        c1.add(leaf3);
        c2.add(leaf4);
        c2.add(leaf5);
        c2.add(leaf6);
        c1.add(c2);
        c1.operation();
    }
}
