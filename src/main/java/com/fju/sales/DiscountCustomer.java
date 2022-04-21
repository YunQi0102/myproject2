package com.fju.sales;

public class DiscountCustomer extends Customer {
    public DiscountCustomer(String id, int amount) {
        super(id, amount);
    }
    public float getOffMoney() {
        return amount*off;
    }
}
