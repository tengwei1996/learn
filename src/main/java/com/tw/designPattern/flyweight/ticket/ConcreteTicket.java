package com.tw.designPattern.flyweight.ticket;

public class ConcreteTicket implements Ticket {

    private String from;

    private String to;

    private String seat;


    public ConcreteTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void info() {
        System.out.println(this.from + "-->" + this.to + this.seat + "价格：" + this.getPrice(this.seat));
    }

    public Integer getPrice(String seat) {
        Integer price;
        switch (seat) {
            case "硬座":
                price = 100;
                break;
            case "商务座":
                price = 150;
                break;
            default:
                price = 50;
        }
        return price;
    }

    @Override
    public void setSeat(String seat) {
        this.seat = seat;
    }
}
