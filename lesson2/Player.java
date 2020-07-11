public class Player {
	private String name;
	private int count;

	public Player(String name) {
		this.name = name;
	}

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
}