public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		int old = wolf1.getOld();
		String gender = wolf1.getGender();
		String nicjName = wolf1.getNickName();
		int Weight = wolf1.getWeight();
		String Color = wolf1.getColor();
		System.out.println("How old = " + wolf1.getOld() + "\n" + 
			" NickName = " + wolf1.getNickName() + "\n" +
			" Weight = " + wolf1.getWeight() + "\n" +
			" Color = " + wolf1.getColor());

 		wolf1.walk();
		wolf1.sit();
		wolf1.run();
		wolf1.howl();
	 	wolf1.hunting();
	}
}