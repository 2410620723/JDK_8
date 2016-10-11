package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.BoundedGeneric;

public class TestBoundedGeneric {
	public static void main(String[] args) {
		Integer[] inums = {1,2,3,4,5};
		BoundedGeneric<Integer> iob = new BoundedGeneric<Integer>(inums);
		double v1 = iob.average();
		System.out.println("iob average is "+v1);
		
		Double[] dnums = {1.1,2.2,3.3,4.4,5.5};
		BoundedGeneric<Double> dio = new BoundedGeneric<Double>(dnums);
		double v2 = dio.average();
		System.out.println("dio average is "+v2);
		
//		String[] snums = {"6","7","8","9","10"};//String不是Number的子类
//		BoundedGeneric<String> sio = new BoundedGeneric<String>(snums);//Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type BoundedGeneric<T>
	}
}
