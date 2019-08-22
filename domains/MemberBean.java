package com.bitcamp.domains;

public class MemberBean {
	private String id, pw, name;
	private double height, weight;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		// 아이디 비밀번호 이름 키 몸무게
		return String.format("회원정보  \n"
				+ "회원 아이디 : %s \n"
				+ "회원 비밀번호 : %s \n"
				+ "회원 이름 : %s n"
				+ "회원 키 : %.1f cm"
				+ "회원 몸무게 : %.1f kg", id, pw, name, height, weight);
	}

}
