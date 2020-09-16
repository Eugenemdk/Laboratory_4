package com.company;
import multiplication.Multiplicator;
import division.Divisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter first number:");
        number1 = input.nextInt();
        System.out.println("Enter second number:");
        number2 = input.nextInt();

        Multiplicator multiplicator=new Multiplicator(number1,number2);
        Divisor divisor=new Divisor(number1,number2);

        multiplicator.showInfo();

        divisor.showInfo();



    }
}
