package com.whw.liskovSubstitutionPrinciple_06.simple;

public class Square extends Rectangle{

	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return getLength();
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		setLength(height);
	}

	@Override
	public int getWeigth() {
		// TODO Auto-generated method stub
		return getLength();
	}

	@Override
	public void setWeigth(int weigth) {
		// TODO Auto-generated method stub
		setLength(weigth);
	}
	
	
	
}
