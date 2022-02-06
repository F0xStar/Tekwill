package com.Leson5homework;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the width for the first rectangle and pres enter -> ");
        double r1Width = sc.nextDouble();
        System.out.print("Please enter the length for the first rectangle and pres enter -> ");
        double r1Length = sc.nextDouble();
        System.out.print("Please enter the width for the second rectangle and pres enter -> ");
        double r2Width = sc.nextDouble();
        System.out.print("Please enter the length for the second rectangle and pres enter -> ");
        double r2Length = sc.nextDouble();
        double aria1R = r1Width * r1Length;
        double aria2R = r2Width * r2Length;

        if (aria1R > aria2R) {
            System.out.println("The area of the first rectangle is bigger!");
        } else if (aria1R < aria2R) {
            System.out.println("The area of the second rectangle is bigger!");
        } else {
            System.out.println("The area of the rectangles are equals!");
        }
    }
}
