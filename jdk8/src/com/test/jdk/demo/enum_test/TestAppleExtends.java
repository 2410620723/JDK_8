package com.test.jdk.demo.enum_test;

import com.test.jdk.demo.enum_demo.AppleExtends;

public class TestAppleExtends {
	public static void main(String[] args) {
		AppleExtends ap1 = null,ap2 = null,ap3 = null;
		
		//����ordinal()���������س���������ֵ������ֵ��0��ʼ
		for(AppleExtends a : AppleExtends.values()){
			System.out.println(a + "�����Ϊ:" + a.ordinal());
		}
		
		ap1 = AppleExtends.Hello;
		ap2 = AppleExtends.World;
		ap3 = AppleExtends.Hello;
		
		//compareTo()�������Ƚ�����ö�ٳ���������ֵ��С
		if(ap1.compareTo(ap2)<0){
			System.out.println(ap1+" before "+ap2);
		}
		
		//equals()�������Ƚ�ö�ٳ������������������ԣ�ֻ�е�������������ͬһö���е���ͬ����ʱ�����ǲŻ����
		if(ap1.equals(ap2)){
			System.out.println(ap1+" equals "+ap2);
		}
		
		//ʹ��==���Ƚ�����ö�����õ������
		if(ap1==ap3){
			System.out.println(ap1+" == "+ap3);
		}
		
	}
}
