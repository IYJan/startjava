public class Person {
	String name = "Garry";
	String sex = "Male";
	float height = 1,90f;
	Double weight = 88,9;
	int age = 35;

	public String getName() {
		return this.name;
	}
	public int getCount() {
		return this.count;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void walk() {
		System.out.println("I'm walking");
	}
	public void sit() {
		System.out.println("I'm sitting");
	}
	public void run() {
		System.out.println("I'm running");
	};

	public void speak() {
		System.out.println("I'm speaking");
	};
	public void learnJava() {
		System.out.println("I'm learningJava");
	};
}