package com.whw.liskovSubstitutionPrinciple_06.methodParam;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		Child base = new Child();
		base.method(new HashMap());
		
	}

}
