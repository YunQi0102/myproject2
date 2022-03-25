package com.fju.ticket;

public class Ticket {
    Station start;
    Station destination;
    int price;
    public Ticket(int start, int destination) {
        this.start = start;
        this.destination = destination;
    }
    public void print() {
        System.out.println();
    }
}
