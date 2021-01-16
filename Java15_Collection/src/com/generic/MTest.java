package com.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MTest {
	
	public static void main(String[] args) {
	/*	
		List<Integer> list = new ArrayList<Integer>();   //<> 컬렉션 안에 들어가는 값의 타입을 강제 : 의도치 않는 에러를 방지하기 위해
		// List list = new ArrayList();
		//list.add("1");
		list.add(2);
		//list.add('c');
		list.add(null);     // 컬렉션 안에 null값을 넣을 수는 있으나 nullPointException이 뜰 수 있기 때문에 최대한 지양하는게 좋음
		list.add(3);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	*/	
		
		Emp<String> samsong = new Emp<String>();
		samsong.setEname("홍길동");
		samsong.setEmpno("dev0015");
		
		Emp<Integer> ig = new Emp<Integer>(19019, "이순신");
		
		Emp dhit = new Emp("abcd", "김선달");
		System.out.println(samsong);            
		System.out.println(ig);
		System.out.println(dhit);
		
	}

}
