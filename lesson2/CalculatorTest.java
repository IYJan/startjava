import java.util.Scanner;

public class CalculatorTest {
	private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		char exit;

		do {
			calc.calculate();
			do {
				System.out.println("Do u wanna continue?: Y or N");
				exit = reader.next().charAt(0);
			} while((exit != 'Y') && (exit != 'N'));
		} while (exit != 'N');
	}
}