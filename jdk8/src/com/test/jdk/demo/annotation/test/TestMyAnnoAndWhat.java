package com.test.jdk.demo.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.test.jdk.demo.annotation.demo.MyAnno;
import com.test.jdk.demo.annotation.demo.What;

@MyAnno(str="An Annotation",val=12)
@What(description="An Annotation class")
public class TestMyAnnoAndWhat {
	
	@MyAnno(str="Testing",val=12)
	@What(description="An Annotation method")
	public static void myMethod(){
		TestMyAnnoAndWhat anno = new TestMyAnnoAndWhat();
		Annotation[] annotations = anno.getClass().getAnnotations();
		System.out.println("All annotations for class:");
		for(Annotation a : annotations){
			System.out.println(a);
		}
		System.out.println("");
		
		try {
			Method method = anno.getClass().getMethod("myMethod");
			annotations = method.getAnnotations();
			System.out.println("All annotations for method:");
			for(Annotation a : annotations){
				System.out.println(a);
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		myMethod();
	}
}
