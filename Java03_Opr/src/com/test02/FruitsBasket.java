package com.test02;

public class FruitsBasket {
	
	// field(전역변수) : 클래스의 속성
	static int size = 30; // 문제에서는 30 안넣음
    public int fruitCount = 5;
    private String fruitName;
      
	/*class diagram을 보고 FruitsBasket class를 작성하자
	 * -fruitCount의 초기값은 5이다.
	 * -setting 메소드를 호출할 때, size 변수에 30을 대입하자.
	 * -setting 메소드의 String 파라미터는 과일의 이름을 받아서 
	 *  fruitName 변수에 대입하고,
	 * int 변수는 과일의 갯수를 받아서 fruitCount 변수에 더해서 대입하자(+=)
	 * 
	 * -basketPrn 메소드는 size와 fruitCount의 값을 비교해서,
	 * size가 크거나 같으면 과일이름+"의 갯수는 "+갯수+"입니다."
	 *  작으면 "바구니가 꽉 찼습니다."를 출력한다. 
	 */
	
	// method : class의 기능
	public void setting(String name, int cnt) {
		
		//size = 30;
		fruitName = name;
		fruitCount += cnt;
		// fruitCount = fruitCount + cont;
		
		basketPrn();
		
	}
	
	private void basketPrn() {
		String res = (size >= fruitCount)? fruitName+"의 갯수는 " + fruitCount + " 개 입니다." : "바구니가 꽉 찼습니다.";
		System.out.println(res);
		
		
		}
	

}
