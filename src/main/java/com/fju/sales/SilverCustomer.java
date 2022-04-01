package com.fju.sales;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public void print() {
        float money = amount-getOffMoney();
        System.out.println(id + "\t" + amount + "\t" + money + "\t" + "(" + getOffMoney() + ")");
    }
}
