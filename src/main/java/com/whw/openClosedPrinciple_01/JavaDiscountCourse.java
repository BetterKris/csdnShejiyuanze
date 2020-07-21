package com.whw.openClosedPrinciple_01;

public class JavaDiscountCourse extends JavaCourse{

	public JavaDiscountCourse(Integer id, String name, Double price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}
	
	public Double getDiscountPrice() {
		return super.getPrice() * 0.2;
	}
}
