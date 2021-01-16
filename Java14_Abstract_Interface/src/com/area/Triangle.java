package com.area;

import java.util.Scanner;

public class Triangle extends AreaImpl {

	@Override
	public void print() {
		System.out.print("삼각형의 ");
		super.print();
		
		

	}

	@Override
	public void make() {
		
    Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("높이를 입력해주세요.");
		int y = sc.nextInt();
		
		double res = x * y / 2.0;
		
		setResult(Double.toString(res));
		//setResult(String.valueOf(res))
		//setResult(res + "")
		
		

	}

}
