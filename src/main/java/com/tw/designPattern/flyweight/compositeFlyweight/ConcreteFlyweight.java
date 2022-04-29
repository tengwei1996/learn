package com.tw.designPattern.flyweight.compositeFlyweight;

public class ConcreteFlyweight implements Flyweight{

    private Character intrinsicState = null;

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
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
