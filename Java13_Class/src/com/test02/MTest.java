package com.test02;

public class MTest {

	public static void main(String[] args) {
		/*
		 * Cat cat = new Cat(); 
		 * cat.bark(); 
		 * Dog dog = new Dog(); 
		 * dog.bark(); }
		 */
		// 부모를 만들어놓으니 자식들을 맘대로 만들어서 활용할 수 있게 됨

		Animal some = null;
		
		some = new Dog();
		some.bark();
		System.out.println("---------------------------------------");
		some = new Cat();
		some.bark();
		System.out.println("---------------------------------------");

		// some이라는 애가 Dog타입의 객체라면(instance의 값이라면)
		if (some instanceof Dog) {
			System.out.println("멍멍이다!");

		} else if (some instanceof Cat) {
			System.out.println("고양이다!");

		}
		
		Animal am = new Cat();
		Cat cc = (Cat)am;
	}

}

/*
 *  다형성 polymorphism
 * 1. 부모(선조)의 타입으로 자식(후손)객체 생성할 수 있다.
 * Parent p = new Child();
 * 
 * 2. 부모의 타입으로 자식 대입 가능
 * Child c = new Child();
 * Parent p = c;
 * 
 * 3. 부모의 메서드를 통해 자식 메서드 호출
 * 
 *  * 같은 부모클래스를 가지고 있는 자식 클래스는 컴파일 시 형 변환이 가능하지만, 런타임 시 ClassCastException을 발생시킨다.
 *  (자식끼리 casting이 되지 않는다.)
 * 
 */

