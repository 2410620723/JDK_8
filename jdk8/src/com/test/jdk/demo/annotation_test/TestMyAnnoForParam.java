package com.test.jdk.demo.annotation_test;

import java.lang.reflect.Method;

import com.test.jdk.demo.annotation_demo.MyAnno;

public class TestMyAnnoForParam {
	@MyAnno(str="two paramter",val=10)
	public static void myMethod(String str,int i){
		Class<?> c = TestMyAnnoForParam.class;
		try {
			Method method = c.getMethod("myMethod", String.class,int.class);
			MyAnno anno = method.getAnnotation(MyAnno.class);
			System.out.println(anno.str()+" "+anno.val());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		myMethod("Annotation for paramters",100);
	}
}
