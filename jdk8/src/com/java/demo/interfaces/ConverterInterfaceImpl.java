package com.java.demo.interfaces;

public class ConverterInterfaceImpl {
	public static void main(String[] args) {
		ConverterInterface<String, Integer> convert = (from) -> Integer.valueOf(from);
		Integer converted = convert.convert("123");
		System.out.println(converted);
		int num = 1;//num被隐式的当作final类型
		ConverterInterface<Integer,String> convert2 = (from) -> String.valueOf(from+num);
		//获取变量的类型
		System.out.println("convert2:"+convert2.convert(2).getClass().getSimpleName());
		
	}
}
