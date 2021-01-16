package com.test02;

import java.util.Random;

public class MTest {
	
	public static void main(String[] args) {
		
		random01();
		random02();
		random03();
		
	}
	
	public static void random01() {
		double d = Math.random(); //0.0 <=Math.random() < 1.0
		System.out.println(d);
		
	}
	
	public static void random02() {
		// (int)(Math.random()*(max - min +1)) + min;
		// (int)(Math.random()*개수) + 시작값;
		
		int max = 10;
		int min = 5;
		int r = (int)(Math.random()*(max - min + 1)) + min;
		System.out.println(r);
	}

	public static void random03() {
		
		Random r = new Random();
		System.out.println(r.nextInt(10));   // 0~10까지의 수를 랜덤으로 int로 만들어줌
		
		
	}
}











