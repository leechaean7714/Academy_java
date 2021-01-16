package com.test02;

public class Gugu {
	
public static void main(String[] args) {
		
		gugu01();
		//gugu02();
		gugu03();
		
	}
	
	public static void gugu01() {
		// 2단 ~ 9단까지 전체 출력 (for)
		
		for(int i = 2 ; i <= 9 ; i ++) {
			System.out.println("<"+i+"단>");
			
			for(int j = 1 ; j <= 9 ; j ++) {
				
				System.out.printf("%d * %d = %d \n", i, j, i * j);
			}
			
			// System.out.println();단과 단 사이를 띄우기 위해
			
		}
		
	}
	
	public static void gugu02(int i) {
		
		// i단만 출력 (for)
		System.out.printf(" <%d단> \n", i);
		for(int j = 2; j <= 9 ; j ++) {
			//System.out.println(i + "*" + j +"=" + (i*j));  i*j 괄호 쳐야 괄호 안이 먼저 계산
			System.out.printf("%d * %d = %d \n", i, j, i * j);
		}
	}
	
	public static void gugu03() {
		// 2단 ~ 9단까지 전체 출력 (while)
		int i = 2;
		int j = 1;

		while(i < 10) {
		System.out.printf(" <%d단> \n", i);
		        while(j < 10) {
				System.out.printf("%d * %d = %d \n", i, j, i * j);
				j++;
				
			}
			
		    j=1;
			i++;
			// System.out.println();
		}
		
	}

}


