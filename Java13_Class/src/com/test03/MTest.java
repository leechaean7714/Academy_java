package com.test03;

public class MTest {
	
	public static void main(String[] args) {
		MyCalc calc = new MyCalc();
		
		System.out.println(calc.sum(1, 2));
		System.out.println(calc.sum(3.45,  5.67));
		System.out.println(calc.sum(8, 9,10));
	}

}
// 오버로딩 할 때는 파라미터 타입, 개수가 모두 달라야 함.