
public class ConditionalStatement {
	public static void main(String args[]) {
		byte age = 10;
		boolean man = true;
		double high = 1.2;
		String name = "Ilex";
		char firstChar= name.charAt(0);
		if (age > 20) {
			System.out.println("1. age > 20 - Yes");
		}
		if (man) {
			System.out.println("2. man - Yes");
		}
		if (!man == false) {
			System.out.println("3. man - No");
		}
		if (high < 1.80) {
			System.out.println("4." + high + "< 1.8 - Yes");
		}		else{
			System.out.println("4.1" + high + " < 1.8 - No");
				}
		if (firstChar == 'A') {
			System.out.println("First Chart Name equal A , Yes");
		}		else{ 
				if ( firstChar == 'I') {
					System.out.println("First Chart Name equal I , Yes");
				}	else{
					System.out.println(firstChar + " != M,I");
					}
				}
	}
}