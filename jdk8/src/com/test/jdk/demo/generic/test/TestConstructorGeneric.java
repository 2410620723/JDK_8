package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.ConstructorGeneric;

public class TestConstructorGeneric {
	public static void main(String[] args) {
		ConstructorGeneric val1 = new ConstructorGeneric(10);
		ConstructorGeneric val2 = new ConstructorGeneric(10.2);
		ConstructorGeneric val3 = new ConstructorGeneric(10.2F);
		val1.showValue();
		val2.showValue();
		val3.showValue();
	}

}
