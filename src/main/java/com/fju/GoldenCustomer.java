package com.fju;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer (String id, int amount) {
        super(id, amount);
        off = 0.2f;
    }
    @Override
    public void print() {
        float offMoney = (amount/1000)*off*1000;
        System.out.println(id + "\t" + amount + "\t" + (amount-offMoney) + "\t" + "(" + offMoney + ")");
    }
}
