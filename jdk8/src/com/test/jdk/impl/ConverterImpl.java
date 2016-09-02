package com.test.jdk.impl;

import com.test.jdk.interfaces.Converter;

public class ConverterImpl {
	public static void main(String[] args) {
		Converter<String, Integer> converter = Integer::valueOf;
		System.out.println(converter.convert("1234"));
	}
}
