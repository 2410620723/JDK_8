package com.test.jdk.demo.other;

import java.util.Date;
import java.util.HashMap;

import com.test.jdk.demo.other.InnerClass.Inner;

public class TestInnerClass extends Date {
	public static void main(String[] args) {
		InnerClass outer = new InnerClass();
//		InnerClass.Inner inner = outer.new Inner();
		Inner inner = new Inner();
		inner.showA();
		new TestInnerClass().test();
		Integer i3 = 128,i4 = 128,i1 = 100,i2 = 100;HashMap<K, V>
		System.out.println(i3==i4);
		System.out.println(i1==i2);
	}
	public void test(){
		System.out.println(super.getClass().getName());
		System.out.println(super.getClass().getSuperclass().getName());
	}
}
