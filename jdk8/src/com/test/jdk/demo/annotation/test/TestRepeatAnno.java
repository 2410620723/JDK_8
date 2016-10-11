package com.test.jdk.demo.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.test.jdk.demo.annotation.demo.MyRepeatAnno;
import com.test.jdk.demo.annotation.demo.RepeatAnno;

public class TestRepeatAnno {
	@RepeatAnno(str="First annotation",val=-1)
	@RepeatAnno(str="Second annotation",val=100)
	public static void myMethod(String str,int i){
		try {
			Method method = TestRepeatAnno.class.getMethod("myMethod", String.class,int.class);
			Annotation anno = method.getAnnotation(MyRepeatAnno.class);
			System.out.println(anno);
			
			//使用getAnnotationsByType()方法来获取与myMethod关联的所有RepeatAnno实例
			Annotation[] annos = method.getAnnotationsByType(RepeatAnno.class);
			for(Annotation a : annos){
				System.out.println(a);
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		myMethod("test",10);
	}
}
