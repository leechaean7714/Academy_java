package com.test01;

import java.util.Vector;

public class VectorTest01 {
	
	/* VECTOR
	   -Java 언어에서 배열은 생성할 때 크기를 결정할 수 있어야 한다.
       -하지만 미리 크게 설정하면 메모리 효율을 떨어지고 작게 설정하면 충분한 개체를 보관할 수 없다.
       -Vector는 확장 가능한 배열로 저장소가 꽉 차면 자동으로 저장소의 크기를 늘려주기 때문에
               유연하게 사용할 수 있다.

	 */
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(10,5);
		System.out.println(v.size() + " : " + v.capacity());
		System.out.println("---------------------------");
		
		for(int i = 0; i < 1510; i++) {
			v.add(i);
			System.out.println(v.size() + " : " + v.capacity());
		}
		System.out.println("------------------");
		v.add(10);
		System.out.println(v.size() + " : " + v.capacity());
	}

}
