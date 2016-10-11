package com.test.jdk.demo.annotation.test;

import java.lang.reflect.Method;

import com.test.jdk.demo.annotation.demo.MyMarker;

public class TestMyMarker {
	@MyMarker
	public static void myMethod(){
		try {
			Method method = TestMyMarker.class.getMethod("myMethod");
			if(method.isAnnotationPresent(MyMarker.class)){
				System.out.println("MyMarker is present");
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		myMethod();
	}
}
