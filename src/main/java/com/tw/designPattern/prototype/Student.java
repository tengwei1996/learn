package com.tw.designPattern.prototype;

/**
 * 原型模式
 * 定义：
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 * 优点：
 * Java自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
 * 可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，
 * 简化了创建对象的过程，以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。
 * 缺点：
 * 需要为每一个类都配置一个 clone 方法。
 * clone 方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
 * 当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，
 * 每一层对象对应的类都必须支持深克隆，实现起来会比较麻烦。因此，深克隆、浅克隆需要运用得当。
 * 结构：
 * 抽象原型类：规定了具体原型对象必须实现的接口。
 * 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 * 访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 * 实现：
 * 原型模式的克隆分为浅克隆和深克隆。
 * 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 * 应用场景：
 * 对象之间相同或相似，即只是个别的几个属性不同的时候。
 * 创建对象成本较大，例如初始化时间长，占用CPU太多，或者占用网络资源太多等，需要优化资源。
 * 创建一个对象需要繁琐的数据准备或访问权限等，需要提高性能或者提高安全性。
 * 系统中大量使用该类对象，且各个调用者都需要给它的属性重新赋值。
 * 注：
 * Java 中的 Object 类提供了浅克隆的 clone() 方法，具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆，
 * 这里的 Cloneable 接口就是抽象原型类。
 */
public class Student implements Cloneable {

    private String name;

    private Book book;

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.setBook((Book) student.getBook().clone());
        return student;
    }

}
