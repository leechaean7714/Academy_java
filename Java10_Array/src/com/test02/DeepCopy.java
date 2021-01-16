package com.test02;

import java.util.Arrays;

public class DeepCopy { // 깊은 값 복사

	public static void main(String[] args) {
/*
		// 방법 1. 배열 인덱스의 값을 가져와서 복사
		int[] original = { 10, 20, 30, 40, 50 };
		int[] copyOne = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			copyOne[i] = original[i];//순서를 바뀌면 안되는 이유:변수는 값이라서 
		}
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne));
		System.out.println(original == copyOne);//주소값이 다름.
		
		copyOne[0] = 100;
		
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyOne));
		
		System.out.println("--------------------------------------");
		
		// 방법 2. original한테 요청하여 복사
		int[]copyTwo = original.clone();
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copyTwo));
		System.out.println(original == copyTwo);
		
		// 방법 3. System을 사용하여 복사
		// System.arrayCopy(원본 배열 객체, 원본 시작 위치, 복사 배열 객체, 복사 시작위치, 복사할 개수);
		
		int[] copyThree = new int[5];
		Arrays.fill(copyThree, 4);     // Arrays.fill해당 배열에 내가 원하는 값으로 꽉 채우자는 의미
		System.out.println(Arrays.toString(copyThree));
		System.arraycopy(original, 0, copyThree, 2, 2);
		System.out.println(Arrays.toString(copyThree));
		
		System.out.println("--------------------------------------");

		System.out.println(original.hashCode());//hashCode():두 객체가 같은 객체인지 확인하는 Method입니다
		System.out.println(copyOne.hashCode());
		System.out.println(copyTwo.hashCode());
		System.out.println(copyThree.hashCode());
		
*/
		
		
		int[] original = {10,20,30,40,50};
		int[] copyOne = new int[original.length];
		
		for (int i = 0; i < original.length; i++) {
			
		}
		
		
		
	}

}
