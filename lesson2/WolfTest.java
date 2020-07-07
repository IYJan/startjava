public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		wolf1.setAge(44);
		wolf1.setGender("man");
		wolf1.setNickName("Li");
		wolf1.setWeight(45);
		wolf1.setColor("black");
		System.out.println("How old = " + wolf1.getAge() + "\n" + 
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