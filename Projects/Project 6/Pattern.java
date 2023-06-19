/*
 *  Assignment 6
 *  Description: This program creates a matrix based on the user's input for the size and marks the given position
 *  with the number "1".
 */
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Takes the user's input to create the size of matrix
        System.out.println("Enter the desired amount of rows, columns you want");
        int row = input.nextInt();
        int col = input.nextInt();
        System.out.println("You've entered " +row +" rows");
        System.out.println("You've entered " +col +" columns");

        // Takes the user's input for desired position they want to mark
        System.out.println("Enter the desired position you want to be marked with the number: 1");
        int rowInput = input.nextInt();
        int colInput = input.nextInt();
        System.out.println("You've entered position [" +rowInput + "," +colInput +"]");

        // Declaring and initializing matrix
        int [][] matrix;
        matrix = new int[row][col];

        // Using for loops to create the matrix table
        for (int x = 0; x < matrix.length; x++){
            for (int y = 0; y < matrix[x].length; y++){
                System.out.print(matrix[x][y] + " ");
            }
            // To mark the user input, we assign [x][y] = 1
            matrix[rowInput][colInput] = 1;
            System.out.println();
        }
    }
}
