public class Cycle {
	public static void main (String[] args) {
				System.out.println("1. operator FOR,");
			for (int i=0; i <=20; i++) {
				System.out.println(i + ", ");
			}
			byte y = 6;
			System.out.println("2. operator WHILE,");
			while ((-6 <= y) && (y <= 6)) {
				System.out.println("chislo ot -6 do 6 step 2, = " + y);
					y -= 2;
			}
			int z = 10;
			y = 0;
			System.out.println("3. operator DO WHILE,");
				do {
					if (z % 2 != 0) {
						System.out.println("sum first 10 numb. Z =" + z);
						y += z;
					} 
					z++;
				} while (z <=20);
		}
}