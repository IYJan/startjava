public class Cycle {
	public static void main (String[] args) {
		getFor();
		getWhile();
		getDoWhile();

		public class getFor() {
			for (int i=0; i <=20; i++) {
				System.out.println("1. " + i + ", ");
		}
		public class getWhile() {
			byte y = 6;
				while ((-6 <= y) && (y <= 6)) {
					System.out.println("2. chislo ot -6 do 6 step 2, = " + y);
					y -= 2;
				}
		}
		public class getDoWhile() {
			int z = 10;
			y = 0;
				do {
					if (z % 2 != 0) {
						System.out.println("3. sum first 10 numb. Z =" + z);
						y += z;
					} 
					z++;
				} while (z <=20);
		}
		}
	}
}