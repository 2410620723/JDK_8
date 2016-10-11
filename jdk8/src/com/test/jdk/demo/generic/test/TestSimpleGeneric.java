package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.SimpleGeneric;

/**
 * 基于不同类型参数的泛型类型是不同的
 * 对特定版本的泛型类型的引用和同一泛型的其他版本不是类型兼容的，这是泛型类型安全性所决定的。
 * @author zxm
 *
 */
public class TestSimpleGeneric {
	public static void main(String[] args) {
		SimpleGeneric<Integer> isg = new SimpleGeneric<Integer>(100);
		isg.showType();
		int v = isg.getOb();
		System.out.println("value:"+v);
		
		SimpleGeneric<String> ssg = new SimpleGeneric<String>("test generic");
		ssg.showType();
		String str = ssg.getOb();
		System.out.println("value:"+str);
		
//		ssg = isg;//编译型错误:Type mismatch: cannot convert from SimpleGeneric<Integer> to SimpleGeneric<String>
	}
}
