package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private static int result = 0;

	public int calculate(int num1, int num2, char sign) {
		switch(sign) {
			case '+': 
				result = Math.addExact(num1, num2);
				break;
			case '-':
				result = Math.subtractExact(num1, num2);
				break;
			case '*':
				result = Math.multiplyExact(num1, num2);
				break;
			case '/':
				result = Math.floorDiv(num1, num2);
				break;
			case '^':
				result = (int) Math.pow(num1, num2);
				break;
			case '%': 
				result = num1 % num2;
				break;
			default : 
				System.out.println("Error operator");
				break;
		}
		return result;
	}
}