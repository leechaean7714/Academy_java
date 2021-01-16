package com.test01;

public class onlyTest {
	
	
	public static final int TEN = 10;

	public static void main(String[] args) {

		//opr01(3);
	//System.out.println();
		//opr03(TEN,1);
		//opr04();
		//System.out.println(opr04());
		//opr06();
		//System.out.println(opr06());
		opr07();
		
		
	
	}	
	
	public static void opr01(int i) {
		
		//int TEN = 11;
		//int TEN=10;
		
		System.out.printf("%d+%d=%d\n",TEN,i,TEN+i);
		System.out.printf("%d+%d=%d\n",TEN,i,TEN-i);
		System.out.printf("%d+%d=%d\n",TEN,i,TEN*i);
		System.out.printf("%d+%d=%d\n",TEN,i,TEN/i,TEN%i);
		
	}
	
	public static String opr02() {
		
		int i =0;
		System.out.println(i);
		
		i=i+TEN;
		System.out.println(i);
		
		i+=TEN;
		System.out.println(i);
		
		i-=5;
		System.out.println(i);
		
		return "대입연산 끗!";
	}
	
	public static void opr03(int a, int b) {
		
		System.out.println(a);
		System.out.println(a--);
		System.out.println(--a);
		
		int res = a++ + ++a + --a + --b;
		//        8(9)10(10)  9(9)   0 
		System.out.println(res);
	}
	
	public static boolean opr04() {
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true );
		System.out.println(false & false);
		System.out.println("-------------------------------");
		System.out.println(true |true);
		System.out.println(true |false);
		System.out.println(false |true);
		System.out.println(false |false);
		System.out.println("-------------------------------");
		
		System.out.println(true&&true);
		System.out.println(false&&true);
		System.out.println(true&&false);
		System.out.println(false&&false);
		
		int i =8;
		boolean res = (TEN>i)&&(5<i);
		
		return res;
	}
	
	
	public static void opr05() {
		
		System.out.println(true == false);
		System.out.println(5!=6);
	}
	
	public static boolean opr06() {
		
		int a =2;
		int b=3;
		int i =(a>b)?a+b:a-b;
		System.out.println(i);
		
		boolean res = false;
		res =(a<b)?false:true;
		
		String s =(a>b)?"a가b보다 크다.":((a<b)?"a가b보다 크다":"a와 b가 같다.");
		System.out.println(s);
		
		return res;
	}
	
	
	public static void opr07() {
		
		int a =10;
		int b = 2;
		System.out.println(a&b);
		
		System.out.println(a|b);
		
		int c =TEN;
		System.out.println(Integer.toBinaryString(c>>2));
		System.out.println(Integer.toBinaryString(c<<4));
		
		System.out.println(c<<4);
		
		
		
		
		
	}
	
	
}
