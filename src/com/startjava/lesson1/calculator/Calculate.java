package com.startjava.lesson_1.calculator;

public class Calculate {
	public static void main(String[] args) {
		int num1 = 2, num2 = 3, result = 0;//Scanner reader = new Scanner(System.in);
		char sign  = '^';
		System.out.println("Do operation 2 ^ 3 =");//	num1 = reader.nextDouble();//	sign = reader.next().charAt(0);
			if (sign == '+') {
				result = num1 + num2;
			} else {
				if (sign == '-') {
					result = num1 - num2;
				} else if (sign == '*') {
						result = num1 * num2;
						} else if (sign == '/') {
									result = num1 / num2;
								} else if (sign == '^') {
											result = 1;
											for (int i = 1; i <= num2; i++) {
												result *= num1;
											} 
								} else if (sign == '%') { 
											result = num1 % num2;
										} else {
											System.out.println("Error operator");
										}
			}
		System.out.println(num1 +" "+ sign + " " + num2 + " RESULT IS " + result);
	}
}