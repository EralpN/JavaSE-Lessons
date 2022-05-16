package com.bilgeadam.lesson021.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Knight
{
	static boolean exit = false;

	public static void main(String[] args)
	{
		String knightCharacter = "🐴";
		String moveCharacter = "⚔";
		String knight;

		String[][] chessBoard = new String[8][8];
		String[] canMoveTo = new String[8];

		Knight chessGame = new Knight();

		knight = chessGame.askKnight();

		while (!exit)
		{
			chessBoard = chessGame.initiateChessBoard();
			canMoveTo = chessGame.placeKnight(knight, chessBoard, knightCharacter, moveCharacter);
			chessGame.printChessBoard(chessBoard, knightCharacter, moveCharacter);
			knight = chessGame.moveKnight(canMoveTo);
			Arrays.fill(canMoveTo, null);
		}

		System.out.println("Terminating.");
	}

	
	
	
	
	private String askKnight()
	{
		Scanner ask = new Scanner(System.in);
		System.out.println("Where is the knight? (a1 to h8) (type exit to terminate)");
		String knight = ask.nextLine();
		if (knight.equals("exit"))
		{
			exit = true;
			ask.close();
		}
		return knight;
	}

	private String[][] initiateChessBoard()
	{
		String[][] chessBoard = new String[8][8];

		for (int column = 7; column >= 0; column--)
		{
			int rowCounter = 0;
			for (char row = 'a'; row <= 'h'; row++)
			{
				column++;
				String position = String.valueOf(row) + column;
				column--;
				chessBoard[rowCounter][column] = position;
				rowCounter++;
			}
		}

		return chessBoard;
	}

	private String[] placeKnight(String knight, String[][] chessBoard, String knightCharacter, String moveCharacter)
	{
		String[] canMoveTo = new String[8];
		int numCanMoveTo = 0;

		for (int column = 7; column >= 0; column--)
		{
			for (int row = 0; row < 8; row++)
			{
				if (chessBoard[row][column].equals(knight))
				{
					chessBoard[row][column] = knightCharacter;

					if ((row - 2) >= 0 && (row - 2) < 8 && (column + 1) >= 0 && (column + 1) < 8)
					{
						canMoveTo[numCanMoveTo] = chessBoard[row - 2][column + 1];
						numCanMoveTo++;
						chessBoard[row - 2][column + 1] = moveCharacter;
					}

					if ((row - 2) >= 0 && (row - 2) < 8 && (column - 1) >= 0 && (column - 1) < 8)
					{
						canMoveTo[numCanMoveTo] = chessBoard[row - 2][column - 1];
						numCanMoveTo++;
						chessBoard[row - 2][column - 1] = moveCharacter;
					}

					if ((row - 1) >= 0 && (row - 1) < 8 && (column + 2) >= 0 && (column + 2) < 8)
					{
						canMoveTo[numCanMoveTo] = chessBoard[row - 1][column + 2];
						numCanMoveTo++;
						chessBoard[row - 1][column + 2] = moveCharacter;
					}

					if ((row - 1) >= 0 && (row - 1) < 8 && (column - 2) >= 0 && (column - 2) < 8)
					{
						canMoveTo[numCanMoveTo] = chessBoard[row - 1][column - 2];
						numCanMoveTo++;
						chessBoard[row - 1][column - 2] = moveCharacter;
					}

					if ((row + 2) >= 0 && (row + 2) < 8 && (column + 1) >= 0 && (column + 1) < 8)
					{
						canMoveTo[numCanMoveTo] = chessBoard[row + 2][column + 1];
						numCanMoveTo++;
						chessBoard[row + 2][column + 1] = moveCharacter;
					}

					if ((row + 2) >= 0 && (row + 2) < 8 && (column - 1) >= 0 && (column - 1) < 8)
					{
						canMoveTo[numCanMoveTo] = chessBoard[row + 2][column - 1];
						numCanMoveTo++;
						chessBoard[row + 2][column - 1] = moveCharacter;
					}

					if ((row + 1) >= 0 && (row + 1) < 8 && (column + 2) >= 0 && (column + 2) < 8)
					{
						canMoveTo[numCanMoveTo] = chessBoard[row + 1][column + 2];
						numCanMoveTo++;
						chessBoard[row + 1][column + 2] = moveCharacter;
					}

					if ((row + 1) >= 0 && (row + 1) < 8 && (column - 2) >= 0 && (column - 2) < 8)
					{
						canMoveTo[numCanMoveTo] = chessBoard[row + 1][column - 2];
						numCanMoveTo++;
						chessBoard[row + 1][column - 2] = moveCharacter;
					}
				}
			}
		}
		return canMoveTo;
	}

	private void printChessBoard(String[][] chessBoard, String knightCharacter, String moveCharacter)
	{
		for (int column = 7; column >= 0; column--)
		{
			for (int row = 0; row < 8; row++)
			{
				if (chessBoard[row][column].equals(knightCharacter) || chessBoard[row][column].equals(moveCharacter))
				{
					System.out.print(chessBoard[row][column] + " ");
				}
				else
				{
					System.out.print(chessBoard[row][column] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	private String moveKnight(String[] canMoveTo)
	{
		boolean invalidInput = true;
		Scanner ask = new Scanner(System.in);

		System.out.print("Knight can move to");
		for (String move : canMoveTo)
		{
			if (move != null)
			{
				System.out.print(" " + move);
			}
		}
		System.out.println("!");

		String knight;

		do
		{
			System.out.println("What is knights next move? (type exit to terminate)");
			knight = ask.nextLine();

			if (knight.equals("exit"))
			{
				exit = true;
				ask.close();
				break;
			}
			else
			{
				for (String moveable : canMoveTo)
				{
					if (knight.equals(moveable))
					{
						invalidInput = false;
					}
				}
			}
		}
		while (invalidInput);
		return knight;
	}

}
