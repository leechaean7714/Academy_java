package com.test01;

public class MTest02 {
	
	public static void main(String[] args) {
		/*
		 * 1. 아규먼트가 5의 배수면 "5의 배수입니다."라고 출력하는 메서드를 만들자.
		 * 2. 아규먼트가 2의 배수면서 3의 배수면
		 *  "2와 3의 배수입니다."를 출력하고, 아니면
		 *  "2와 3의 배수가 아닙니다."를 출력하는 메서드를 만들자.
		 * 3. 아규먼트가 소문자라면 "소문자 입니다." 를 출력하고,
		 *  대문자라면 "대문자 입니다."를 출력하는 메서드를 만들자.
		 * 파라미터는 char로 하자.
		 *  메서드 3개를 호출하자.
		 */
		
	Test01(10);
	Test02(7);
	Test03('L');
	
	
	}
	
	public static void Test01(int i) {
		
		
		if(i % 5 == 0) {
			System.out.println("5의 배수입니다.");
			} 
		}
		
	public static void Test02(int j) {
		
		if((j % 2 == 0) && (j % 3 == 0)) {
			System.out.println("2와 3의 배수입니다.");
		} else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}

		
	}
	
	public static void Test03(char k) {
		// java.lang.Character 검색
		if (Character.isLowerCase(k)) {
			System.out.println("아규먼트가 소문자입니다.");
		} else if(Character.isUpperCase(k)) {
		 System.out.println("아규먼트가 대문자입니다.");
	
	    }
		
		//ascii 보고 하기
		
	
		
		if (((int)k >= 97) && ((int)k <= 122)) {
			System.out.println("소문자 입니다.");
		} else if(((int)k <= 65) && ((int)k <= 90)) {
			System.out.println("대문자 입니다.");
		}
		
		
	}

 }


		
		
		
		
