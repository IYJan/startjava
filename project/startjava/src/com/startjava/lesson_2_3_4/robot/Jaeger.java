package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
	private String nickName;
	private String launch;
	private String markName;
	private String armor1;
	private String armor2;
	private int kaijiKill;
	private double weightTonn;
	private float height;
	private boolean isMove;

	public Jaeger(String nickName, String launch, String markName, String armor1, String armor2, int kaijiKill, double weightTonn, float height) {
		this.nickName = nickName;
		this.launch = launch;
		this.markName = markName;
		this.armor1 = armor1;
		this.armor2 = armor2;
		this.weightTonn = weightTonn;
		this.height = height;
		this.kaijiKill = kaijiKill;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setLaunch(String launch) {
		this.launch = launch;
	}

	public String getLaunch() {
		return launch;
	}

	public void setMarkName(String markName) {
		this.markName = markName;
	}

	public String getMarkName() {
		return markName;
	}

	public void setArm1(String armor1) {
		this.armor1 = armor1;
	}

	public String getArm1() {
		return armor1;
	}

	public void setArm2(String armor2) {
		this.armor2 = armor2;
	}

	public String getArm2() {
		return armor2;
	}

	public void setWeightTonn(double weightTonn) {
		this.weightTonn = weightTonn;
	}

	public Double getWeightTonn() {
		return weightTonn;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setKaijiKills(int kaijiKill) {
		this.kaijiKill = kaijiKill;
	}
	
	public int getKaijiKills() {
		return kaijiKill;
	}
	
	public void setMove() {
		isMove = true;
	}

	public String kaijiScan() {
		return "scanning";
	}

	public void fireArm1() {
	}

	public void fireArm2() {
	}
}