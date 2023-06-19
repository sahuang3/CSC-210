/*
 *  Assignment 2
 *  Description: A cash register simulation that calculates the price of cheesecakes in bulk.
 *  Name: Samson Huang
 *  ID: 920216528
 *  Class: CSC 210-08
 *  Semester: Spring 2021
 */

import java.util.Scanner;

public class CashRegister {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        /* Declaring the variables, User's name, price of cheesecake, and # of packages (in whole #s) of cheesecakes
        they want to buy
         */
        String userName;
        double price =28.6;
        int numOfPack;

        //  The user types their name in
        System.out.println("Greetings. Please enter your name: ");
        userName = input.next();

        // The user types how many packages of cheesecake they want to buy
        System.out.println("1 Cheesecake = $28.60");
        System.out.print("\nEnter bulks of cheesecake to purchase: ");
        numOfPack= input.nextInt();

        //  The total price before tax
        double preTaxTotal = price * numOfPack * 23;
        System.out.println("Pre-Tax Total: " + preTaxTotal);

        // The total price after tax
        double normalTax = preTaxTotal * 0.1575;
        System.out.println("Normal Tax: " + normalTax);

        // The total price after special tax
        double specialTax = (normalTax / 3.32) +3.91;
        System.out.println("Special Tax: " + specialTax);

        //The final price of the cheesecakes
        double finalTotal = preTaxTotal + specialTax;
        System.out.println("Final Tax: " + finalTotal);

        System.out.println("\nThank you " + userName + " for purchasing " + numOfPack + " bulks of cheesecake");

    }
}

