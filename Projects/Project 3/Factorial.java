/*
 *  Assignment 3
 *  Description: A program that uses the "for" and "while" loop to find the factorial given a specific number.
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declaring the variables "i" and "factorial"
        int i = 1, fact = 1;
        // The user inputs a number
        System.out.println("Please insert a number to find the factorial");
        int number = input.nextInt();
        // Input must be between 1 to 12
        if (number >= 1 && number <= 12) {
            //Using "While" loop to calculate the factorial with the given number
            while (i <= number) {
                fact = fact * i;
                i++;
            }
            System.out.println("The factorial of " + number + " is " + fact);
        } else {
            System.out.println("Wrong input. Number must be between 1 to 12");
        }
    }
}
