package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
	private int randomNumber;
	private static final int ATTEMPS = 10;
	private Player player1;
	private Player player2;
	private static Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		randomNumber = (int) (Math.random() * 101);
		System.out.println("prompt, the number is: " + randomNumber);
		setup(player1);
		setup(player2);
		for (int i = 0; i <= 10; i++) {
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

	private void setup(Player player) {
		player.setCountAttemp(ATTEMPS);
		player.fillNumbers();
	}

	private boolean makeMove(Player player) {
		if (player.getLastAttemp() == 10) {
			System.out.println("Player " + player.getName() + " u attempts are lost");
			return false;
		}
		System.out.println("Player " + player.getName() + " have " + (ATTEMPS - player.getLastAttemp()) + " attempt");
		inputNumber(player);
		return isCompareNumbers(player);
	}

	private void inputNumber(Player player) {
		System.out.println(player.getName() + " please, enter u number = ");
		player.setNumber(scan.nextInt());
	}

	private boolean isCompareNumbers(Player player) {
		if (player.getLastNumber() == randomNumber) {
			System.out.println("Player " + player.getName() + " u're guessed " + randomNumber + " for " + player.getLastAttemp() + " attempt");
			return true;
		} else {
			String outText =  player.getLastNumber() < randomNumber ? " < " : " > ";
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