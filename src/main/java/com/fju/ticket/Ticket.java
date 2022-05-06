package com.fju.ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 400;

    Station start;
    Station end;
    int price;
    public Ticket(Station start, Station end) {
        this.start = start;
        this.end = end;
        int diff = Math.abs(start.id - end.id);
        //System.out.println("diff: " + diff);
        switch (diff) {
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }
//        if (diff == 100) {
//            price = 500;
//        } else if (diff == 200) {
//            price = 600;
//        } else if (diff == 300) {
//            price = 1100;
//        }
    }
    public void print() {
        System.out.println(start.name + " to " + end.name + "\t" + price);
    }
}
