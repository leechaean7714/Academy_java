package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest02 {
	
	public static void main(String[] args) {
		
		File fi = new File("a.txt");
		
		try {
			myOutput(fi);            //예외처리 한번에
			myInput(fi);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	// read() 
	private static void myInput(File fi) throws IOException {
		FileReader fr = new FileReader(fi);
		
		int ch;
		
		while((ch = fr.read()) != -1) {     // -1 = 파일의 끝
			System.out.print((char)ch);
			
		}
		
		fr.close();

		
	}
	
	// write()
	private static void myOutput(File fi) throws IOException {     //throws 예외를 전달시킴
		FileWriter fw = new FileWriter(fi, false);        //true면 계속 출력. false면 한번에 끝.
		fw.write("연습중이니다.\n");
		fw.append("abc\n").append("def\n").append("ghi\n");
		
		fw.close();
		
	}

}
