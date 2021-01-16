package com.point;

import java.util.Scanner;

public class PointLength {
	
	public static void main(String[] args) {
		// (0,0) ~ (x,y)의 거리를 구하자.
		// x와 y는 Scanner를 통해 입력받자.
		Scanner sc = new Scanner(System.in);
		System.out.println("x : ");
		int x = sc.nextInt();
		System.out.println("y : ");
		int y = sc.nextInt();
		prn01(x,y);
		prn02(x,y);
	}
	
	public static void prn01(int x, int y) {
		// z = root(x^2 + y^2)
		double z = Math.sqrt(Math.pow(x,  2) + Math.pow(y,  2));
		
		System.out.printf("(0,0)에서 (%d,%d)까지의 거리는 %.2f입니다.", x, y, z);
			
	}
	
	public static void prn02(int x, int y) {
		System.out.printf("(0,0)에서 (%d,%d)까지의 거리는 %.2f입니다.", x, y, Math.hypot(x, y));
	}

}