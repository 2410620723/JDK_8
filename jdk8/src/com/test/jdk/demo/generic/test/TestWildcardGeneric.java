package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.WildcardGeneric;

public class TestWildcardGeneric {
	public static void main(String[] args) {
		Integer[] inums = {1,2,3,4,5};
		WildcardGeneric<Integer> iob = new WildcardGeneric<Integer>(inums);
		double v1 = iob.average();
		System.out.println("iob average is "+v1);
		
		Double[] dnums = {1.1,2.2,3.3,4.4,5.5};
		WildcardGeneric<Double> dio = new WildcardGeneric<Double>(dnums);
		double v2 = dio.average();
		System.out.println("dio average is "+v2);
		
		boolean flag = dio.sameAve(iob);
		System.out.println("iob”Îdobœ‡µ»?"+flag);
	}
}
