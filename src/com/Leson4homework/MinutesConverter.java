package com.Leson4homework;

public class MinutesConverter {
    public static void main(String[] args) {
        long minutes = 525_600;
        double days = 0;
        double years = 0;

        int our = 60;
        int day = 24;
        int year = 365;

        days = (double) minutes / our / day;
        years = days / year;
        System.out.println(minutes + " minutes will be " + days + " days");
        System.out.println(minutes + " minutes will be " + years + " years");
    }
}
