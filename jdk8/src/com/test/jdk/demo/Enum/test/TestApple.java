package com.test.jdk.demo.Enum.test;

import com.test.jdk.demo.Enum.demo.Apple;

public class TestApple {
	public static void main(String[] args) {
		Apple ap = Apple.World;
		if(ap==Apple.Hello){
			System.out.println("ap与Apple.Hello相同");
		}
		/*
		 * case语句中使用的常量的枚举类型，必须与switch表达式使用的枚举类型相同
		 */
		switch (ap) {
		case Hello:
			System.out.println("Hello");
			break;
			
		case World:
			System.out.println("World");
			break;
		default:
			break;
		}
	}
}
