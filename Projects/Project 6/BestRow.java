/*
 *  Assignment 6
 *  Description: This program creates a matrix with the user's input and finds which row has the highest sum.
 */

import java.util.Arrays;
import java.util.Scanner;
public class BestRow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Takes the user's input to create the size of matrix
        System.out.println("Enter the desired amount of rows, columns you want");
        int row = input.nextInt();
        int col = input.nextInt();
        System.out.println("You've entered " + row + " rows");
        System.out.println("You've entered " + col + " columns");

        // Declaring and initializing matrix
        int[][] matrix;
        matrix = new int[row][col];

        // Using for loops to collect the User's input of numbers
        System.out.println("Enter numbers you want to input");
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = input.nextInt();
            }
        }
        // Creating a new array to store sum of each row
        int[] sumArray = new int[matrix.length];

        // Using for loop to add the sum of each row
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                sumArray[x] += matrix[x][y];
            }
        }
        System.out.println(Arrays.toString(sumArray));

        // Compare the sum of each row
        int maxSum = sumArray[0];
        int maxRowNum = 0;
        for (int x = 0 ; x < sumArray.length; x++){
            if (sumArray[x]>= sumArray[0]){
                maxSum = sumArray[x];
                maxRowNum = x+1;
            }
        }
        System.out.println("The max sum is " +maxSum +" from row #" +maxRowNum);
    }
}
