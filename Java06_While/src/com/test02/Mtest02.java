package com.test02;

public class Mtest02 {
	
	public static void main(String[] args) {
		
		prn();
	}
	
	public static void prn() {
		
		int i = 0;
		
		while(i <= 10) {//조건식으로 돌아간다.
			i++;
			if(i%2 == 0) {
				continue; //지우면 여기도 찍힘..... 잊지 말자.
			}
			System.out.println(i);
			
			
		}
		
		
	}

		
}
