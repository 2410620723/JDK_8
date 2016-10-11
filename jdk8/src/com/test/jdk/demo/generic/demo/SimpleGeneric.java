package com.test.jdk.demo.generic.demo;
/**
 * 一个简单的泛型类
 * @author zxm
 *
 * @param <T>传递过来的类型参数必须是引用类型，不能是基本类型。
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
