package com.whw.liskovSubstitutionPrinciple_06.principle;

public class Square implements IQuadrangle{

	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHight() {
		// TODO Auto-generated method stub
		return length;
	}

	public int getWeight() {
		// TODO Auto-generated method stub
		return length;
	}
	
	
}
