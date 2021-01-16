package com.singleton;

public class MTest {
	
	public static void main(String[] args) {
		
		// Singleton singleton = new Singleton();  private이라 호출 안됨.
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.hashCode());
		
		Singleton st01 = Singleton.getInstance();
		System.out.println(st01.hashCode());
		
		Singleton st02 = Singleton.getInstance();
		System.out.println(st02.hashCode());
		
	}

}
