package com.test02;

public class Mtest01 {
	
	/*
	 * A B C D E
	 * F G H I J 
	 * K L M N O
	 * P Q R S T
	 * U V W X Y
	 * Z
	 */
	public static void main(String[] args) {
		
		
		int count = 0;
		char c = 'A';
		boolean stop = false;
		
		while(!stop) {//이안에서 계속 돈다.
			while(true) {//while(true):특정 조건을 만족할 때까지 반복문을 시행.
				System.out.printf("%2c",c);
				c++; //아스키코드값
				count++;
				
				if(count % 5== 0) {
					break;
				}
				
				if(count==26) {
					stop = true;
					break;
				}
			}
			
			System.out.println();
			
			
		}
		
		
		
	}

}
