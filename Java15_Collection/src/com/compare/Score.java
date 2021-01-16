package com.compare;

/*객체 정렬하기.(각 게이머들중 누가 제일 점수가 높은지에 쓰인다.)
 * comparable:객체간의 일반적인 정렬을 할 때, Comparable인터페이스를 확장해서 정렬의 기준을 정의 하는 compareTo()메서드를 구현한다.
 * comparator:객체간의 특별한 정렬이 필요할 때, 
 *            Comparator 인터페이스를 확장해서 
 *             특정 기준을 정의 하는 compare()메서드를 구현한다.
 * 
 * 
 * */

public class Score implements Comparable<Object> {

	private String name;
	private int kor;
	private int eng;

	private int math;

	// 생성자 (기본 생성자, 파라미터 4개짜리 생성자)
	public Score() {
		super();

	}

	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	// getter & setter

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

	public int getMath(int math) {
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

	// toString override
	@Override
	public String toString() {
		return "이름 : " + name + " 국어 : " + kor + " 영어 : " + eng + " 수학 : " + math + " 총점 : " + getSum() + " 평균 : "
				+ getAvg() + " 등급 : " + getGrade();

	}

	@Override
	public int compareTo(Object o) {
		System.out.println("o:" + o);

		// 앞의 값이 더 크면 1 같은 값이면 0 뒤의 값이 더 크면 -1
		Score other = (Score) o;

		System.out.println("other:" + other);

		// System.out.println("this.getName()+this.getKor():"+this.getName()+this.getKor());
		if (this.getKor() > other.getKor()) {

			return 1;

		} else if (this.getKor() < other.getKor()) {
			return -1;
		} else if (this.getKor() == other.getKor()) {

			if (this.getEng() > other.getEng()) {
				return -1;
			} else if (this.getEng() < other.getEng()) {
				return 1;
			}

		}
		return 0;

	}
}
