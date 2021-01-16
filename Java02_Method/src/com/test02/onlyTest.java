package com.test02;

public class onlyTest {

	public static void sum(int i, int j) {
		int res = i + j;

		System.out.println(i + "+" + j + "=" + res);
	}

	public static int sub(int i, int j) {

		int res = i - j;
		return res;
	}

	public static double mul(double i, double j) {

		double result = i * j;
		return result;
	}

	public static void div(int i, int j) {

		int mok = i / j;
		int namej = i % j;
		System.out.printf("%d  /%d의 몫 :%d ", i, j, mok);
		System.out.printf("나머지 : %d ", namej);
	}

}
