import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Double num1;
		Double num2;
		Double result;
		char sign;
		Scanner reader = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		do {
			System.out.println("Input first num.:");
			num1 = reader.nextDouble();
			System.out.println("Input operation :");
			sign = reader.next().charAt(0);
			System.out.println("Input second num.:");
			num2 = reader.nextDouble();
			result = calc.computation(num1, num2, sign);
			System.out.println(num1 +" "+ sign + " " + num2 + " RESULT IS " + result);
			
			while(true) {
			System.out.println("Do u wanna continue?: Y or N");
			sign = reader.next().charAt(0);
			if (sign == 'Y' || sign == 'N') break;
			}
		} while(sign == 'Y');
	}
}