package com.score;

public class Score {
	
	private String name;
	
	private int kor;
	private int eng;
	private int math;
	
	
	public Score() {
		
		}
	
	public Score(String name, int kor, int eng, int math) {
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
		// 3개 다 더해서 리턴
		return kor + eng + math;

	}

	public double getAvg() {
		// 더해진 값을 평균으로 만들어서 리턴
		return (double) getSum() / 3.0;

	}

	public String getGrade() {
		// 90~100 A / 80~89 B / 70~79 C / 60~69 D / ~59 F 리턴
		switch ((int) getAvg() / 10) {

		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";

		default:
			return "F";

		}

	}

	@Override
	public String toString() {
		return name + "  " + kor + "  " + eng + "  " + math + "  " + getSum() + " 평균 : "
				+ (int)getAvg() + " 등급 : " + getGrade();

	}



}
