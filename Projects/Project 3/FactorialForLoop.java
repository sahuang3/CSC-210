/*
 *  Assignment 3
 *  Description: A program that uses the "for" and "while" loop to find the factorial given a specific number.
 */

import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declaring the variables "factorial"
        int fact = 1;
        // The user inputs a number
        System.out.println("Please insert a number to find the factorial");
        int number = input.nextInt();
        // Input must be between 1 to 12
        if (number >= 1 && number <= 12) {
            //Using "For" loop to calculate the factorial with the given number
             for (int i=1 ; i<=number;i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of " + number + " is " + fact);
        } else {
            System.out.println("Wrong input. Number must be between 1 to 12");
        }
    }
}
