package com.test01;

import java.util.Scanner;

public class ScannerTest01 {
	
	public static void main(String[] args) {
		
		//test01();
		test02();
		
	}
	
	public static void test02() {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str);
		sc.nextLine(); // next랑 같이 쓸 경우 한 번 쓰는 게 좋음. nextLine은 위의 next에서 쓰고 남은 값도 가져옴. 가지고 오고 그대로 끝! 사용 못함.
		// Advances this scanner past the current line and returns the input that was skipped. This method returns the rest of the current line..
		
		String str2 = sc.nextLine();
		System.out.println(str2);
	}
	
	
	
	
	
	
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 :  ");
		int a = sc.nextInt();
		
		System.out.println("또 입력해 주세요 : ");
		int b = sc.nextInt();
		
		System.out.println(a+b);
		
		
	}

}
