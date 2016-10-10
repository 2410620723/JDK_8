package com.test.jdk.demo.enum_test;

import com.test.jdk.demo.enum_demo.AppleExtends;

public class TestAppleExtends {
	public static void main(String[] args) {
		AppleExtends ap1 = null,ap2 = null,ap3 = null;
		
		//测试ordinal()方法，返回常量的序数值，序数值从0开始
		for(AppleExtends a : AppleExtends.values()){
			System.out.println(a + "的序号为:" + a.ordinal());
		}
		
		ap1 = AppleExtends.Hello;
		ap2 = AppleExtends.World;
		ap3 = AppleExtends.Hello;
		
		//compareTo()方法，比较两个枚举常量的序数值大小
		if(ap1.compareTo(ap2)<0){
			System.out.println(ap1+" before "+ap2);
		}
		
		//equals()方法，比较枚举常量和其他对象的相等性，只有当两个对象引用同一枚举中的相同常量时，它们才会相等
		if(ap1.equals(ap2)){
			System.out.println(ap1+" equals "+ap2);
		}
		
		//使用==来比较两个枚举引用的相等性
		if(ap1==ap3){
			System.out.println(ap1+" == "+ap3);
		}
		
	}
}
