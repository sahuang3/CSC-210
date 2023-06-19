/*
 *  Assignment 5
 *  Description: A program that takes an array with the user's inputs and finds the average, smallest number, and the sum of the array.
 */

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] userInput = new int[5]; // Declaring and Initializing an Array
        double[] userInput2 = new double[5]; // // A copy int array but in double, so it can be used for sumOfAllElement
        System.out.println("Please input 5 numbers");
        for (int i=0; i < 5; i++){ // To make sure that the user inputs 5 numbers
            userInput[i] = input.nextInt(); // Adding the user's input to array
            userInput2[i] = userInput[i]; // A copy of the int array
        }
        System.out.println("The average is " + average(userInput));
        System.out.println("The smallest element in array is " + smallestNumber(userInput));
        System.out.println("The sum is " + sumOfAllElements(userInput2));
    }
    public static int average(int[] array){
        int sum = 0; // Declaring int sum variable
        for (int i=0; i < array.length; i++){ // Using for loop to find the sum in array
            sum += array[i];
        }
        sum = sum/ array.length;
        return sum;
    }

    public static double average(double[] array){
        double sum = 0; // Declaring double sum variable
        for (int i=0; i < array.length; i++){ // Using for loop to find the sum in array
            sum +=array[i];
        }
        sum= sum/ array.length;
        return sum;
    }
    public static int smallestNumber(int[] array){
        int min = array[0]; // Setting the 1st number as lowest number
        for (int i=0; i< array.length; i++){ // Using for loop to change the min value as it goes through list
            if (array[i]< min)
                min = array[i];
        }
        return min;
    }
    public static double sumOfAllElements(double[] array){
        int sum = 0; // Declaring double sum variable
        for (int i=0; i < array.length; i++){ // Using for loop to find the sum in array
            sum +=array[i];
        }
        return sum;
    }
}
