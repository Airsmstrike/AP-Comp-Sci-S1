/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Global variables
        int turn = 0;
        String markChoice;
        String[] board = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // Mini guessing game to decide the first player
        System.out.println(" LET'S PLAY TIC TAC TOE!!!");
        System.out.println("");
        System.out.println("Rules: ");
        System.out.println("1. Both players should try to guess what the random number is from 1-100");
        System.out.println("2. Whoever is closer goes first!");
        System.out.println("3. When placing your mark, type the NUMBER of the box you want to mark!");
        System.out.println("4. The older player is player one and is X, player two is the younger player and is O");
        System.out.println("");

        while (true) {
            int ranNum = (int) (Math.random() * 100 + 1);
            System.out.print("Player one's guess: ");
            int guess1 = sc.nextInt();
            System.out.print("Player two's guess: ");
            int guess2 = sc.nextInt();

            System.out.println("The random number was " + ranNum);

            if (guess1 == guess2) {
                System.out.println("You both made the same guess! Try again!");
            } else if (Math.abs(ranNum - guess1) < Math.abs(ranNum - guess2)) {
                System.out.println("Player one's guess was closer! You get to go first!");
                turn = 1; // Player 1 starts
                break;
            } else {
                System.out.println("Player two's guess was closer! You get to go first!");
                turn = 2; // Player 2 starts
                break;
            }
        }

        // Actual Gameplay
        for (int squaresPlayed = 0; squaresPlayed < 9; squaresPlayed++) {
            printBoard(board);

            if ((turn == 1 && squaresPlayed % 2 == 0) || (turn == 2 && squaresPlayed % 2 == 1)) {
                System.out.println("Player 1 (X), choose a box: ");
                markChoice = sc.next();
                if (isValidMove(board, markChoice)) {
                    updateBoard(board, markChoice, "X");
                } else {
                    System.out.println("Invalid move! Try again.");
                    squaresPlayed--;
                    continue;
                }
            } else {
                System.out.println("Player 2 (O), choose a box: ");
                markChoice = sc.next();
                if (isValidMove(board, markChoice)) {
                    updateBoard(board, markChoice, "O");
                } else {
                    System.out.println("Invalid move! Try again.");
                    squaresPlayed--;
                    continue;
                }
            }

            if (checkWinner(board)) {
                printBoard(board);
                System.out.println("Game Over!");
                System.out.println((squaresPlayed % 2 == 0 ? "Player 1 (X)" : "Player 2 (O)") + " wins!");
                return;
            }
        }

        printBoard(board);
        System.out.println("Game Over! It's a draw!");
    }

    // Print the Tic Tac Toe board
    public static void printBoard(String[] board) {
        System.out.println("      |     |     ");
        System.out.println("   " + board[0] + "  |  " + board[1] + "  |  " + board[2] + "   ");
        System.out.println(" _____|_____|_____ ");
        System.out.println("      |     |     ");
        System.out.println("   " + board[3] + "  |  " + board[4] + "  |  " + board[5] + "   ");
        System.out.println(" _____|_____|_____ ");
        System.out.println("      |     |     ");
        System.out.println("   " + board[6] + "  |  " + board[7] + "  |  " + board[8] + "   ");
        System.out.println("      |     |     ");
    }

    // Check if the selected move is valid
    public static boolean isValidMove(String[] board, String choice) {
        for (String spot : board) {
            if (spot.equals(choice)) {
                return true;
            }
        }
        return false;
    }

    // Update the board with the player's move
    public static void updateBoard(String[] board, String choice, String mark) {
        for (int i = 0; i < board.length; i++) {
            if (board[i].equals(choice)) {
                board[i] = mark;
                break;
            }
        }
    }

    // Check for a winner
    public static boolean checkWinner(String[] board) {
        String[][] winningCombos = {
            {board[0], board[1], board[2]},
            {board[3], board[4], board[5]},
            {board[6], board[7], board[8]},
            {board[0], board[3], board[6]},
            {board[1], board[4], board[7]},
            {board[2], board[5], board[8]},
            {board[0], board[4], board[8]},
            {board[2], board[4], board[6]}
        };

        for (String[] combo : winningCombos) {
            if (combo[0].equals(combo[1]) && combo[1].equals(combo[2])) {
                return true;
            }
        }
        return false;
    }
}