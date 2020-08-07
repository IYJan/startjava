package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner reader = new Scanner(System.in);
		String text;
		String num1;
		char sign;
		startGame();
	}

	public static void startGame() {
		do {
			System.out.println("Input arithmetic operation, example 4 + 2:");
			text = "";
			num1 = "";
			num1 = reader.nextLine();
			text = num1.replaceAll("\\s", "");
			String[] lineText = text.split("[\\Q^*/+-%\\E]"); //занести в массив (каждый набор символов в отдельные ячейки)строк символы стоящие перед указанными символами в [] и после них
			sign = checkSign(text);
			System.out.println(Integer.parseInt(lineText[0]) + " " + sign + " " + Integer.parseInt(lineText[1]) + " RESULT IS " + calc.calculate(Integer.parseInt(lineText[0]), Integer.parseInt(lineText[1]), sign)); //передать в calc аргументы num1, num2, sign
			do {
				System.out.println("Do u wanna continue?: Y or N");
				sign = reader.next().charAt(0);
			} while ((sign != 'Y') && (sign != 'N'));
		} while (sign != 'N');
	}


	private static char checkSign(String text) {
		if (text.indexOf("^") != -1) {
			return '^';
		} else { if (text.indexOf("*") != -1) {
			return '*';
		} else if (text.indexOf("/") != -1) {
			return '/';
		} else if (text.indexOf("+") != -1) {
			return '+';
		} else if (text.indexOf("-") != -1) {
			return '-';
		} else if (text.indexOf("%") != -1) {
			return '%';
		} else {
			System.out.println("Арифметические операции только со знаками: ^, /, *, +, -, %");
			throw new IllegalArgumentException();
		}
		}
	}
}