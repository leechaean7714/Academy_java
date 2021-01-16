package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest {
	
	public static void main(String[] args) {
		
		File fi = new File("C:/test_io");
		
		if(fi.exists()) {
			System.out.println("exists!");
		} else {
			System.out.println("new!");
			fi.mkdirs();          // make directory
		}
		
		File fic1 = new File(fi,"AA");
		fic1.mkdir();
		
		File fic2 = new File("c:/test_io", "BB");
		fic2.mkdir();
		
		File fitxt = new File(fic1, "a.text");
		try {            // checked exception : 컴파일 할 때 자바가 알려주는 예외처리
			fitxt.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
