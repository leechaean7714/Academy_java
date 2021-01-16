package com.test01;

// 추상 클래스 : 추상 메소드를 하나 이상 가진 클래스
public abstract class Animal {
	
	// 추상 메소드 : 상속 받는 자식 class에서 반드시 구현하도록 강제! 바디가 없는 메소드
	public abstract void bark();
	
	public void eat(String feed) {
		System.out.println(feed + "먹는다");
	}

}
