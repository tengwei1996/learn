package com.tw.designPattern.prototype;

public class PrototypeModelTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book();
        book1.setName("Java编程思想");
        book1.setPrice(100);
        Book book2 = (Book) book1.clone();
        book2.setName("Java编程思想4");
        book2.setPrice(150);
        System.out.println("book1: " + book1.getName() + book1.getPrice());
        System.out.println("book2: " + book2.getName() + book2.getPrice());
        System.out.println(book1 == book2);
        System.out.println("--------------------------------深克隆---------------------------");
        Student student1 = new Student();
        student1.setName("一一");
        student1.setBook(book1);
        Student student2 = (Student) student1.clone();
        student2.setName("一二");
        System.out.println("student1: " + student1.getName() + " " + student1.getBook());
        System.out.println("student2: " + student2.getName() + " " + student2.getBook());

    }
}
