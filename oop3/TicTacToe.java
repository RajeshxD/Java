package oop3;

import java.util.Scanner;

public class TicTacToe {

	private Player player1, player2;
	private Board board;

	public void startGame() {
		Scanner s = new Scanner(System.in);
		//player input
		player1 = takePlayerInput(1);
		player2 = takePlayerInput(2);
		while(player1.getSymbol() == player2.getSymbol()) {
			System.out.println("Symbole is already taken !! Pick another Symbol !!");
			char symbol = s.next().charAt(0);
			player2.setSymbol(symbol);
		}
		//Create board
		board = new Board(player1.getSymbol(), player2.getSymbol());
		//Conduct the Game
		boolean player1Turn = true;
		while() {
			if(player1Turn) {
				System.out.println("Player 1 "+ player1.getName() + " 's turn");
				System.out.println("Enter x: ");
				int x = s.nextInt();
				System.out.println("Enter y: ");
				int y = s.nextInt();
				int status = board.move(player1.getSymbol(), x, y);
				if(status == Board.INVALID) {
					
				}
			}
		}
	}

	private Player takePlayerInput(int num) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player Number "+ num + " name: ");
		String name = s.nextLine();
		System.out.println("Enter Player "+ num + " Symbol: ");
		char symbol = s.next().charAt(0);
		Player p = new Player(name, symbol);
		return p;
	} 
}
