package com.whw.dependenceInversionPrinciple_02;

public class Tom {
	//v1
//	public void studyJavaCourse(){
//		System.err.println("Tom正在学习Java");
//	}
//	public void studyPythonCourse(){
//		System.err.println("Tom正在学习Python");
//	}
//	public void studyAiCourse(){
//		System.err.println("Tom正在学习Ai");
//	}
	
	//v2
//	public void study(ICourse iCourse) {
//		iCourse.study();
//	}
	
	//v3
//	private ICourse iCourse;
//	public Tom(ICourse iCourse){
//		this.iCourse = iCourse;
//	}
//	public void study() {
//		iCourse.study();
//	}
	
	//v4
	private ICourse iCourse;
	public void setICourse(ICourse iCourse) {
		this.iCourse = iCourse;
	}
	public void study() {
		iCourse.study();
	}
}
