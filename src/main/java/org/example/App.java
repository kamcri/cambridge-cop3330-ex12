/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle: ");
        float principle = sc.nextFloat();
        System.out.println("Enter rate of interest(%): ");
        float rate = sc.nextFloat();
        float newRate = rate / 100;
        System.out.println("Enter the number of years: ");
        float years = sc.nextFloat();

        sc.close();

        float interest = principle * (1 + (newRate*years));
        System.out.printf("After %.1f years at %.2f%% the investment will be worth $%.2f.", years, rate, interest);
    }
}
