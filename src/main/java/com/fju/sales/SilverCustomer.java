package com.fju.sales;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    public void print() {
        float money = amount-getOffMoney();
        if (amount < 1000) {
            System.out.println(id + " \t " + amount + " \t " + money + " \t " + "(" + (int)getOffMoney() + ")");
        } else {
            System.out.println(id + "\t" + amount + "\t" + money + "\t" + "(" + (int)getOffMoney() + ")");
        }
    }
}
