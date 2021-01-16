package com.test01;

public class MTest01 {

	
	public static void main(String[] args) {
		prn01();
		prn02();
		prn03();
	}
		
		public static void prn01() {
			
				// switch : 해당 case로 jumping 후 fall through / 끊고 싶으면 break;
		int i = 2;
		
		switch(i) {//괄호 안에 있는 변수가... 로 해석
			case 1: 
				System.out.println("1 입니다.");
				break;
			case 2:
				System.out.println("2 입니다.");
				break;
			case 3: 
				System.out.println("3 입니다.");
				break;
			case 4:
				System.out.println("4 입니다.");
				break;
		}
		
	}

	private static void prn02() {
		
		switch(6/2) {
		case 1:
		case 3:
			System.out.println("홀수입니다.");
			break;
		case 2:
		case 4:
			System.out.println("짝수입니다.");
			break;
		default:
			System.out.println("다른 숫자 입니다.");
		}
	}
	
	public static void prn03() {
		char c = 'b';
		
		switch(c) {
		
		case 'a' :
			System.out.println("a 입니다.");
			break;
		case 'b' :
			System.out.println("b 입니다.");
			break;
		case 'c' :
			System.out.println("c 입니다.");
			break;
		}
	}
		
		
}

