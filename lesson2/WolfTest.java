public class WolfTest {
	public static void main (String args[]) {
		Wolf wolf1 = new Wolf();
		wolf1.old(5);
		wolf1.gender("WoMan");
		wolf1.nickName("Li");
		wolf1.weight(80);
		wolf1.color("white");
		System.out.println("How old = " + wolf1.old() + " NickName = " + wolf1.nickName() + " Weight = " + wolf1.weight() + " Color = " + wolf1.color());

 		wolf1.walk();
		wolf1.sit();
		wolf1.run();
		wolf1.howl();
	 	wolf1.hunting();
	}
}