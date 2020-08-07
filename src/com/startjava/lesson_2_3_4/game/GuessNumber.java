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
		cleanArrayNums();
		int index =0;
		while (index < 10) {
			if (inputNumbers(player1, index)) {
				break;
			}
			if (inputNumbers(player2, index)) {
				break;
			}
			index++;
		}
		if (!win) {
			System.out.println("Nobody Win");
		}
		outNumbers();
	}

	private void outNumbers() {
		System.out.println(player1.getName() + " " + Arrays.toString(player1.getNumbers()));
		System.out.println(player2.getName() + " " + Arrays.toString(player2.getNumbers()));
	}

	private void cleanArrayNums() {
		player1.fillNumbers();
		player2.fillNumbers();
	}

	private boolean inputNumbers(Player player, int index) {
		System.out.println("Player have " + player.getName() + " " + player.getAttempts() + " attempt");
		System.out.println(player.getName() + " please, enter u number = ");
		player.setNumbers(reader1.nextInt(), index);
		return isCompareNumbers(player, index);
	}

	private boolean isCompareNumbers(Player player, int index) {
		player.setAttemp();
		if (player.getNumbers()[index] > randomNumber) {
			System.out.println(player.getName() + " u number > computer number \n");
		} else if (player.getNumbers()[index] < randomNumber) {
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
}