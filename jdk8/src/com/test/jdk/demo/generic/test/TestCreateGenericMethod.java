package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.CreateGenericMethod;

public class TestCreateGenericMethod {
	public static void main(String[] args) {
		Integer[] y ={1,2,3,4};
		CreateGenericMethod cg = new CreateGenericMethod();
		if(cg.isIn(2, y))
			System.out.println("2 is in y");
		String[] str = {"one","two","three"};
		if(cg.isIn("two", str))
			System.out.println("two is in str");
//		if(cg.isIn("two", y))//泛型类型不匹配
//			System.out.println("two is in y");
	}
}
