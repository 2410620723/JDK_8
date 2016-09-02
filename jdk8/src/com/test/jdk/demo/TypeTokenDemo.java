package com.test.jdk.demo;

import java.util.ArrayList;

import com.google.common.reflect.TypeToken;

/**
 * guava的反射机制
 * @author zxm
 *
 */
public class TypeTokenDemo {
	public static void main(String[] args) {
		@SuppressWarnings("serial")
		TypeToken<ArrayList<String>> typeToken = new TypeToken<ArrayList<String>>() {
		};
		TypeToken<?> genericTypeToken = typeToken.resolveType(ArrayList.class.getTypeParameters()[0]);
		System.out.println(genericTypeToken.getType());
	}
}
