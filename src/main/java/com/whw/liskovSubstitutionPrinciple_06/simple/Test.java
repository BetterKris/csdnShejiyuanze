package com.whw.liskovSubstitutionPrinciple_06.simple;

public class Test {

	public static void resize(Rectangle rectangle) {
		while(rectangle.getWeigth() >= rectangle.getHeight()) {
			rectangle.setHeight(rectangle.getHeight() + 1);
			System.out.println("width:"+rectangle.getWeigth()+"，hight:"+rectangle.getHeight());
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
