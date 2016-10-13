package com.test.jdk.demo.generic.demo;
/**
 * 泛型化构造函数
 * @author zxm
 *
 */
public class ConstructorGeneric {
	private double val;
	public <T extends Number> ConstructorGeneric(T v){
		val = v.doubleValue();
	}
	public void showValue(){
		System.out.println("val:"+val);
	}
}
