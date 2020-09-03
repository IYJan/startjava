package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	private static final int ATTEMPS = 10;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char exit;

		do {
			System.out.println("Hello, player1, what's u name: ");
			Player player1 = new Player(scan.next(), ATTEMPS);
			System.out.println("Hello, player2, what's u name: ");
			Player player2 = new Player(scan.next(), ATTEMPS);
			GuessNumber game = new GuessNumber(player1, player2, ATTEMPS);
			game.start();
			do {
				System.out.println("Do u wanna continue?: Y or N");
				exit = scan.next().charAt(0);
			} while((exit != 'Y') && (exit != 'N'));
		} while (exit != 'N');
		scan.close();
	}
}