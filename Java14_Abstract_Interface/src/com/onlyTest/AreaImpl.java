package com.onlyTest;

public abstract class AreaImpl implements Area {

	private String result;

	public AreaImpl() {
	}

	@Override
	public void print() {

		System.out.println(Area.PRINT + result);

	}

	@Override
	public abstract void make();

	public void setReslut(String reuslt) {

		this.result = reuslt;
	}

}
