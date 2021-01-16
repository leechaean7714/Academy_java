package com.cal02;

import java.util.Calendar;

public class CalendarUseApi {
	
	public void prn(int year, int month) {
		
		// singleton pattern : 메모리에 객체가 단 한 번만 만들어지고, 이후에 다시 호출하면 메모리에 있는 객체가 전달된다.
		Calendar cal = Calendar.getInstance();   // 참조타입이지만 new를 쓰지않고 호출
		
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		// 시작 날짜 설정
		cal.set(year, month-1, 1);     //month-1 왜? (값이 0~11로 설정되어 있음)
		
		// 설정한 1일의 요일
		int start = cal.get(Calendar.DAY_OF_WEEK); // 그 주의 월요일, 화요일, 수요일..값 / 클래스.메소드로 호출하기 때문에 static일때만 호출 가능.
		
		// 요일만큼 공백
		for(int i = 1; i < start ; i++) {  //i = 1 시작? 일요일이 1부터 시작하기 때문!!(java.util.Calendar에서)
			System.out.print("\t");
		}
		
		for(int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {   //Maximum은 최대 일이기 때문에 무조건 31일.
			System.out.printf("%d\t",i);
			if(start % 7 == 0) {
				System.out.println();
			}
			start++;
		}
		
	}

}
