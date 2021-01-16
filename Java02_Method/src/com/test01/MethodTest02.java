package com.test01;

public class MethodTest02 {
	
	public static void main(String[] args) {
		
		// 메모리 영역 : static / (non-static)
		// static : class.method();
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		// MethodTest01.privateMethod();    
		//invisible 같은 클래스가 아니기 때문에 호츨되지 않음
		// MethodTest01.abc(); undefined 정의되어 있지 않음
		
		
		//(non-static)
		// class 변수 = new class();
		// 변수.method();
		// MethodTest01.nonStaticMethod(); nonStatic은 호출될 수 없음 호출의 방식이 틀림!
		
		MethodTest01 method01 = new MethodTest01();
		method01.nonStaticMethod();
		
		
		
	}

}
