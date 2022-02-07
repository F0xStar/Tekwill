package com.Leson6homework;

import java.util.Scanner;

public class Porridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the right temperature for porridge -> ");
        int temperature = sc.nextInt();
        double minTemp = 15;
        double maxTemp = 35;
        if (temperature >= minTemp && temperature <= maxTemp)
            System.out.println("Porridge is just right");
        else if (temperature < minTemp)
            System.out.println("The porridge is cold");
        else
            System.out.println("Porridge temperature is too high");
    }
}

