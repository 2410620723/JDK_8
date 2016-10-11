package com.test.jdk.demo.generic.test;

import com.test.jdk.demo.generic.demo.SimpleGeneric;

/**
 * ���ڲ�ͬ���Ͳ����ķ��������ǲ�ͬ��
 * ���ض��汾�ķ������͵����ú�ͬһ���͵������汾�������ͼ��ݵģ����Ƿ������Ͱ�ȫ���������ġ�
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
		
//		ssg = isg;//�����ʹ���:Type mismatch: cannot convert from SimpleGeneric<Integer> to SimpleGeneric<String>
	}
}
