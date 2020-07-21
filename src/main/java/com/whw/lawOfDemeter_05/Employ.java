package com.whw.lawOfDemeter_05;

import java.util.ArrayList;
import java.util.List;

public class Employ {

	public void checkNumber() {
		List<Course> courses = new ArrayList<Course>();
		for (int i = 0; i < 20 ; i++) {
			courses.add(new Course());
		}
		System.out.println(courses.size());
	}
	
}
