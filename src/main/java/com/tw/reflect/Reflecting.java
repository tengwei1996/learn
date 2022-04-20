package com.tw.reflect;

import java.lang.reflect.Method;

public class Reflecting {

    private String propertyOne;

    private String propertyTwo;

    public Integer propertyThree;

    public Reflecting(){}

    private Reflecting(String propertyOne,String propertyTwo){
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
    }

    public Reflecting(String propertyOne,String propertyTwo,Integer propertyThree){
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    public String getPropertyOne() {
        return propertyOne;
    }

    private String getPropertyTwo() {
        return propertyTwo;
    }

    public Integer getPropertyThree() {
        return propertyThree;
    }

    private void setPropertyOne(String propertyOne) {
        this.propertyOne = propertyOne;
    }

    public void setPropertyTwo(String propertyTwo) {
        this.propertyTwo = propertyTwo;
    }

    public void setPropertyThree(Integer propertyThree) {
        this.propertyThree = propertyThree;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<Reflecting> clazz = Reflecting.class;
        Method getPropertyOne = clazz.getDeclaredMethod("getPropertyOne", null);
        System.out.println("getPropertyOne:" + getPropertyOne);
        Method getPropertyTwo = clazz.getDeclaredMethod("getPropertyTwo", null);
        System.out.println("getPropertyTwo:" + getPropertyTwo);
    }

}
