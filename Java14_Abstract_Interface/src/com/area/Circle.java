package com.area;

import java.util.Scanner;

public class Circle extends AreaImpl {

	@Override
	public void print() {
		System.out.print("원의 ");
		super.print();

	}

	@Override
	public void make() {

		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 길이를 입력해주세요.");
		int r = sc.nextInt();
		double res = (double) (r ^ 2) * 3.14;

		setResult(Double.toString(res));

	}

}
