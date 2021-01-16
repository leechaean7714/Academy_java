package com.test01;
//javac는 오라클의 자바 개발 키트에 포함된 주요 자바 컴파일러이다. 
//이 컴파일러는 자바 언어 사양을 충족하는 소스 코드를 받아들인 다음 자바 가상 머신 사양을 충족하는 바이트코드를 생성한다. 
//javac는 자바로 자체 작성되어 있다. 
/**
 * javadoc test <br>
 * "Hello, World!" 를 출력하는 class <br><br> 
 * 
 * javac 만드는 방법<br>
 * project 우클릭 - export - javadoc - %JAVA_HOME%\bin\javadoc.exe <br>
 * 
 * @author 이채안
 *
 */
public class Type01 {
	/**
	 * main method : 프로그램의 주 진입점 (프로그램 시작시 가장 먼저 실행됨!)
	 * 
	 * @param args 기본 파라미터
	 */
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		// 한 줄 주석 : 설명 -> 이 코드를 보는 "사람"을 위한
		/*
		 * 여러 줄 주석 
		 */
	}
	
	// ms949, euc-kr : 한글 완성형
	// utf-8 : 유니코드형 
	

	
}
