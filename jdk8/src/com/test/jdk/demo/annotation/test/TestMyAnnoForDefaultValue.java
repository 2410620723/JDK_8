package com.test.jdk.demo.annotation.test;

import java.lang.reflect.Method;

import com.test.jdk.demo.annotation.demo.MyAnnoForDefaultValue;

public class TestMyAnnoForDefaultValue {
	@MyAnnoForDefaultValue
	public static void myMethod(){
		try {
			Method method = TestMyAnnoForDefaultValue.class.getMethod("myMethod");
			MyAnnoForDefaultValue anno = method.getAnnotation(MyAnnoForDefaultValue.class);
			System.out.println(anno.str()+" "+anno.val());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		myMethod();
	}
}
