package com.tw.designPattern.singleton.lazy.innerClass;

import java.io.Serializable;

/**
 * 内部类单例模式
 */
public class LazySingletonInstance implements Serializable {


    /**
     * 防止反射攻击
     * 如果不加非空判断
     * 测试代码
     *    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
     *
     *         LazySingletonInstance instance1 = LazySingletonInstance.getInstance();
     *
     *         Constructor<LazySingletonInstance> constructor = LazySingletonInstance.class.getDeclaredConstructor(null);
     *
     *         // 使用setAccessible(true)关闭jdk安全检查提升反射效率
     *         constructor.setAccessible(true);
     *
     *         LazySingletonInstance instance2 = constructor.newInstance();
     *
     *         System.out.println(instance1 == instance2);//结果为false
     *
     *     }
     *
     *     如果加了在构造器中加入非空判断会抛错 Caused by: java.lang.RuntimeException: 禁止构造多个实例
     */
    private LazySingletonInstance(){
        if (null != InnerClassSingletonInstance.instance){
            throw new RuntimeException("禁止构造多个实例");
        }
    }

    /**
     * 防止序列化攻击
     * 如果不加readResolve()方法
     * 测试代码
     *     public static void main(String[] args) throws IOException, ClassNotFoundException {
     *
     *         LazySingletonInstance instance1 = LazySingletonInstance.getInstance();
     *
     *         ByteArrayOutputStream bos = new ByteArrayOutputStream();
     *         // 这里用的是装饰器模式哦
     *         ObjectOutputStream oos = new ObjectOutputStream(bos);
     *         oos.writeObject(LazySingletonInstance.getInstance());
     *
     *         ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
     *         // 这里也是用的装饰器模式哦
     *         ObjectInputStream ois = new ObjectInputStream(bis);
     *         LazySingletonInstance instance2 = (LazySingletonInstance)ois.readObject();
     *         System.out.println(instance1 == instance2);// 结果false
     *     }
     *
     *     如果加了readResolve()方法
     *     System.out.println(instance1 == instance2);// 结果为true
     *     这是因为当我们使用流的方式反序列化，jdk从内存中重新获取到一个新对象的时候，会检查当前类中是否有readResolve()方法，
     *     有的话会放弃序列化产生的对象，直接返回readResolve()方法中指定的对象，也就是说这个过程中会出现两个对象，只不过有一个
     *     在检查readResolve()方法被丢弃了一个，这样才能保证了单例的唯一性，这个过程中对象被实例化两次，这也就带来的资源的消耗，
     *     如果改单例对象被大量调用，将浪费好多内存资源，所以用这种方式要结合实际场景，我基本上不用吧，就为了学习才写出来的。
     *
     * @return
     */
    private Object readResolve(){
        return InnerClassSingletonInstance.instance;
    }

    /**
     * 获取实例
     * @return
     */
    public static LazySingletonInstance getInstance(){
        return InnerClassSingletonInstance.instance;
    }


    private static class InnerClassSingletonInstance{

        private static  final LazySingletonInstance instance = new LazySingletonInstance();
    }
}
