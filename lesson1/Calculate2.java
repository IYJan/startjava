//import java.util.Scanner;


public class Calculate {
	
	public static void main (String[] args) {
	
	//Scanner reader = new Scanner(System.in);
	int num1, num2;
	char oprt;
		
		System.out.println("Dano chisla 34 and 43");
		//	num1 = reader.nextDouble();

		System.out.println("Need do 6 operations (+ , - , / , * , ^ , % )");
		//	oprt = reader.next().charAt(0);

			if (oprt == '+')
			{
				num1 += num2;
			}
				else
			{
				if (oprt == '-')
			{
					num1 -= num2;
			}
					else
			{
					if (oprt == '*')
			{
						num1 *= num2;
			}
						else
			{
						if (oprt == '/')
			{
							num1 /= num2;
			}	
							else{
							if (oprt == '^')
			{
				num1 = Math.pow(num2, exp);
			}

								System.out.println("Error operator");
							}
		}
	}
}

		System.out.println("RESULT IS " + num1);
}
}

