package com.TV;

public class MTest {
	
	public static void main(String[] args) {
		SamsongTV samsong = new SamsongTV();
		samsong.volumeup();
		samsong.volumdown();
		System.out.println(samsong.getVolume());
		
		IgTV ig = new IgTV();
		ig.volumeup();
		ig.volumeup();
		ig.volumdown();
		System.out.println(ig.getVolume());
		
		
		
	}

}
