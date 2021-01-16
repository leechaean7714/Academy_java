package com.test02;

public class Cat extends Animal{
	
	public Cat() {
		System.out.println("고양이");

	}
	
	
	//Override : 재정의 -> 상속받은 부모의 메서드를 확장하거나 변형할 때. 부모의 호출이랑 똑같이 해줘야 함.
	@Override              //anotation : compiler에게 뭔지 알려줘서 작업하기 편하게 해줌
	public void bark(){
		System.out.println("야옹야옹");
	

	}
}
