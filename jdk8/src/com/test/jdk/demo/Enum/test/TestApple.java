package com.test.jdk.demo.Enum.test;

import com.test.jdk.demo.Enum.demo.Apple;

public class TestApple {
	public static void main(String[] args) {
		Apple ap = Apple.World;
		if(ap==Apple.Hello){
			System.out.println("ap��Apple.Hello��ͬ");
		}
		/*
		 * case�����ʹ�õĳ�����ö�����ͣ�������switch���ʽʹ�õ�ö��������ͬ
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
