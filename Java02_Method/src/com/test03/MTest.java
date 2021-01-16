package com.test03;

import com.test02.onlyTest;

public class MTest {
	
	public static void main(String[] args) {
		
		
		// 아규먼트 : method 외부에서 전달되는 값
		MyCalc.sum(1, 7);
		MyCalc.sum(10, 3);
		
		int res = MyCalc.sub(4, 1);
		System.out.println("sub(4, 1) 호출하고 리턴된 결과값 : " + res);
		System.out.println(res);
		
		double result = MyCalc.mul(10.3, 3.6);
		System.out.println("10.3 * 3.6 = " + result);
		
		int i = 10;
		int j = 3;
		MyCalc.div(i,  j);
		
		
		
		
	}

}
