package com.cal01;

import java.util.Scanner;

public class MTest {
	
	public static void main(String[] args) {
		// java.util.Calendar 클래스를 사용하지 않고 달력을 출력하자
		// hint : year년 month월 -> year.month.1의 요일
		
		// 해당요일만큼 공백 출력 / 나머지부터 날짜 출력
	
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 입력 : ");
		int year = sc.nextInt();
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
		
		
		DayOfCalendar.prn(year, month);
	
	}

}
