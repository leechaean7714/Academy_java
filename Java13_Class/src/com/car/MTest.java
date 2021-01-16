package com.car;

public class MTest {

	public static void main(String[] args) {
		// car 속도가 10씩 올라가고 내려감
		// sports car는 속도가 15씩 올라가고 내려감
		// truck은 5씩 올라가고 내려감

		Car car1 = new Car();
		car1.accelPedal();
		car1.accelPedal();
		System.out.println(car1);
		car1.breakPedal();
		System.out.println(car1);
		car1.breakPedal();
		System.out.println("------------");
		
		
		Car c = new SportsCar();
		c.aaa();
		System.out.println("1--------------");
		SportsCar sp = (SportsCar)c;
		sp.aaa();
		System.out.println("2--------------");
        Car car2 = new SportsCar("빨간색");
		car2.aaa();
		
		
		car2.accelPedal();
		car2.accelPedal();
		System.out.println(car2);

		car2.breakPedal();
		car2.breakPedal();

		System.out.println("------------");

		Car car3 = new Truck("파란색");
		car3.accelPedal();
		car3.accelPedal();
		System.out.println(car3);
		car3.breakPedal();
		car3.breakPedal();

	}

}
