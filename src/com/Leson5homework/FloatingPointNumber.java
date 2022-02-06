package com.Leson5homework;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value -> ");
        double value = sc.nextDouble();

        String message = "The value is ";
        if (value == 0) {
            System.out.println(message + "zero");
        } else if (value > 0) {
            message += "positive ";
            if (Math.abs(value) < 1) {
                System.out.println(message + "small");
            } else if (Math.abs(value) > 1_000_000) {
                System.out.println(message + "large");
            } else {
                System.out.println(message);
            }
        } else {
            message += "negative ";
            if (Math.abs(value) < 1) {
                System.out.println(message + "small");
            } else if (Math.abs(value) > 1_000_000) {
                System.out.println(message + "large");
            } else {
                System.out.println(message);
            }
        }
    }
}