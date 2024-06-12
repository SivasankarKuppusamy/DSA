import java.util.Scanner;

public class TicTacToe {
    static boolean boardFilled(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != 'x' && a[i][j] != 'o') return false;
            }
        }
        return true;
    }

    static void print(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " | ");
            }
            System.out.println();
        }
    }

    static boolean gameoverfn(char[][] a, char player) {
        // Check rows
        for (int i = 0; i < a.length; i++) {
            if (a[i][0] == player && a[i][1] == player && a[i][2] == player) return true;
        }
        // Check columns
        for (int j = 0; j < a[0].length; j++) {
            if (a[0][j] == player && a[1][j] == player && a[2][j] == player) return true;
        }
        // Check diagonals
        if (a[0][0] == player && a[1][1] == player && a[2][2] == player) return true;
        if (a[0][2] == player && a[1][1] == player && a[2][0] == player) return true;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        Scanner sc = new Scanner(System.in);
        boolean xTurn = true; // Flag to track player turn

        while (!boardFilled(board)) {
            print(board);
            char currentPlayer = xTurn ? 'x' : 'o'; // Determine current player
            System.out.println("Enter the index to insert " + currentPlayer);
            int i = sc.nextInt();
            int j = sc.nextInt();
            if (board[i][j] != '\0') {
                System.out.println("Cell already occupied. Try again.");
                continue; // Ask for input again if cell is already occupied
            }
            board[i][j] = currentPlayer;

            if (gameoverfn(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins");
                break; // End game if a player wins
            }

            xTurn = !xTurn; // Switch player
        }

        print(board); // Print final board
        if (!gameoverfn(board, 'x') && !gameoverfn(board, 'o')) {
            System.out.println("It's a draw!");
        }
        sc.close();
    }
}
