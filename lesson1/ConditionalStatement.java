public class ConditionalStatement {
	public static void main(String[] args) {
		byte age = 10;
		boolean man = false;
		double high = 1.9;
		String name = "Ilex";
		char firstNameLetter = name.charAt(0);
		if (age > 20) {
			System.out.println("1) age = " + age + " > 20 - Yes");
		}

		if (man) {
			System.out.println("2) man - Yes");
		}
		
		if (!man) {
			System.out.println("3) man - No");
		}
		
		if (high < 1.80) {
			System.out.println("4) " + high + "< 1.8 - Yes");
		} else System.out.println("4.1) " + high + " < 1.8 - No");

		if (firstNameLetter == 'A') {
			System.out.println("First Chart Name = " + name +" equal A , Yes");
		} else if ( firstNameLetter == 'I') {
			System.out.println("First Chart Name = " + name + " equal I , Yes");
		} else System.out.println(firstNameLetter + " != M,I");
	}
}
