package com.test.jdk.demo.enum_test;

import com.test.jdk.demo.enum_demo.AppleConstructor;

public class TestAppleConstructor {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		AppleConstructor ap = null;
		System.out.println("Hello costs " + ap.Hello.getPrice());
		
		System.out.println("all Apple price:");
		for(AppleConstructor a : ap.values()){
			System.out.println(a + " costs " + a.getPrice());
		}
	}
}
