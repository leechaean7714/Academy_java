package com.test01;

public class onlyTest {

	public static void main(String[] args) {

		prn01();

	}

	public static void prn01() {

		int i = 0;
		while (i <= 10) {
			System.out.println("ㄱ:" + i);
			i++;
			System.out.println("ㄴ:" + i);
			
			if (i % 2 == 0) {

				System.out.println("ㄷ:" + i);
				continue;

			}
			System.out.println("ㄹ:" + i);

		}
	}

}
