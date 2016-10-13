package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.InterfaceGenericImpl;

public class TestInterfaceGenericImpl {
	public static void main(String[] args) {
		Integer[] inums = {1,2,3,4,5};
		Character[] cnums = {'a','b','c','d','e'};
		InterfaceGenericImpl<Integer> iob = new InterfaceGenericImpl<Integer>(inums);
		InterfaceGenericImpl<Character> cob = new InterfaceGenericImpl<Character>(cnums);
		Integer max = iob.max();
		Character min = cob.min();
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
	}
}
