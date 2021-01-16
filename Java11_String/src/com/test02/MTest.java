package com.test02;

public class MTest {
	
	public static void main(String[] args) {
		stringTest();
		//stringBufferTest();
		
	}
	
	private static void stringBufferTest() {
		// mutable : 값이 변한다.
		StringBuffer sb = new StringBuffer();
		sb.append("안녕하세요")
		  .append("저는")
		  .append("이순신 입니다.");        // method chaining 메소드가 계속 연결
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}
	
	public static void stringTest() {
		String s = "안녕하세요";
		s += " 저는  ";
		s += "전영태 입니다.";
		
		System.out.println(s);
		System.out.println(s.hashCode());
		
		s.replace("안녕하세요.", "하이!");
		System.out.println("s:"+s);
		s = s.replace("안녕하세요", "하이!");
		System.out.println(s);
		
	}

}
