package com.tw.designPattern.flyweight.compositeFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元对象
 * 复合享元对象是由单纯享元对象通过复合而成的，因此它提供了add()这样的聚集管理方法。
 * 由于一个复合享元对象具有不同的聚集元素，这些聚集元素在复合享元对象被创建之后加入，
 * 这本身就意味着复合享元对象的状态是会改变的，因此复合享元对象是不能共享的。
 *
 * 复合享元角色实现了抽象享元角色所规定的接口，也就是operation()方法，这个方法有一个参数，
 * 代表复合享元对象的外蕴状态。一个复合享元对象的所有单纯享元对象元素的外蕴状态都是与复合享元对象的外蕴状态相等的；
 * 而一个复合享元对象所包含的所有的单纯享元对象的内蕴状态一般是不相等的，不然就没有了使用的价值。
 */
public class ConcreteCompositeFlyweight implements Flyweight{

    private Map<Character,Flyweight> flyweightMap = new HashMap<>();

    /**
     * 添加一个新的单纯享元对象到集合中
     * @param key
     * @param flyweight
     */
    public void add(Character key,Flyweight flyweight){
        flyweightMap.put(key,flyweight);
    }


    /**
     * 外蕴状态作为参数传递到方法中
     * @param state
     */
    @Override
    public void operation(String state) {
        Flyweight flyweight = null;
        for (Character key : flyweightMap.keySet()){
            flyweight = flyweightMap.get(key);
            flyweight.operation(state);
            System.out.println(flyweight);
        }
    }
}
