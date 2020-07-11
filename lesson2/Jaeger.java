public class Jaeger {
	private String nickName;
	private String launch;
	private String marK;
	private String armor1;
	private String armor2;
	private int kaijiKill;
	private Double weightTonn;
	private float height;
	private boolean toMove;

	public Jaeger() {};
	public Jaeger(String nickName, String launch, String marK, String armor1, String armor2, int kaijiKill, Double weightTonn, float height) {
		this.nickName = nickName;
		this.launch = launch;
		this.marK = marK;
		this.armor1 = armor1;
		this.armor2 = armor2;
		this.weightTonn = weightTonn;
		this.height = height;
		this.kaijiKill = kaijiKill;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setLaunch(String launch) {
		this.launch = launch;
	}
	public void setMarkName(String marK) {
		this.marK = marK;
	}
	public void setArm1(String armor1) {
		this.armor1 = armor1;
	}
	public void setArm2(String armor2) {
		this.armor2 = armor2;
	}
	public void setWeight(Double weightTonn) {
		this.weightTonn = weightTonn;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setKills(int kaijiKill) {
		this.kaijiKill = kaijiKill;
	}
	
	public String getNickName() {
		return this.nickName;
	}
	public String getLaunch() {
		return this.launch;
	}
	public String getMarkName() {
		return this.marK;
	}
	public String getArm1() {
		return this.armor1;
	}
	public String getArm2() {
		return this.armor2;
	}
	public Double getWeight() {
		return this.weightTonn;
	}
	public float getHeight() {
		return this.height;
	}
	public int getKills() {
		return this.kaijiKill;
	}
	
	public void move() {
		this.toMove = true;
	};
	public String kaijiScan() {
		return "scanning";
	};
	public void fireArm1() {
	};
	public void fireArm2() {
	};
}