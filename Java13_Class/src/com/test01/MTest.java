package com.test01;

public class MTest {
	
	public static void main(String[] args) {
		AA a = new AA();
		
		Super s = a;
		
		// BB b = (BB)s;
		// 부모는 자식이 몇인지 알 수 없다. 자식들끼리 casting 할 수 없다.
		
		System.out.println(a.hashCode());
		System.out.println(s.hashCode());
		
	}

}
