package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

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
		System.out.println("���������, �������� �����: " + randomNumber);
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
			System.out.println("����� �� �������");
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
		System.out.println("� ������ �������� " + player.getName() + " " + player.getAttempts() + " �������");
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
			System.out.println("����� " + player.getName() + " ������ ����� " + randomNumber + " � " + (index + 1) + " �������");
			win = true;
			if (index == 9 ) {
				System.out.println("� " + player.getName() + " ����������� �������");
			}
				return true;
		}
		if (index == 9) {
			System.out.println("� " + player.getName() + " ����������� �������");
		}
		return false;
	}
}