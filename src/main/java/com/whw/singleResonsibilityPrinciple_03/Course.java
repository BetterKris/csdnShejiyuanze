package com.whw.singleResonsibilityPrinciple_03;

public class Course {
	/**
	 * 这样写的话，如果要改其中一种课程，那么就需要改整个方法，可能会对其他课程影响
	 * 所以需要解耦
	 * @param courseName
	 */
	public void study(String courseName) {
		if("直播课".equals(courseName)) {
			System.out.println("不能快进快退");
		}else {
			System.out.println("可以快进快退来回播放");
		}
	}
	
}
