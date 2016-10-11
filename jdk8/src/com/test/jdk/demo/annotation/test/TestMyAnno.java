package com.test.jdk.demo.annotation.test;

import java.lang.reflect.Method;

import com.test.jdk.demo.annotation.demo.MyAnno;

public class TestMyAnno {
	@MyAnno(str="Annotation Example",val=10)
	public static void myMethod(){
		TestMyAnno anno = new TestMyAnno();
		Class<?> c = anno.getClass();
		try {
			Method method = c.getMethod("myMethod");
			MyAnno m = method.getAnnotation(MyAnno.class);
			System.out.println(m.str()+" "+m.val());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		myMethod();
	}
}
