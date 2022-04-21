package com.fju.ticket;

public class StudentTicket extends Ticket {
    float off = 0.1f;
    public StudentTicket(Station start, Station end) {
        super(start, end);
        price = price - (int)(price*off);
    }
}
