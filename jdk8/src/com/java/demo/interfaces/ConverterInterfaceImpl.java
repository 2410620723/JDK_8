package com.java.demo.interfaces;

public class ConverterInterfaceImpl {
	public static void main(String[] args) {
		ConverterInterface<String, Integer> convert = (from) -> Integer.valueOf(from);
		Integer converted = convert.convert("123");
		System.out.println(converted);
		int num = 1;//num����ʽ�ĵ���final����
		ConverterInterface<Integer,String> convert2 = (from) -> String.valueOf(from+num);
		//��ȡ����������
		System.out.println("convert2:"+convert2.convert(2).getClass().getSimpleName());
		
	}
}
