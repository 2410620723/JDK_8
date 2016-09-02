package com.test.jdk.demo;

import com.google.common.primitives.UnsignedInts;

public class UnsignedDemo {
	public static void main(String[] args) {
		int uints = UnsignedInts.parseUnsignedInt("4294967295");
		String maxUnsigned = UnsignedInts.toString(uints);
		System.out.println(maxUnsigned);
	}
}
