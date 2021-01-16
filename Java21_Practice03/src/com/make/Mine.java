package com.make;

import java.util.Random;

public class Mine {

	private int size;
	private String[][] arr;

	public Mine() {
		size = 10;
	}

	public Mine(int size) {
		this.size = size;
	}

	public String[][] make() {
		arr = new String[size][size];

		fillTheZero();
		randomMine();
		cntMine();

		return arr;

	}

	private void fillTheZero() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = "0";
			}
		}
	}

	private void randomMine() {
		int cnt = size;

		while (cnt != 0) { // cnt는 0이 아니기 때문에 참이라 값이 돌아간다.

			int ranX = (int) (Math.random() * size);
			int ranY = (int) (Math.random() * size);

			if (!arr[ranX][ranY].equals("*")) { // 이미 폭탄이 있는 자리에 폭탄이 생기지 않게 하기 위해
				arr[ranX][ranY] = "*";
				cnt--;
			}
		}
	}

	public void prn() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3s", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void cntMine() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (!arr[i][j].equals("*")) {
					arr[i][j] = String.valueOf(count(i, j)); // String배열을 int형으로 or Integer.toString도 가능

				}
			}
		}
	}

	private int count(int x, int y) {
		int cnt = 0;

		for (int i = x - 1; i <= x + 1; i++) { // = 꼭 확인
			for (int j = y - 1; j <= y + 1; j++) {
				if (i < 0 || j < 0) {
					continue;
				}
				if (i > arr.length - 1 || j > arr.length - 1) {
					continue;
				}
				if (arr[i][j].equals("*")) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
