package com.fju;

public class SilverCustomer extends Customer {
    int thesis;
    public SilverCustomer(String id, int amount) {
        super(id, amount);
        this.thesis = thesis;
    }
    @Override
    public void print() {
        float offMoney = (amount/1000)*off*1000;
        System.out.println(id + "\t" + amount + "\t" + (amount-offMoney) + "\t" + "(" + offMoney + ")");
    }
}
