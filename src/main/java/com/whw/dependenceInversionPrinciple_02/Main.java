package com.whw.dependenceInversionPrinciple_02;

/**
 * 依赖倒置原则
 * @author PCCW-whw
 *
 */
public class Main {

	
	public static void main(String[] args) {
		// v1
//		Tom tom = new Tom();
//		tom.studyJavaCourse();
//		tom.studyPythonCourse();
//		tom.studyAiCourse();
		
		// v2
//		Tom tom = new Tom();
//		tom.study(new JavaCourse());
//		tom.study(new PythonCourse());
		
		// v3
//		Tom tom = new Tom(new JavaCourse());
//		Tom tom2 = new Tom(new PythonCourse());
//		tom.study();
//		tom2.study();
		
		// v4
		Tom tom = new Tom();
		tom.setICourse(new JavaCourse());
		tom.study();
		tom.setICourse(new PythonCourse());
		tom.study();
	}

}
