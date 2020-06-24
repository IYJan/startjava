public class Calculate {
	
	public static void main (String[] args) {
		int num1 = 2, num2 = 3, num0 = 1;//Scanner reader = new Scanner(System.in);
		char oprt  = '^';
		System.out.println("Do operation 2 ^ 3 =");//	num1 = reader.nextDouble();//	oprt = reader.next().charAt(0);
			if (oprt == '+') {
				num0 = num1 + num2;
			}
				else {
				if (oprt == '-') {
					num0 = num1 - num2;
				}
					else {
					if (oprt == '*') {
						num0 = num1 * num2;
					}
						else {
						if (oprt == '/') {
							num0 = num1 / num2;
						}	
							else {
								if (oprt == '^') {
									for (int i = 1; i <= num2; i++ ) {
										num0 *= num1;
									}
								} else {
										if (oprt == '%') { 
											num0 = num1 % num2;
										}
										else {
											System.out.println("Error operator");
										}
								}
							}
						}
					}	
				}
			System.out.println(num1 +" "+ oprt + " " + num2 + " RESULT IS " + num0);
	}
}