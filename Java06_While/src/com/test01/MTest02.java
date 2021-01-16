package com.test01;

public class MTest02 {
	
	public static void main(String[] args) {
		//1. 1~100가지의 숫자를 역순으로 출력하자.
		
		//2. 1~100까지의 숫자 중, 2의 배수만 출력하자.
		// while(){if(?)(syso();}}가 2의 배수라면 출력하자.
		
		//3. 1~100까지의 숫자 중, 7의 배수의 갯수와 총합을 출력하자.
		//갯수를 만드는 변수, 총합 구하는 변수
		
		//prn01();
		//prn02();
		prn03();
		
	}
	
	public static void prn01() {
		
		int i = 100;
		
		while(i > 0) {
			System.out.println(i);
			i--;
		
			}
		}
		
		
	public static void prn02() {
		
		int i = 1;
		
		while(i <= 100) {
			
			if(i % 2 == 0) {
				System.out.println(i + " ");
				
			}
			i++;
		}
		
	}
		
	public static void prn03() {
		
		int i = 1;
	    int count = 0;
	    int sum = 0;
	    
	    while(i <= 100) {
	    	
	    	if(i % 7 == 0) {
	    		
	    		count++;
	    		sum += i;
			}
	    i++;
			
	    }
	    System.out.println("총합 = " + sum);
	    System.out.println("개수 = " + count);

		}
		
	}

		
 
	
	
	
	
	
	
	
	
	
	


