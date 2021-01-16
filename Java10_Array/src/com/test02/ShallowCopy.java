package com.test02;

import java.util.Arrays;

public class ShallowCopy {
	
	  
	  public static void main(String[] args) {
	  
	  int[] original = {10, 20, 30, 40, 50}; 
	  int[] copy = original;
	  
	  System.out.println(Arrays.toString(original));
	  System.out.println(Arrays.toString(copy));
	  
	  System.out.println(original == copy);
	  
	  copy[0] = 100;
	  
	  System.out.println(Arrays.toString(original));
	  System.out.println(Arrays.toString(copy));
	  
	  
	  
	  // hashcode : 객체의 주소값 System.out.println(original.hashCode());
	  System.out.println(original.hashCode());
	  System.out.println(copy.hashCode()); }
	  
	  
}
