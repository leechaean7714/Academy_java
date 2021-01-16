package com.test02;

public class onlyTest {
	
	
	static int size=30;
	public int fruitCount=5;
	private String fruitName;
	
    public void setting(String name, int cnt) {
    	fruitName = name;
    	fruitCount += cnt;
    	
    	basketPrn();
    	
    	
    }
    
    private void basketPrn() {
    	
    	String res = (size>=fruitCount)?fruitName+"의 갯수는"+fruitCount+"개 입니다":"바구니가 작습니다.";
    	
    	System.out.println(res);
    }
	

	
	
	public static void main(String[] args) {
		onlyTest b = new onlyTest();
		b.setting("banana", 30);
		/*	
		
		onlyTest.size=100;
		b.size=50;
		System.out.println(b.size);
		
		b.fruitCount=100;
		System.out.println(b.fruitCount);
		
		
		
		onlyTest appleBasket = new onlyTest();
		appleBasket .setting("apple", 30);
		
		System.out.println(onlyTest.size);
		System.out.println(appleBasket.fruitCount);
		
	*/	
		
		
	}
	
	
	
}
