package com.skillstorm.training.day5;

import java.util.Scanner;

public class TicTacToe {

	private static String[][] board = { { " ", " ", " " }, 
							{ " ", " ", " " },
							{ " ", " ", " " } };
	
	private static final String[] players = {"x", "o"};

	public static void main(String[] args) {
		playTicTacToe();
	}

	public static void playTicTacToe() {
		printWelcome();
		// Set up a variable to hold the scanner and the current player
		Scanner in = new Scanner(System.in);
		String player = "";
		// Play 9 rounds unless there is a win, then break the loop
		int round = 0;
		for (round = 1; round <= 9; round++) {
			// Get the current player
			player = players[round % 2]; 
			
			// Prompt for row and column
			System.out.println("Player " + player + " choose a row: ");
			int row = in.nextInt();
			System.out.println("Player " + player + " choose a col: ");
			int col = in.nextInt();
			///////////////////////////////////
			// Your code here
			// TODO Update gameboard (This should be 1 line of code)

			
			//////////////////////////////////
			printGameboard();
			// check for win
			if (diagonalWin() || horizontalWin() || verticalWin()) {
				break;
			}
		}
		printResult(round, player);
		in.close();
	}
	
	private static void printResult(int round, String player) {
		if (round > 9) {
			System.out.println("Tie game.");
		} else {
			System.out.println("Player " + player + " has won!");
		}
	}
	
	private static void printWelcome() {
		System.out.println("Welcome to tic tac toe.");
		printGameboard();
	}

	/*
	 * Print in format:
	 * 
	 * # | # | # 
	 * ---------- 
	 * # | # | # 
	 * ---------- 
	 * # | # | #
	 */
	public static void printGameboard() {
		///////////////////////////////////
		// Your code here
		// TODO Print the gameboard
		
		
		//////////////////////////////////
	}
	
	private static boolean diagonalWin() {
		///////////////////////////////////
		// Your code here
		// TODO Check the diagonals

		//////////////////////////////////
		return false;
	}
	
	private static boolean horizontalWin() {
		///////////////////////////////////
		// Your code here
		// TODO Check the rows

		//////////////////////////////////
		return false;
	}
	
	private static boolean verticalWin() {

		///////////////////////////////////
		// Your code here
		// TODO Check the columns

		//////////////////////////////////
		return false;
	}

}
