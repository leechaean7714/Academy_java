package com.coffee02;


public class MTest {
	
	// 입력 예)
	// "돈을 넣어 주세요"
	// 10000
	//"커피 몇 잔이 필요하신가요?"
	// 1
	// "커피 1잔이 나왔습니다."
	//"잔돈은 9700원 입니다."
	
	public static void main(String[] args) {
		
		coffeeMachine coffee = new coffeeMachine();
		coffee.inputMoney();
		
		
	}

}
