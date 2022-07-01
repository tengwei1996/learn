package com.tw.designPattern.prototype;

import java.io.*;

public class CarPrototypeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Engine engine = new Engine();
        engine.setModelNum("B123123");
        engine.setPower("5.2T");
        Car car = new Car();
        car.setEngine(engine);
        car.setCarBody("宝马车身");
        car.setWheels("宝马车轮");
        System.out.println(car);

        // 创建字节输出流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        // 用对象输出流包装字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        // 将对象读到字节输出流中
        oos.writeObject(car);
        // 创建字节输入流，关联字节输出流bos中
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        // 对象输入流包装对象输入流
        ObjectInputStream ois = new ObjectInputStream(bis);
        Car cloneCar = (Car) ois.readObject();
        System.out.println(cloneCar);
        System.out.println(car.getEngine() == cloneCar.getEngine());
        ois.close();
        bis.close();
        oos.close();
        bos.close();
    }
}
