package com.test01;

import java.util.Arrays;

public class MTest01 {

	// Array : 같은 타입의 여러개의 값을 효과적으로 관리하기 위한 객체
	//
	public static void main(String[] args) {
		// 방법 1
		int[] a; // 변수 선언
		a = new int[5]; // 정의
						// 초기화
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		// 방법 2
		// 선언 정의 초기화
		int[] b = new int[] { 6, 7, 8, 9, 10 };
		// System.out.println(b[1]);

		// 방법 3
		// 선언 초기화
		int c[] = { 11, 12, 13, 14, 15, 16, 17 };

		// System.out.println(a[1] + c[6]);

		// System.out.println(c); //[I@15db9742 해당 값의 주소값
		// prn(c);
		// System.out.println(Arrays.toString(c));

		String[] s = new String[] { "have", "a", "nice", "day" };
		//test(s);
		prn(c);
	}

	public static void test(String[] arr) {

		// nice -> good으로 바꾸고
		
		// [have, a, good, day]로 출력하자.
		// 단, Arrays 클래스를 사용하지 말 것!

		arr[2] = "good";

		System.out.print("[");

		for (int i = 0; i < arr.length; i++) {
			//arrays.length:마지막 원소의 인덱스 값보다 1큰수를 반환한다.(why? 바로 전까지 출력하려고.)
			//String.length:문자열의 길이를 반환한다.

			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}

		}
		System.out.println("]");
	}

	public static void prn(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%3d", arr[i]);
		}
	}

}
