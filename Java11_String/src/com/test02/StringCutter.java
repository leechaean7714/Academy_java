package com.test02;

import java.util.StringTokenizer;

public class StringCutter {
	
	public static void main(String[] args) {
		
		String str = "The String class represents character strings.";
		
		// 1.
		System.out.println(str.substring(4,10));
		
		// 2. 
		String[] tmp = str.split(" ");    //공백으로 나눔
		System.out.println(tmp[1]);
		
		// 3.
		String str2 = "represents.character.strings.";
		StringTokenizer st = new StringTokenizer(str2, ".");
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
	}

}
