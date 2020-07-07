public class Calculator {	
	public Double computation(Double num1, Double num2, char sign) {
			Double result = 0.0;
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
				System.out.println("^ result" + result);
				for (int i = 1; i <= num2; i++) {
					System.out.println("for i=" + i);
					result *= num1;
					System.out.println("^ result" + result);
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
