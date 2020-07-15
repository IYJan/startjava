public class Jaeger {
	private String nickName;
	private String launch;
	private String marK;
	private String armor1;
	private String armor2;
	private int kaijiKill;
	private double weightTonn;
	private float height;
	private boolean isMove;

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

	public void setMark(String marK) {
		this.marK = marK;
	}

	public void setArm1(String armor1) {
		this.armor1 = armor1;
	}

	public void setArm2(String armor2) {
		this.armor2 = armor2;
	}

	public void setWeightTonn(double weightTonn) {
		this.weightTonn = weightTonn;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setKaijiKills(int kaijiKill) {
		this.kaijiKill = kaijiKill;
	}
	
	public String getNickName() {
		return this.nickName;
	}

	public String getLaunch() {
		return this.launch;
	}

	public String getMark() {
		return this.marK;
	}

	public String getArm1() {
		return this.armor1;
	}

	public String getArm2() {
		return this.armor2;
	}

	public Double getWeightTonn() {
		return this.weightTonn;
	}

	public float getHeight() {
		return this.height;
	}

	public int getKaijiKills() {
		return this.kaijiKill;
	}
	
	public void isMove() {
		this.isMove = true;
	}

	public String isKaijiScan() {
		return "scanning";
	}

	public void isFireArm1() {
	}

	public void isFireArm2() {
	}
}