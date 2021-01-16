package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 {
	
	public static void main(String[] args) {
		
		MethodTest01.publicMethod();
		// MethodTest01.protectedMethod();  같은 패키지가 아니라 invisible
		// MethodTest01.defaultMethod();
		// MethodTest01.privateMethod();
		
		MethodTest01 test = new MethodTest01();
		test.nonStaticMethod();
		
		// UML : Unified Modeling Language 프로그램 설계를 위한 그림으로 된 표기법(다이아 그램)
		// https://www.objectaid.com/home
		
	}

}
