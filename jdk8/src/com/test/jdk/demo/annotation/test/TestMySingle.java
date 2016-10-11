package com.test.jdk.demo.annotation.test;

import java.lang.reflect.Method;

import com.test.jdk.demo.annotation.demo.MySingle;

public class TestMySingle {
	@MySingle(100)
	public static void myMethod(){
		try {
			Method method = TestMySingle.class.getMethod("myMethod");
			MySingle single = method.getAnnotation(MySingle.class);
			System.out.println(single.value());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		myMethod();
	}
}
