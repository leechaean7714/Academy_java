package com.plus;

import java.util.Scanner;

public class MTest {
	
	public static void main(String[] args) {
		//??두 자리 이상 숫자를 입력하면 각 자릿수를 모두 더해서 리턴받아 출력하자.
		//별개문제??4자리 숫자 입력 받고 모두 더해서 출력
		//for, while문으로 만들어보기
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		System.out.println(plus(input));
		System.out.println(plusFor(input));
		System.out.println(plusWhile(input));
		
		
	}
	public static int plusFor(int i) {
		
		int sum = 0;
		
		for(int target = i; target > 0; target/= 10) {
			sum += target%10;
			
			//sum=sum+target%10
			
		}
				
		return sum;
	}
	
	public static int plusWhile(int i) {
		
		int target = i;
		int sum = 0;
		
		while(target > 0) {
				sum += target%10;
		}
		
		return sum;
	}
	
	public static int plus(int i) {
		
		int a = (i/1000)%10;
		int b = (i/100)%10;
		int c = (i/10)%10;
		int d = (i/1)%10;
				
		
		return a + b + c + d;
		
	}


		
		
		
	
	
}
