package com.test.jdk.demo.enum_test;

import com.test.jdk.demo.enum_demo.AppleExtends;

public class TestAppleExtends {
	public static void main(String[] args) {
		AppleExtends ap1 = null,ap2 = null;
		for(AppleExtends a : AppleExtends.values()){
			System.out.println(a + "µÄÐòºÅÎª:" + a.ordinal());
		}
	}
}
