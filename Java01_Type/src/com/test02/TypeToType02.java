package com.test02;

public class TypeToType02 {
	
	public static void main(String[] args) {
		
		//int to char
		int i01 = 65;
		char c01 = (char)i01;
		System.out.println("int to char : " + c01);
		// ascii
		
		// char to int
		char c02 = 'A';
		int i02 = c02 + 1;
		System.out.println(i02);
		System.out.println((char)i02);
		
		char c03 = '1';//문자 1로 찍힌다. +1을 하면 정수형으로 나온다.
	
		char c04 = '2';
		System.out.println((char)(c03 + c04));
		
		// String to int
		String str01 = "65";
		int i03 = Integer.parseInt(str01);
		
		System.out.println(i03 + 1);
		System.out.println("----------------------");
		
		// int to String
		int i04 = 66;
		String s01 = Integer.toString(i04);//66이라는 문자열에 1을 덧붙임.
		String s02 = String.valueOf(i04);
		System.out.println(s01 + 1);
		System.out.println(s02 + 2);

	}

}
