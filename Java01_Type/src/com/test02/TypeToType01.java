package com.test02;

public class TypeToType01 {
	
	public static void main(String[] args) {
		// 형변환
		
		// 묵시적 형변환 (upCasting / promotion) : 작은 타입 -> 큰 타입 / 특별히 말하지 않아도 자동으로 변환
		byte b01 = 100;
		int i01 = b01;
		System.out.println(i01);
		
		// 명시적 형변환 (downCasting / casting) : 큰 타입 -> 작은 타입
		int i02 = 100;
		byte b02 = (byte)i02; // 작은 값이 큰 값에 들어갈 수 있는지 확인
		System.out.println(b02);
		
	}

}
