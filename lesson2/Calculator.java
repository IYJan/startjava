public class Calculator {
	public double calculate(double num1, double num2, char sign) {
		double result = 0.0;
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
