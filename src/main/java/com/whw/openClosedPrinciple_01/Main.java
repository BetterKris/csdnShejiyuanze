package com.whw.openClosedPrinciple_01;

/**
 * 开闭原则
 * @author PCCW-whw
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICourse iCourse = new JavaDiscountCourse(1, "Java架构", 1180.0);
		JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)iCourse;
		System.out.println(javaDiscountCourse.getPrice());
		System.out.println(javaDiscountCourse.getDiscountPrice());
	}

}
