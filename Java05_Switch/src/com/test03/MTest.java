package com.test03;

import com.test02.Season;

public class MTest {

	public static void main(String[] args) {
		
		
		
		
		/* Score 클래스를 완성하자.
		 * getAvg 메서드는, 국어 영어 수학 점수를 전달하면
		 * 평균을 리턴해준다.
		 * getGrade 메서드는, 평균을 전달하면
		 * 90~100 : A
		 * 80~89 : B
		 * 70~79 : C
		 * 60~79 : D
		 * 0 ~59 : F를 리턴해준다.
		 * 
		 * "xxx님의 평균은 xx.xx점이고, 등급은 'ㅁ'입니다. 라고 출력."
		 */
		
		Score sc = new Score();
		double avg = sc.getAvg(100, 68, 75);
		//System.out.println(avg);
		String grade = sc.getGrade(avg);
		
		System.out.printf("전영태 님의 평균은 %.2f점이고," + "등급은 '%s'입니다.",  avg, grade);
		
		
	    

	}

}
