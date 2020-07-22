package com.whw.liskovSubstitutionPrinciple_06.principle;

import com.whw.liskovSubstitutionPrinciple_06.simple.Rectangle;

public class Test {

	public static void resize(IQuadrangle rectangle) {
		while(rectangle.getWeight() >= rectangle.getHight()) {
//			rectangle.setHeight(rectangle.getHight() + 1);
			System.out.println("width:"+rectangle.getWeight()+"，hight:"+rectangle.getHight());
		}
	}
	
	public static void main(String[] args) {
//		Rectangle rectangle = new Rectangle();
//		rectangle.setHeight(10);
//		rectangle.setWeigth(20);
//		resize(rectangle);
		
		Square square = new Square();
		
	}
	
}
