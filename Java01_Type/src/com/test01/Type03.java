package com.test01;

public class Type03 {

	// 실수형 리터럴 float(4) double(8)
	// float -> 접미사 f/F
	// double -> 생략 가능, 접미사 d/D

	public static void main(String[] args) {
		float f01 = 0.1f;
		System.out.println(f01);
		float f02 = 1.1f;
		System.out.println(f02);
		float sumF = f01 + f02;
		System.out.println(sumF + " = " + f01 + "+" + f02);
		System.out.println("------------------");

		double d01 = 0.1; // 실수 리터럴 기본 타입
		double d02 = 2.2d;
		double sumD = d01 + d02;
		System.out.println(sumD);// 이진수의 특성상 표현하지 못하는 소수가 존재해 계산 결과가 부정확함을 알 수

	}
}
