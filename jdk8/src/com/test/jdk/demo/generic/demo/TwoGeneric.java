package com.test.jdk.demo.generic.demo;
/**
 * 两个参数的泛型
 * @author zxm
 *
 */
public class TwoGeneric<T,V> {
	T obj1;
	V obj2;
	public TwoGeneric(T t,V v){
		obj1 = t;
		obj2 = v;
	}
	public void showType(){
		System.out.println("Type of T is "+obj1.getClass().getName());
		System.out.println("Type of V is "+obj2.getClass().getName());
	}
	public T getObj1(){
		return obj1;
	}
	public V getObj2(){
		return obj2;
	}
}
