package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner reader = new Scanner(System.in);
		double num1;
		double num2;
		char sign;

		do {
			System.out.println("Input first num.:");
			num1 = reader.nextDouble();
			System.out.println("Input operation:");
			sign = reader.next().charAt(0);
			System.out.println("Input second num.:");
			num2 = reader.nextDouble();
			System.out.println(num1 + " " + sign + " " + num2 + " RESULT IS " + calc.calculate(num1, num2, sign)); //передать в класс calc аргументы num1, num2, sign
			do {
				System.out.println("Do u wanna continue?: Y or N");
				sign = reader.next().charAt(0);
			} while((sign != 'Y') && (sign != 'N'));
		} while (sign != 'N');
	}
}