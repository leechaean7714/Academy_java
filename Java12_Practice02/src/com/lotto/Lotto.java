package com.lotto;

// 1~45 사이의 "중복되지 않는" 난수 7개를 만들고,
// 정렬해서 출력하자.

public class Lotto {
	
	// 로또 배열 생성
	private int[] make() {
		int[] arr = new int[7];
		int index = 0;
		
		while(index < 7) {
			int ran = (int)(Math.random()*45)+1;
			
			if(!isSame(arr, ran)) {
				arr[index] = ran;
				index++;				
			}
			
		}	
		return arr;
	}
	
	// 중복값 판별
	private boolean isSame(int[] arr, int ran) {
		
		boolean same = false;
		
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == ran) {
				same = true;
				break;
			}
		}
		
		return same;
	}
	
	// 정렬
	private void sort(int[] arr) {          // 이렇게 정리하는 알고리즘의 이름은? + 더 많은 정렬 알고리즘들 공부!! 알고리즘의 속도를 비교해서 빠른 걸 사용
		
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[j] < arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
		
		
	}
	
	// 출력
	public void prn() {
		int[] arr = make();
		//Arrays.sort(arr);
		
		sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%3d",arr[i]);
		}
	}
}
