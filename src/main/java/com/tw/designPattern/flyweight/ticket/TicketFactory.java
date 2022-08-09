package com.tw.designPattern.flyweight.ticket;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class TicketFactory {

    public static Map<String,Ticket> ticketMap = new HashMap<>();

    public static Ticket getTicket(String from,String to){
        String key = from + "-->" + to;
        if (ticketMap.containsKey(key)){
            System.out.println("从享元池中获取对象");
            return ticketMap.get(key);
        }
        System.out.println("没有从享元池中获取对象");
        Ticket ticket = new ConcreteTicket(from, to);
        ticketMap.put(key,ticket);
        return ticket;
    }
}
