public class Wolf {
	private String gender = "Man";
	private String nickName = "Mark";
	private int age = 50;
	private int weight = 90;
	private String color = "black";

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Incorret age");
		} else this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
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