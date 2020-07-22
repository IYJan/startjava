import java.util.Scanner;

public class CalculatorTest {
	private static double result;
	private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		do {
			calc.calculate();
		} while(isNext());
	}

	private static boolean isNext() {
	char exit;
	do {
		System.out.println("Do u wanna continue?: Y or N");
		exit = reader.next().charAt(0);
			if (exit == 'Y') {
				return true;
			} else if (exit != 'N') {
				System.out.println("Only Y or N"); 
			}
	} while (exit != 'N');
	return false;
	}
}