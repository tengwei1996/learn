package com.tw.designPattern.singleton;


/**
 * 单例模式
 * 定义：
 *  单例模式指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
 * 优点：
 *  单例模式可以保证内存里只有一个实例，减少内存的开销。
 *  可以避免对资源的多重占用。
 *  单例模式设置全局访问点，可以优化和共享资源的访问。
 * 缺点：
 *  单例模式一般没有接口，扩展困难。如果要扩展，除了修改原来代码，没有第二种途径，违背开闭原则。
 *  在并发测试中，单例模式不利于代码调试。在调试过程中，如果单例中的代码没有执行完，也不能模拟生成一个新的对象。
 * 结构：
 *  单例类：包含一个实例且能自行创建这个实例的类。
 *  访问类：使用单例的类。
 * 应用场景：
 *  需要频繁创建的一些类，使用单例可以降低系统的内存压力，减少GC。
 *  某类只要求生成一个对象的时候，如一个版中的班长、每个人的身份证号等。
 *  某些类创建示例时占用资源较多，或示例耗时较长，且经常使用。
 *  某类需要频繁实例化，而创建的对象又频繁被销毁的时候，如多线程的线程池、网络连接池等。
 *  频繁访问数据库或文件的对象。
 *  对于一些控制硬件级别的操作，或者从系统上来讲应当是单一控制逻辑的操作，如果有多个实例，则系统会完全乱套。
 *  当对象需要被共享的场合。由于单例模式只允许创建一个对象，共享该对象可以节省内存，并加快对象访问速度。如Web中的配置对象、数据库的连接池等。
 *
 *
 */
public class SingletonPattern {
    // 懒汉式
    // 如果编写的是多线程程序，则不要删除上例代码中的关键字 volatile 和 synchronized，
    // 否则将存在线程非安全的问题。如果不删除这两个关键字就能保证线程安全，
    // 但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点
    // 1.初始化实例对象
//    private static volatile SingletonModel instance = null;

    // 2.私有化构造方法
//    private SingletonModel(){}

    // 3.提供公共的静态的方法返回实例
//    public static synchronized SingletonModel getInstance(){
//        if (instance == null){
//            instance = new SingletonModel();
//        }
//        return instance;
//    }


    // ------------------------------------------------------------------
    // 饿汉式
    // 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，
    // 以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
    private static final SingletonPattern instance = new SingletonPattern();

    private SingletonPattern(){}

    public static SingletonPattern getInstance(){
        return instance;
    }
}
