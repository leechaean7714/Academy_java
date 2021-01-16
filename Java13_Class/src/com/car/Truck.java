package com.car;

public class Truck extends Car {
	
	public Truck() {
		System.out.println("truck생성자");
		
	}

	public Truck(String color) {
		super(color);   // 부모의 파라미터 하나짜리 생성자 호출	
	System.out.println("Truck(String color)");
	
}

	// override 재정의
	public void accelPedal() {
	// speed += 5;
	// speed = speed = 5;
		setSpeed(getSpeed() + 5);
		System.out.println("truck:속도가 올라갑니다.");

}

// override 재정의
	public void breakPedal() {
	// speed -= 5
	// speed = speed - 5
	
		setSpeed(getSpeed() - 5);
		if(getSpeed() > 0) {
			System.out.println("truck:속도가 느리게 줄어듭니다.");
		} else {
			System.out.println("truck:멈췄습니다");
			setSpeed(0);
	}
} 


	public String toString() {
		
	return "Truck의 현재 속도는 " + getSpeed() + "입니다.";

}


}
