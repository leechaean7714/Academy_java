package com.test03;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("5");
		set.add("2");
		set.add("7");
		set.add("4");
		set.add("4");
		set.add("3");
	    //System.out.println(set);
	    //setFind(set, "5");
	    setDelete(set, "5");
	
	
	}

	public static void setDelete(Set<String>set, String del) {     // 해당 값을 삭제
		for(String d : set) {
			if(d.contentEquals(del)) {
				set.remove(del);
				System.out.println(d + " 지웠다!");
				break;
			}
		}
		
	}
	
	public static void setFind(Set<String>set, String find) {      // 해당 값이 있는지 없는지 찾기
	
		for(String f : set) {
			if(f.equals(find)) {
				System.out.println(f + " 찾았다!");
			}
		}
	}
}
