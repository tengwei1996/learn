package com.tw.designPattern.flyweight.compositeFlyweight;

import java.util.ArrayList;
import java.util.List;

public class CompositeFlyweightTest {

    /**
     * 运行结果解释：
     *  一个复合享元对象的所有单纯享元对象元素的外蕴状态都是与复合享元对象的外蕴状态相等，也就是上面例子中的Composite1 Call。
     *  一个复合享元对象所含有的单纯享元对象的内蕴状态一般是不想等的，也就是A、B、C。
     *  复合享元对象是不能共享的。也就是说，使用相同的对象compositeState通过享元工厂角色分别两次创建出的对象不是同一个对象。
     *  单纯享元对象是可以共享的。也就是相同的对象state通过享元工厂角色分别多次创建出的对象是同一个对象。
     * @param args
     */
    public static void main(String[] args) {
        List<Character> compositeStateList = new ArrayList<>();
        compositeStateList.add('A');
        compositeStateList.add('B');
        compositeStateList.add('C');
        compositeStateList.add('B');
        compositeStateList.add('A');

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight compositeFlyweight1 = flyweightFactory.factory(compositeStateList);
        Flyweight compositeFlyweight2 = flyweightFactory.factory(compositeStateList);
        compositeFlyweight1.operation("compositeFlyweight1 Call");
        compositeFlyweight1.operation("compositeFlyweight2 Call");
        System.out.println("------------------------------------------");
        System.out.println("复合享元对象是否可以共享对象：" + (compositeFlyweight1 == compositeFlyweight2));
        System.out.println(compositeFlyweight1);
        System.out.println(compositeFlyweight2);

        Character state = 'A';
        Flyweight flyweight1 = flyweightFactory.factory(state);
        Flyweight flyweight2 = flyweightFactory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (flyweight1 == flyweight2));
    }
}
