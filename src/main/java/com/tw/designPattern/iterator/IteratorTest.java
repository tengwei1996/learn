package com.tw.designPattern.iterator;

import java.io.*;

public class IteratorTest implements Serializable{


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("第一个");
        aggregate.add("第二个");
        aggregate.add("第三个");
        aggregate.add("第四个");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next.toString() + "\t");
        }
        Object first = iterator.first();
        System.out.println("\nFirst:" + first.toString());


    }


    public void prototype() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        IteratorTest o = (IteratorTest)ois.readObject();
        System.out.println(o);
        ois.close();
        bis.close();
        oos.close();
        bos.close();
    }
}
