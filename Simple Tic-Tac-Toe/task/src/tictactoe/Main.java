package tictactoe;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        System.out.println("---------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ' ';
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");

        }
        System.out.println("---------");


    boolean player1 = true;
    boolean gameEnded = false;
        while(!gameEnded)

    {


        char player = ' ';
        if (player1) {
            player = 'X';
        } else {
            player = 'O';
        }

        boolean correctMove = true;
        int row = 0;
        int col = 0;
        while (true) {
            System.out.print("Enter the coordinates: ");
            if (!scanner.hasNextInt()) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            } else {
                row = scanner.nextInt();
                col = scanner.nextInt();
                if (row < 1 || row > 3 || col < 1 || col > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (board[row - 1][col - 1] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    break;
                }

            }
        }

        board[row - 1][col - 1] = player;
        drawBoard(board);
        if (checkForWin(board) == 'X') {
            System.out.println("X wins");
            gameEnded = true;
        } else if (checkForWin(board) == 'O') {
            System.out.println("O wins");
            gameEnded = true;
        } else {
            if (boardIsFull(board)) {
                System.out.println("Draw");
                gameEnded = true;
            } else {
                player1 = !player1;
            }
        }

    }

    }

    public static void drawBoard(char[][] board){
            System.out.println("---------");
            for (int i = 0; i < board.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println("|");

            }
            System.out.println("---------");
        }


        public static char checkForWin(char[][] board) {
            //chek each row
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                    return board[i][0];
                }
            }
            //check each col
            for (int j = 0; j < 3; j++) {
                if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                    return board[0][j];
                }
            }
            //chek diagonals
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
                return board[0][0];
            }
            if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != ' ') {
                return board[2][0];
            }
            return ' ';
        }
        //Result output
        public static boolean boardIsFull(char[][] board) {
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(board[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }
}


