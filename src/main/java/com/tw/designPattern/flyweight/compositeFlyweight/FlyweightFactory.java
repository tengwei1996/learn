package com.tw.designPattern.flyweight.compositeFlyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 复合享元对象
 * 定义：
 *  这种享元模式中的有些享元对象是由一些单纯享元对象组合而成的，它们就是复合享元对象。虽然复合享元对象本身不能共享，但它们可以分解成单纯享元对象再被共享。
 * 结构：
 *  抽象享元角色(Flyweight)：给出一个抽象接口，以规定出所有具体享元角色所需要实现的方法。
 *  具体享元角色(ConcreteFlyweight)：实现抽象享元角色所规定的借口。如果有内蕴状态的话，必须负责为内蕴状态提供存储空间。
 *  复合享元角色(ConcreteCompositeFlyweight)：复合享元角色所代表的对象是不可以共享的，但是一个复合享元对象可以分解成为多个本身是单纯享元对象的组合。复合享元对象又称作不可共享的享元对象。
 *  享元工厂角色(FlyweightFactory)：本角色需要负责创建和管理角色。本角色必须保证享元对象可以被系统适当的共享。当一个客户端对象调用一个享元对象的时候，享元工厂角色会检查系统中是否已经有一个符合要求的享元对象。
 *  如果已经存在，则享元工厂角色就应当提供这个已有的享元对象；如果系统中没有一个适当的享元对象的话，则享元工厂角色就应当创建一个合适的享元对象。
 */
public class FlyweightFactory {

    private Map<Character, Flyweight> flyweightMap = new HashMap<>();

    /**
     * 复合享元工厂方法
     * @param compositeStateList
     * @return
     */
    public Flyweight factory(List<Character> compositeStateList){
        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();
        for (Character state : compositeStateList){
            concreteCompositeFlyweight.add(state,this.factory(state));
        }
        return concreteCompositeFlyweight;
    }

    /**
     * 单纯享元工厂方法
     * @param state
     * @return
     */
    public Flyweight factory(Character state){
        // 先从已有缓存中查询对象是否存在
        Flyweight flyweight = flyweightMap.get(state);
        if (flyweight == null){
            // 如果对象不存在，则重新创建一个新的Flyweight对象
            flyweight = new ConcreteFlyweight(state);
            // 将新生成的对象放入到缓存中
            flyweightMap.put(state,flyweight);
        }
        return flyweight;
    }
}
