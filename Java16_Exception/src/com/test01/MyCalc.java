package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalc {
	
	public int inputNum() {
		int n = 0;
		
		System.out.println("숫자만 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		return n;
		
	}
	
	public int calculation() {
		int res = 0;
		
		while(true) {
			try {                                    // 예외가 발생할 수 있는 명령들
				res = inputNum() / inputNum();
				
				String a = "10";                   // "10a"
 				int i = Integer.parseInt(a);
				
				System.out.println(res);
				break;
			} catch(InputMismatchException e) {         // res = inputNum() / inputNum(); 예외
				// e.printStackTrace(); 오류를 stack구조로 출력
				System.out.println("숫자 입력 에러");
			} catch(NumberFormatException e) {          // int i = Integer.parseInt(a); 예외
				System.out.println("숫자 변환 에러");
				e.printStackTrace();
			
			} finally {           // 예외와 상관없이 무조건 넘어감. 마지막에 수행되어야 하는 명령문.
				System.out.println("---------------------------");
			}
		}
		
		return res;
	}

}
