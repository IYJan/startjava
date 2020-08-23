package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
	private int randomNumber;
	private Player player1;
	private Player player2;
	private static Scanner reader1 = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void startGame() {
		randomNumber = (int) (Math.random() * 101);
		System.out.println("prompt, the number is: " + randomNumber);
		setup();
		for (int i = 0; i <= 10; i ++) {
			if (isCompareNumbers(player1, i)) {
				break;
			}
			if (isCompareNumbers(player2, i)) {
				break;
			}
		}
		outNumbers(player1);
		outNumbers(player2);
	}
	
	private void setup() {
		player1.fillNumbers();
		player2.fillNumbers();
	}

//	private boolean makeMove(Player player, int index) {
//
//		return isCompareNumbers(player, index);
//	}
	private boolean isCompareNumbers(Player player, int index) {
		if (index == 10) {
			System.out.println("Player " + player.getName() + " u attempts are lost");
			return false;
		}
		inputNumber(player);
		if (player.getNumbers()[index] > randomNumber) {
			System.out.println(player.getName() + " u number > computer number");
		} else if (player.getNumbers()[index] < randomNumber) {
			System.out.println(player.getName() + " u number < computer number");
		} else {
			System.out.println("Player " + player.getName() + " u're guessed " + randomNumber + " for " + (index + 1) + " attempt");
			return true;
		}
		return false;
	}

	private void inputNumber(Player player) {
		System.out.println("Player " + player.getName() + " have " + player.getAttempts() + " attempt");
		System.out.println(player.getName() + " please, enter u number = ");
		player.setNumber(reader1.nextInt());
		player.setAttemp();
	}

	private void outNumbers(Player player) {
		System.out.print(player.getName() + " ");
		for (int number : player.getNumbers()) {
			System.out.print(number + " ");
		}
		System.out.println("\n");
	}
}