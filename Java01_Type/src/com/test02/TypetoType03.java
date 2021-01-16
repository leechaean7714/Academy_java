package com.test02;

public class TypetoType03 {
	
	public static void main(String[] args) {
		
		// boxing : 값 -> wrapper class에 넣는다
		Integer i = new Integer(100);
		System.out.println(i);
		
		//unBoxing : wrapper class -> 값
		// 1) 명시적 - 가져온다고 말하고 가져오는 것
		int j = i.intValue();
		System.out.println(j);
		// 2) 묵시적 - 자동으로 가져와지는 것
		int k = i;
		System.out.println(k);
		
	}

}
