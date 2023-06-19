import java.util.Scanner;
public class TicTacToe {
    // take a multi-dimensional array
    // datatype - character (char)
    char[][] board = new char[3][3]; // a 3x3 board, state of the class
    int move_number= 1;

    public static void main(String[] args) {
        // main method
        TicTacToe tc = new TicTacToe(); /* Create an object of TicTacToe class, so only "tc" have access to the methods of that class. (The methods can only be
        used inside of the given class)
        */
        Scanner sc = new Scanner(System.in);
        tc.initialize(); // Call Initialize method
        tc.display(); // Call Display method
        while(true) {
            System.out.println("Enter: 1. Continue Game, 2. Restart Game, 3. Exit Game");
            int user_input = sc.nextInt();
            switch (user_input) { // Switch Case, much better than having multiple if else loops
                case 1:
                    tc.playMove();
                    tc.checkWinner();
                    tc.display();
                    break;
                case 2:
                    tc.initialize();
                    tc.display();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Wrong input! Exit");
                    return;
            }
        }
    }

    // Methods
    // Display method - helps to display the board
    void display() {
        for (int i = 0; i < board.length; i++) { // For rows
            for (int j = 0; j < board[0].length; j++) { // For columns
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Initialize
    void initialize() {
        for (int i = 0; i < board.length; i++) { // For rows
            for (int j = 0; j < board[0].length; j++) { // For columns
                board[i][j] = '_'; // Chars will use ' ' instead of " "
            }
        }
    }

    // Take moves ---> take positions
    void playMove(){
        Scanner sc = new Scanner(System.in);
        if(move_number%2 !=0){ // Check if the move is odd or even
            System.out.println("Enter the position for X : row, column");
            int i = sc.nextInt(); // For row
            int j = sc.nextInt(); // For column
            board [i][j] = 'X';
        } else {
            System.out.println("Enter the position for 0 : row, column");
            int i = sc.nextInt(); // For row
            int j = sc.nextInt(); // For column
            board [i][j] = '0';
        }
        move_number++;
    }

    // Check if you win, need 3 check methods: checkRow, checkColumn, checkDiagonal. Need checkWinner method, to see if any of those methods are true
    boolean checkRow() { // Check if there are rows of 'X' or '0'
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                return true;
            } else if (board[i][0] == '0' && board[i][1] == '0' && board[i][2] == '0') {
                return true;
            }
        }
        return false;
    }

    boolean checkColumn() { // Check if there are columns of 'X' or '0'
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
                return true;
            } else if (board[0][i] == '0' && board[1][i] == '0' && board[2][i] == '0') {
                return true;
            }
        }
        return false;
    }

    boolean checkDiagonal() { // Check if there are rows of 'X' or '0'
        for (int i = 0; i < 3; i++) {
            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                return true;
            } else if (board[0][0] == '0' && board[1][1] == '0' && board[2][2] == '0') {
                return true;
            } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                return true;
            } else if (board[0][2] == '0' && board[1][1] == '0' && board[2][0] == '0') {
                return true;
            }
        }
        return false;
    }

    void checkWinner(){
        if(checkRow() || checkColumn() || checkDiagonal()){
            display();
            System.out.println("Winner Found! Game is over! Restarting...");
            initialize();
        }
    }
}