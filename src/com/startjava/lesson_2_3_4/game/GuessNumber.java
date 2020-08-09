package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
	private int randomNumber;
	private Player player1;
	private boolean win = false;
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
		for (int index = 0; index < 10; index ++) {
			if (makeMove(player1, index)) {
				break;
			}
			if (makeMove(player2, index)) {
				break;
			}
		}
		if (!win) {
			System.out.println("Nobody Win");
		}
		outNumbers(player1);
		outNumbers(player2);
	}
	
	private void setup() {
		player1.fillNumbers();
		player2.fillNumbers();
	}

	private boolean makeMove(Player player, int index) {
		inputNumber(player, index);
		return isCompareNumbers(player, index);
	}

	private void inputNumber(Player player, int index) {
		System.out.println("Player have " + player.getName() + " " + player.getAttempts() + " attempt");
		System.out.println(player.getName() + " please, enter u number = ");
		player.setNumber(reader1.nextInt(), index);
		player.setAttemp();
	}

	private boolean isCompareNumbers(Player player, int index) {
		if (player.getNumber()[index] > randomNumber) {
			System.out.println(player.getName() + " u number > computer number \n");
		} else if (player.getNumber()[index] < randomNumber) {
			System.out.println(player.getName() + " u number < computer number \n");
		} else {
			System.out.println("Player " + player.getName() + " u're guessed " + randomNumber + " for " + (index + 1) + " attempt");
			win = true;
			if (index == 9 ) {
				System.out.println("Player " + player.getName() + " u attempts are lost");
			}
				return true;
		}
		if (index == 9) {
			System.out.println("Player " + player.getName() + " u attempts are lost");
		}
		return false;
	}

	private void outNumbers(Player player) {
		System.out.println(" \n" + player.getName());
		for (int arrays1 : player.getNumber()) {
				System.out.print(arrays1 + " ");
		}
		System.out.println(" \n");
	}
}