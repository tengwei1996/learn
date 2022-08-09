package com.tw.designPattern.flyweight.ticket;

/**
 * 抽象享元角色
 */
public interface Ticket {

    /**
     * 车票信息
     */
    void info();


    /**
     * 设置座位，
     * 座位(seat) 就是非享元角色
     * @param seat
     */
    void setSeat(String seat);
}
