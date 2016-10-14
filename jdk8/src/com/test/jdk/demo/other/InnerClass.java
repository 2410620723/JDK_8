package com.test.jdk.demo.other;

public class InnerClass {
	static int a = 10;
	static class Inner{
		public void showA(){
			System.out.println(a);
		}
	}
}
