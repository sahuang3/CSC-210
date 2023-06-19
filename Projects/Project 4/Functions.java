/*
 *  Assignment 4
 *  Description: A program that adds the factorial of odd numbers and cubes the even numbers.
 */

import java.util.Scanner;
public class Functions {
    public static int fact(int a) { // The Factorial Method
        int fact = 1;
        for (int i = 1; i <= a; i++) { // For loop for the factorial
            fact = fact * i; // Factorial equation
        }
        return fact; // Return # as 'fact'
    }

    public static int findSum(int a) { // The method for Cubing and adding the Sum of Factorial
        int result = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) { // Check if it's Even Number - Gets Cubed
                result += i * i * i; // Equation where 'i' gets cubed
            } else { // Check if it's Odd Number - Goes to Factorial Method
                result += fact(i); // Sum of the even results with the odd factorials
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // User inputs a #
        int num = 1; // To have the Do-While loop process once
        do {
            System.out.print("Please input a number: ");
            num = input.nextInt();
            if (num < 0 || num >= 14) { // Condition for having the program 'terminate' when num<0 and num>=14
                System.out.println("Terminating the program!");
            } else {
                int result = findSum(num); // Calls the method
                System.out.println(result); // Prints the result after methods have completed
            }
        } while (num >= 0 || num <= 14); // Condition to keep the program asking for inputs
    }
}

