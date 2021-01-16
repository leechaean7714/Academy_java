package com.test01;

public class onlyTest {

	public static void main(String[] args) {

		// stringBufferTest();
		// stringTest();

		String a = "hello, world";
		a += "--bye";
		System.out.println(a);

	}

	private static void stringBufferTest() {

		StringBuffer sb = new StringBuffer();
		sb.append("안녕하세요").append("저는").append("이순신입니다.");

		System.out.println(sb);

	}

	private static void stringTest() {
		String s = " 안녕하세요";
		s += " 저는 ";
		s += " lee june 입니다.";
		// System.out.println(s);
		// System.out.println(s.hashCode());

		s.replace("안녕하세요", "hi!");
		// System.out.println(s);

		s = s.replace("안녕하세요", "hi");
		System.out.println(s);
	}

}
