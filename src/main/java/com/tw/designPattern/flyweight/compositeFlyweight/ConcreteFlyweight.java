package com.tw.designPattern.flyweight.compositeFlyweight;

/**
 * 单纯享元对象(具体享元角色)
 */
public class ConcreteFlyweight implements Flyweight{

    private Character intrinsicState;

    public ConcreteFlyweight(Character intrinsicState){
        this.intrinsicState = intrinsicState;
    }


    /**
     * 外蕴状态作为参数传入方法中，改变方法行为
     * 但是并不改变方法的内蕴状态
     * @param state
     */
    @Override
    public void operation(String state) {
        System.out.println("内部状态 Intrinsic State = " + this.intrinsicState);
        System.out.println("外部状态 Extrinsic State = " + state);
    }
}
