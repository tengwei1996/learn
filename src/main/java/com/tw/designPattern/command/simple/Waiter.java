package com.tw.designPattern.command.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员 调用者/请求者
 */
public class Waiter {

    List<Breakfast> breakfastList = new ArrayList<>();

    public Waiter(List<Breakfast> breakfastList){
        this.breakfastList = breakfastList;
    }

    /**
     * 早餐只吃一样
     * @param breakfast
     */
    public void eatBreakfast(Breakfast breakfast){
        breakfast.cook();
    }

    /**
     * 早餐吃好多个的(相当于命令宏)
     */
    public void earMoreBreakfast(){
        this.breakfastList.stream().forEach(breakfast -> {
            breakfast.cook();
        });
    }

}
