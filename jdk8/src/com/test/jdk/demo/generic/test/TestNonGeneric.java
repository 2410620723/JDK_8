package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.NonGeneric;
/**
 * û��ʹ�÷���ʱ���ڴ洢���ݵ�ʱ����Ҫ��ʾ�Ľ�������ת��
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
		
		iob = sob;//���Ƿ��͵�ʱ�򣬻����һЩ���صĴ���ֻ��������ʱ�Ż����ֳ���
		int value = (int) iob.getOb();//java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		System.out.println("value:"+value);
	}
}
