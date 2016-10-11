package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.NonGeneric;
/**
 * 没有使用泛型时，在存储数据的时候需要显示的进行类型转换
 * @author zxm
 *
 */
public class TestNonGeneric {
	public static void main(String[] args) {
		NonGeneric iob = new NonGeneric(100);
		iob.showType();
		int v = (int) iob.getOb();
		System.out.println("value:"+v);
		
		NonGeneric sob = new NonGeneric("test no generic");
		sob.showType();
		String str = (String) sob.getOb();
		System.out.println("value:"+str);
		
		iob = sob;//不是泛型的时候，会存在一些隐藏的错误，只有在运行时才会显现出来
		int value = (int) iob.getOb();//java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		System.out.println("value:"+value);
	}
}
