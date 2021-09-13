/*
 *  UCF COP3330 Fall 2021 Assignment 1.12 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the principal: "); //Asking for user input
        double P = x.nextDouble(); //Storing user input
        System.out.print("Enter the rate of interest: ");
        double rate = x.nextDouble();
        System.out.print("Enter the number of years: "); //Asking for user input
        double year = x.nextDouble(); //Storing user input

        double int_rate = rate/100;
        double total = P* (1+(int_rate*year));

        double roundedtotal = Math.round(total * 100)/100.0; //rounding to the nearest penny
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //Formats into currency
        DecimalFormat nodec = new DecimalFormat("#0"); //Takes 0's after double

        System.out.println("After " +nodec.format(year)+ " years at " +rate+ "%, the investment will be worth " +currency.format(roundedtotal)+ ".");
    }
}