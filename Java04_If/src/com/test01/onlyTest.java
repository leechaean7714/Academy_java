package com.test01;

public class onlyTest {

	public static void main(String[] args) {
		
		double avg=getAvg(90,80,70);
		String grade = getGrade(avg);
		
		System.out.printf("이채안님의 평균은 %.2f점이고, 등급은 %s 입니다.",avg,grade);

	}

	public static double getAvg(int kor, int eng, int math) {

		return (kor + eng + math) / 3.0;

	}

	public static String getGrade(double avg) {

		// char grade = (Character) null;

		switch ((int) avg / 10) {
		case 10:
		case 9:
			return "a";

		case 8:
			return "b";

		case 7:
			return "C";

		case 6:
			return "d";

		default:
			return "f";
		}

	}

}
