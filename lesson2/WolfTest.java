public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		wolf1.age = 44;
		wolf1.gender = "man";
		wolf1.nickName = "Li";
		wolf1.weight = 45;
		wolf1.color = "black";
		System.out.println("How old = " + wolf1.age + "\n" + 
			" NickName = " + wolf1.nickName + "\n" +
			" Weight = " + wolf1.weight + "\n" +
			" Color = " + wolf1.color);

 		wolf1.walk();
		wolf1.sit();
		wolf1.run();
		wolf1.howl();
	 	wolf1.hunting();
	}
}