package com.test.jdk.demo.Enum.test;

import com.test.jdk.demo.Enum.demo.AppleConstructor;

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
