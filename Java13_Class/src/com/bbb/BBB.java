package com.bbb;

import com.aaa.AAA;

public class BBB extends AAA{
	//상속: 어떤 객체가 있을 떄 그 객체의 
	
	// field
	private int b;
	
	public BBB() {
		//super(); //부모의 생성자를 명시하지 않는 경우, 부모의 기본생성자를 자동 호출
		// -> public AAA()
		
	 System.out.println("BBB() 생성");
	}
	public BBB(int b) {
		//super(b);      // 부모의 생성자 -> public AAA(int ABC)를 호출하는 중.
		this.b = b;
		System.out.println("BBB(int b) 생성");
		
	}
	public BBB(int abc, int b) {
		super(abc);
		this.b = b;
		System.out.println("BBB(int abc, int b) 생성");
	}
	
	// getter & setter
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getSum() {
		// super : 부모 객체
		// this : 나 객체
		int sum = getAbc() + getB();         //굳이 super() / this. 안써도 됨. 상속받으면 부모의 것을 내것처럼 쓸 수 있음(this.getAbc붙일 수 있음)
		return sum;
	}
	
	public void prn() {
		System.out.println("BBB의 prn메서드");
	}
	
	public void pra02() {
		System.out.println("BBB의 prn02메서드");
		
	}

}
