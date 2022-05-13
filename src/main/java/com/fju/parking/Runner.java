package com.fju.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "11:05";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = null;
        try {
            d = sdf.parse(enterTime);
            System.out.println(d);
            System.out.println(d.getTime());
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
        //long ms = 3*60*60*1000;
        Date d2 = null;
        try {
            d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
        //d2.setTime(d.getTime()+ms);
        int mins = (int)((d2.getTime()- d.getTime())/1000/60);
        System.out.println(mins);
        int fee = 30*(mins/60);
        System.out.println("fee: " + fee);
        //3:14 => NTD$90, 3:15 => NTD$120
        //3:15-3:30 => NTD$105

    }
}
