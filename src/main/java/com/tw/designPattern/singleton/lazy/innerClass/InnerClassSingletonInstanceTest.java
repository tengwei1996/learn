package com.tw.designPattern.singleton.lazy.innerClass;

import java.io.*;

public class InnerClassSingletonInstanceTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        LazySingletonInstance instance1 = LazySingletonInstance.getInstance();
        LazySingletonInstance instance2 = LazySingletonInstance.getInstance();

        System.out.println(instance1 == instance2);
    }
}
