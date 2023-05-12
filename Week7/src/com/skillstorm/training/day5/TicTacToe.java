package com.skillstorm.training.day5;

import java.util.Scanner;

public class TicTacToe {

	private static String[][] board = { { " ", " ", " " }, 
							{ " ", " ", " " },
							{ " ", " ", " " } };

	public static void main(String[] args) {
		playTicTacToe();
	}

	public static void playTicTacToe() {
		System.out.println("Welcome to tic tac toe.");
		printGameboard();
		Scanner in = new Scanner(System.in);
		String[] players = { "x", "o" };
		String player = "";
		boolean tieGame = false;
		for (int round = 1; round <= 9; round++) {
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
			tieGame = true;
		}
		System.out.println(tieGame ? "Tie game." : "Player " + player + " has won!");
		in.close();
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
