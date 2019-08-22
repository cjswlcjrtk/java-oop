package com.bitcamp.domains;

public class SubjectBean {
	private int kor, eng, math;
	private double total, evg;
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return this.math;
	}
//	public void setTotal(double total) {
//		this.total = total;
//	}
//	public double getTotal() {
//		return this.total;
//	}
//	public void setEvg(double evg) {
//		this.evg = evg;
//	}
//	public double getEvg() {
//		return this.evg;
//	}
	
	@Override
	public String toString() {
		return String.format("국어 : %d \n"
				+ "영어 ㅣ %d \n"
				+ "수학 %d", kor, eng, math);
	}

}
