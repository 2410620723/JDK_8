package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.BasicClass;
import com.test.jdk.demo.generic.demo.BoundedWildcardGeneric;
import com.test.jdk.demo.generic.demo.ThreeDimensional;

public class TestBoundedWildcardGeneric {
	public static void main(String[] args) {
		BasicClass[] base = {new BasicClass(10, 10),new BasicClass(20, 20)};
		ThreeDimensional[] threeD = {new ThreeDimensional(10, 10, 10),new ThreeDimensional(20, 20, 20)};
		BoundedWildcardGeneric<BasicClass> baseGeneric = new BoundedWildcardGeneric<BasicClass>(base);
		BoundedWildcardGeneric<ThreeDimensional> threeGeneric = new BoundedWildcardGeneric<ThreeDimensional>(threeD);
		baseGeneric.showXY(baseGeneric);
		System.out.println();
		threeGeneric.showXY(baseGeneric);
		threeGeneric.showXYZ(threeGeneric);
		
	}
}
