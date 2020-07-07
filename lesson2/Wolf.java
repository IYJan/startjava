public class Wolf {
	private String gender = "Man";
	private String nickName = "Mark";
	private int age = 50;
	private int weight = 90;
	private String color = "black";

	public String getGender() {
		return this.gender;
	}
	public String getNickName() {
		return this.nickName;
	}
	public int getAge() {
		return this.age;
	}
	public int getWeight() {
		return this.weight;
	}
	public String getColor() {
		return this.color;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Incorret age");
		} else this.age = age;
		
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void walk() {
	}
	public void sit() {
	}
	public void run() {
	}
	public void howl() {
	}
	public void hunting() {
	}
}