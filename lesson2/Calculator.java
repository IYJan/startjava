import java.util.Scanner;

public class Calculator {
	private static double num1;
	private static double num2;
	private static char sign;
	private static Scanner reader = new Scanner(System.in);

	public void calculate() {
		double result = 0.0;
		System.out.println("Input first num.:");
		num1 = reader.nextDouble();
		System.out.println("Input operation:");
		sign = reader.next().charAt(0);
		System.out.println("Input second num.:");
		num2 = reader.nextDouble();
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
		System.out.println(num1 + " " + sign + " " + num2 + " RESULT IS " + result);
	}
}
