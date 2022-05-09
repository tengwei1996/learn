package com.tw.designPattern.state.sharedState;

import java.util.HashMap;
import java.util.Map;

/**
 * 共享状态模式
 * 定义：
 *  有多个环境对象需要共享一组状态，这时需要引入享元模式，将这些具体状态对象放在集合中供程序共享
 *  共享状态模式的不同之处是在环境类中增加了一个 HashMap 来保存相关状态，当需要某种状态时可以从中获取
 * 扩展：
 *  状态模式与责任链模式的区别
 *   状态模式和责任链模式都能消除 if-else 分支过多的问题。但在某些情况下，状态模式中的状态可以理解为责任，那么在这种情况下，两种模式都可以使用。
 *   从定义来看，状态模式强调的是一个对象内在状态的改变，而责任链模式强调的是外部节点对象间的改变。
 *   从代码实现上来看，两者最大的区别就是状态模式的各个状态对象知道自己要进入的下一个状态对象，而责任链模式并不清楚其下一个节点处理对象，因为链式组装由客户端负责。
 *  状态模式与策略模式的区别
 *   状态模式和策略模式的 UML 类图架构几乎完全一样，但两者的应用场景是不一样的。策略模式的多种算法行为择其一都能满足，彼此之间是独立的，用户可自行更换策略算法，
 *   而状态模式的各个状态间存在相互关系，彼此之间在一定条件下存在自动切换状态的效果，并且用户无法指定状态，只能设置初始状态。
 */

/**
 * 环境类
 */
public class ShareContext {

    private ShareState state;

    private Map<String,ShareState> stateMap = new HashMap<>();

    public ShareContext(){
        state = new ConcreteStateOne();
        stateMap.put("one",state);
        state = new ConcreteStateTwo();
        stateMap.put("two",state);
        stateMap.get("one");
    }

    /**
     * 设置新状态
     * @param state
     */
    public void setState(ShareState state){
        this.state = state;
    }

    /**
     * 读取状态
     * @param key
     * @return
     */
    public ShareState getState(String key){
        ShareState state = stateMap.get(key);
        return state;
    }

    /**
     * 对请求处理
     */
    public void handle(){
        state.handle(this);
    }

}
