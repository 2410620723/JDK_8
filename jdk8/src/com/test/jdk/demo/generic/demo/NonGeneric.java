package com.test.jdk.demo.generic.demo;
/**
 * ����û��ʹ�÷��͵���
 * @author zxm
 *
 */
public class NonGeneric {
	Object ob;
	public NonGeneric(Object o){
		ob = o;
	}
	public Object getOb(){
		return ob;
	}
	public void showType(){
		System.out.println("Type of ob is "+ob.getClass().getName());
	}
}
