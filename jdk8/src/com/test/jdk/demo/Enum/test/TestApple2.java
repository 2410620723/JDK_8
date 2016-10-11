package com.test.jdk.demo.Enum.test;

import com.test.jdk.demo.Enum.demo.Apple;
/**
 * ����ö�ٵ�values()��valueOf()����
 * values()����������һ������ö�ٳ����б������
 * valueOf()����������һ���봫�ݵĲ������Ӧ���ַ���
 * @author zxm
 *
 */
public class TestApple2 {
	public static void main(String[] args) {
		Apple ap = null;
		System.out.println("Here are all Apple constants");
		
		//values()����
		@SuppressWarnings("static-access")
		Apple[] allApples = ap.values();
		for(Apple a:allApples){
			System.out.println("values:" + a);
		}
		
		//valueOf()����
		ap = Apple.valueOf("Hello");
		System.out.println("valueOf:" + ap);
	}
}
