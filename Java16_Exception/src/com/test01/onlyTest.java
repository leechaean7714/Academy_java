package com.test01;

public class onlyTest extends Exception {

	public onlyTest() {
		this("Exception Test");
	}

	public onlyTest(String message) {
		super(message);
	}

}
