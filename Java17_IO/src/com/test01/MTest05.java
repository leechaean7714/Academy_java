package com.test01;

import java.io.File;

public class MTest05 {
	
	public static void main(String[] args) {
		File fi = new File("c:\\");
		// prn01(fi);
		prn02(fi);
	}
	
	public static void prn01(File fi) {
		for(String list : fi.list()) {
			System.out.println(list);
		}
		
	}
	
	public static void prn02(File fi) {
		
		int dirCnt = 0;
		int fileCnt = 0;
	
		
		for(File f : fi.listFiles()) {   // listFiles : 디렉토리의 파일목록(디렉토리 포함)을 File배열로 반환
			if(f.isDirectory()) {
				dirCnt++;
				System.out.println("dir : " + f.getName());
			} else if(f.isFile()) {
				fileCnt++;
				System.out.println("file : " + f.getName());
			}
		}

	System.out.println("dir의 총 개수" + dirCnt);
	System.out.println("file의 총 개수" + fileCnt);
		
	}
}

// file : java.io.File io api 참고
// 맨 마지막
// dir(folder)의 총 개수 : 개
// file의 총 개수 : 개
