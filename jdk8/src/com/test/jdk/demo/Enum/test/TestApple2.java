package com.test.jdk.demo.Enum.test;

import com.test.jdk.demo.Enum.demo.Apple;
/**
 * 测试枚举的values()和valueOf()方法
 * values()方法，返回一个包含枚举常量列表的数组
 * valueOf()方法，返回一个与传递的参数相对应的字符串
 * @author zxm
 *
 */
public class TestApple2 {
	public static void main(String[] args) {
		Apple ap = null;
		System.out.println("Here are all Apple constants");
		
		//values()方法
		@SuppressWarnings("static-access")
		Apple[] allApples = ap.values();
		for(Apple a:allApples){
			System.out.println("values:" + a);
		}
		
		//valueOf()方法
		ap = Apple.valueOf("Hello");
		System.out.println("valueOf:" + ap);
	}
}
