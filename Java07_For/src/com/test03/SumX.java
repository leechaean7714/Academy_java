package com.test03;

public class SumX {
	/*
	 * 1  2  3  4  5 
	 * 6  7  8  9  10 
	 * 11 12 13 14 15
	 * 16 17 18 19 20 
	 * 21 22 23 24 25 
	 * 
	 * X의 총 합 and X의 평 균
     */

	public static void main(String[] args) {

		prn();

	}

	public static void prn() {

		int count = 1; // 1씩 증가하면서 1부터 25까지 출력하는 변수
		int sum = 0; // x 카운트 값을 더해놓을 변수

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if ((i == j) || (i + j == 4)) {
					// sum = sum + count;
					
					sum += count;
				}

				System.out.printf("%3d", count++); // 후위연산자:EX)3(4)

			}
			System.out.println();

		}
		System.out.println("총 합 : " + sum);
		System.out.println("평 균 : " + sum / 9.0);
	}
}