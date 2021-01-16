package com.coffee03;

import java.util.Scanner;

public class coffeeMachine {

	// 입력 예)
	// "일반커피 / 고급커피 선택해 주세요."
	// "일반커피 : 1 / 고급커피 : 2"
	// 2
	// "돈을 넣어 주세요."
	// 10000
	// "커피 몇 잔이 필요하신가요?"
	// 3
	// "고급 커피 1잔이 나왔습니다."
	// "잔돈은 8500원입니다."

	public void inputMoney() {

		Scanner sc = new Scanner(System.in);
		
		int money = 0;   // 어디다 설정할지는 자기 선택
		int count = 0;
		int select = 0;
		int price = 0;

		System.out.println("1. 일반커피(300) / 2. 고급커피(500) \n 일반커피는 1 / 고급커피는 2 선택");
		select = sc.nextInt();
		
		switch(select) {
		case 1:
			price = 300;
			break;
		case 2:
			price = 500;
			break;
		}
		System.out.println("돈을 넣어 주세요.");
		money = sc.nextInt();
		
		System.out.println("잔 수를 입력해주세요.");
		count = sc.nextInt();
		
		if(select == 1 && money >= 300) {
			coffeeMake(money, count, price);
		} else if (select == 2 && money >= 500) {
			coffeeMake(money, count, price);
		} else {
			System.out.println("잔액이 부족합니다.");
			System.out.printf("잔돈은 %d원 입니다.\n", money);
		}


	}
	
	private void coffeeMake(int money, int count, int price) {
		
		int change = money - (count * price);
		if(change > 0) {
			System.out.printf("커피 %d 잔이 나왔습니다.\n",count);
			System.out.printf("잔돈은 %d 원 입니다.\n", change);
		} else {
			
		}
		
	}
	
	
	
	
	
/*
	private void general(int money, int count) {

		int change = money - (count * 300);

		if (change >= 0) {
			System.out.printf("커피 %d 잔 나왔습니다.\n", count);
			System.out.printf("잔돈은 %d 원 입니다.\n", change);
		} else {
			System.out.println("금액이 부족합니다.");
			System.out.printf("잔돈은 %d 원 입니다.\n", money);

		}
	}

	private void expensive(int money, int count) {

		int change = money - (count * 500);

		if (change >= 0) {
			System.out.printf("커피 %d 잔 나왔습니다.\n", count);
			System.out.printf("잔돈은 %d 원 입니다.\n", change);
		} else {
			System.out.println("금액이 부족합니다.");
			System.out.printf("잔돈은 %d 원 입니다.\n", money);

		}
	}
	
	*/
}