package com.tw.designPattern.flyweight.ticket;

public class TicketTest {

    public static void main(String[] args) {
        Ticket ticket = TicketFactory.getTicket("苏州", "上海");
        ticket.setSeat("硬座");
        ticket.info();
        Ticket ticket1 = TicketFactory.getTicket("苏州", "杭州");
        ticket1.setSeat("商务座");
        ticket1.info();
        Ticket ticket2 = TicketFactory.getTicket("苏州", "上海");
        ticket2.setSeat("商务座");
        ticket2.info();
    }
}
