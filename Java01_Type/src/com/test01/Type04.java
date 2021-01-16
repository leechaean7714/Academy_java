package com.test01;

public class Type04 {

	// 문자형, 문자열, 논리형
	public static void main(String[] args) {
		
		//문자형 ''. 하나만 가질 수 있기 때문에 문자를 더할 수 없다//char(2)boolean(1)
		char c01 = 'a';
		System.out.println(c01);
		char c02 = 'b';
		System.out.println(c02);
		System.out.println(c01+c02);
		char sumC =  (char)(c01 + c02);
		System.out.println(sumC);
		/*
		// 문자열 ""
		String s01 = "a";
		String s02 = "bc";
		String sumS = s01 + s02;
		System.out.println(sumS);
		
		// unicode도 가능
		char lastName = '\uc804';
		System.out.println(lastName);
		String firstName = "\uc601\ud0dc";
		System.out.println(firstName);
		
		System.out.println("--------------------");
		
		// 논리형
		boolean bl01 = true;
		boolean bl02 = false;
		System.out.println(bl01);
		System.out.println(bl02);
		*/
		
		
	}
}
