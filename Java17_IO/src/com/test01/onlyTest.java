package com.test01;

import java.io.File;
import java.io.IOException;

public class onlyTest {

	public static void main(String[] args) {
		File fi = new File("C:/test01_io");

		if (fi.exists()) {
			System.out.println("exists");
		} else {
			System.out.println("new!");
			fi.mkdirs();
		}
		
		File fic1 = new File(fi,"AA");
		fic1.mkdir();
		
		File fic2 = new File("C:/test01_io","BB");
		fic2.mkdir();
		
		File fitxt = new File(fic1,"a.text");
		
		try {
			fitxt.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
