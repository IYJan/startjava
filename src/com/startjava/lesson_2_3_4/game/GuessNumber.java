package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
	private int randomNumber;
	private Player player1;
	private Player player2;
	private static int ATTEMPS;
	private static Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2, int ATTEMPS) {
		this.player1 = player1;
		this.player2 = player2;
		this.ATTEMPS  = ATTEMPS;
	}

	public void start() {
		randomNumber = (int) (Math.random() * 101);
		System.out.println("prompt, the number is: " + randomNumber);

		for (int i = 0; i <= ATTEMPS; i++) {
			if (makeMove(player1)) {
				break;
			}
			if (makeMove(player2)) {
				break;
			}
		}
		outNumbers(player1);
		outNumbers(player2);
	}

	private boolean makeMove(Player player) {
		if (player.getCountAttemp() == 10) {
			System.out.println("Player " + player.getName() + " u attempts are lost");
			return false;
		}
		System.out.println("Player " + player.getName() + " have " + (ATTEMPS - player.getCountAttemp()) + " attempt");
		inputNumber(player);
		return isCompareNumbers(player);
	}

	private void inputNumber(Player player) {
		System.out.println(player.getName() + " please, enter u number = ");
		player.setNumber(scan.nextInt());
	}

	private boolean isCompareNumbers(Player player) {
		if (player.getLastNumber() == randomNumber) {
			System.out.println("Player " + player.getName() + " u're guessed " + randomNumber + " for " + player.getCountAttemp() + " attempt");
			return true;
		} else {
			String outText = player.getLastNumber() < randomNumber ? " < " : " > ";
			System.out.println(player.getName() + " u number " + outText + " computer number");
		}
		return false;
	}

	private void outNumbers(Player player) {
		System.out.print(player.getName() + " ");
		for (int number : player.getNumbers()) {
			System.out.print(number + " ");
		}
		System.out.println("\n");
	}
}