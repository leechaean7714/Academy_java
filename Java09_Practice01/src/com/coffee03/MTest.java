package com.coffee03;

public class MTest {
	
	// 입력 예)
	// "일반커피 / 고급커피 선택해 주세요."
	//"일반커피 : 1 / 고급커피 : 2"
	// 2
	//"돈을 넣어 주세요."
	//10000
	//"커피 몇 잔이 필요하신가요?"
	// 3
	// "고급 커피 1잔이 나왔습니다."
	// "잔돈은 8500원입니다."
	public static void main(String[] args) {
		
		coffeeMachine coffee = new coffeeMachine();
		coffee.inputMoney();
	}
}
