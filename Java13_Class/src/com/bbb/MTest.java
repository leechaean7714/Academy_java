package com.bbb;

import com.aaa.AAA;

public class MTest {

	public static void main(String[] args) {
		// 여기서 AAA,BBB 의 객체 생성
		BBB b1 = new BBB();// AAA() 생성
							// BBB() 생성

		b1.setAbc(1);
		b1.setB(2);

		System.out.println(b1.getAbc() + " + " + b1.getB() + " = " + b1.getSum());
		System.out.println("-----------------------");

		
		
		BBB b2 = new BBB(3);

		System.out.println(b2.getAbc() + " + " + b2.getB() + " = " + b2.getSum());

		System.out.println("-----------------------");

		
		
		BBB b3 = new BBB(4, 5);
		System.out.println(b3.getAbc() + " + " + b3.getB() + " = " + b3.getSum());

		System.out.println("-------------------------");

		
		
		AAA a1 = new AAA();
		System.out.println("AAA-----------------------------");

		
		
		AAA a2 = new BBB(); // 부모는 자식객체를 받을 수 있음. = 다형성
	
		System.out.println("11111111----------------------------------");
		// BBB b4 = (BBB) new AAA(); //자식은 부모를 품을 수 없음.
		// a1.prn();
		a2.prn();

		// b4.getSum();

	}

}
