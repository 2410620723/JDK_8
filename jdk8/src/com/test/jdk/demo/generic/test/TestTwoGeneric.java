package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.TwoGeneric;

public class TestTwoGeneric {
	public static void main(String[] args) {
		TwoGeneric<Integer, String> obj = new TwoGeneric<Integer, String>(100, "obj");
		obj.showType();
		int v1 = obj.getObj1();
		String v2 = obj.getObj2();
		System.out.println("value1:"+v1);
		System.out.println("value2:"+v2);
	}
}
