package com.whw.liskovSubstitutionPrinciple_06.methodParam;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base{

	@Override
	public void method(HashMap hashMap) {
		// TODO Auto-generated method stub
		super.method(hashMap);
	}

	public void method(Map map) {
		System.out.println("子类");
	}
}
