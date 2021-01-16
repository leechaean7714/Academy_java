package com.test01;

import java.util.Arrays;

public class onlyTest {

	public static void main(String[] args) {

		// 1

		int[] arr = new int[5];

		// 2
		for (int i = 0; i < 4; i++) {

			arr[i] = (int) (Math.random() * 5) + 5;
			// System.out.println(Arrays.toString(arr));
		}
		System.out.println("1:" + Arrays.toString(arr));

		// 3
		int tmp = 1;
		for (int i = 0; i < 4; i++) {

			tmp *= arr[i];
			arr[4] = tmp;

		}
		System.out.println("2:" + tmp);

		// 4
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%3d,", arr[i]);

		}
		System.out.println();

		// 5.
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			count += arr[i];
		
			

		}
		System.out.println("5:" + count);

	}

}
