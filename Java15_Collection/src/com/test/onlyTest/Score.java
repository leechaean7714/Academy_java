package com.test.onlyTest;

public class Score implements Comparable<Object> {

	private String name;
	private int kor;
	private int eng;
	private int math;

	public Score() {
	}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {

		return kor + eng + math;
	}

	public int getAvg() {
		return (kor + eng + math) / 3;
	}

	public String getGrade() {

		switch (getAvg() / 10) {
		case 10:
		case 9:
			return "a";
		case 8:
			return "b";
		case 7:
			return "c";
		case 6:
			return "d";

		default:
			return "f";
		}

	}

	@Override
	public int compareTo(Object o) {
		Score other = (Score)o;
		
		return 0;
	}

}
