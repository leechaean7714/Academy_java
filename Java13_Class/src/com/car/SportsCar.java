package com.car;

public class SportsCar extends Car {
	
	public SportsCar() {
		//super();
	System.out.println("sportscar 생성자");
						
	}
	
	public SportsCar(String color) {
		super(color);   // 부모의 파라미터 하나짜리 생성자 호출	
		System.out.println("sportcar(String color)");
		
	}
	public void aaa() {
		System.out.println("sportcar.aaa");
	}
	// override 재정의
	public void accelPedal() {
		// speed += 15;
		// speed = speed = 15;
		setSpeed(getSpeed() + 15);
		System.out.println("sports:속도가 올라갑니다.");
 
	}
	
	// override 재정의
	public void breakPedal() {
		// speed -= 15
		// speed = speed - 15
		
		setSpeed(getSpeed() - 15);
		if(getSpeed() > 0) {
			System.out.println("sport:속도가 빠르게 줄어듭니다.");
		} else {
			System.out.println("sport:멈췄습니다");
			setSpeed(0);
		}
	} 
	
	
	public String toString() {
		return "SportsCar의 현재 속도는 " + getSpeed() + "입니다.";
	
	}
	

}
