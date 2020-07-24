import java.util.Scanner;

public class Calculator {
	private static Scanner reader = new Scanner(System.in);
	private static double result = 0.0;

	public double calculate(double num1, double num2, char sign) {
		switch(sign) {
			case '+': 
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '^':
				result = 1.0;
				for (int i = 1; i <= num2; i++) {
					result *= num1;
				} 
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