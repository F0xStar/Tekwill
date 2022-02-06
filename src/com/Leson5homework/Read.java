package com.Leson5homework;

import java.util.Scanner;

public class Read {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to verifies if it's odd or even -> ");
        int input = sc.nextInt();
        if (input % 2 == 0) System.out.println("Inputted number is even!");
        else  System.out.println("Inputted number is odd!");
    }
}
