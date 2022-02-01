package com.Leson4homework;

public class TaxCalulator {
    public static void main(String[] args) {
        double price = 7.45;
        double tax = 25.7;
        int quantity = 12;
        double total = 0;

        total = price * quantity * tax;

        System.out.println("Total cost with tax is: " + total);
    }
}
