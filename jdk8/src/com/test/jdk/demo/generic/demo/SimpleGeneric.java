package com.test.jdk.demo.generic.demo;
/**
 * һ���򵥵ķ�����
 * @author zxm
 *
 * @param <T>���ݹ��������Ͳ����������������ͣ������ǻ������͡�
 */
public class SimpleGeneric<T> {
	T ob;
	public SimpleGeneric(T o){
		ob = o;
	}
	public T getOb(){
		return ob;
	}
	public void showType(){
		System.out.println("Type of T is "+ob.getClass().getName());
	}
}
