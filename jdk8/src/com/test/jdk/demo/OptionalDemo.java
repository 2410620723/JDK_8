package com.test.jdk.demo;

import com.google.common.base.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		Optional<Integer> possible = Optional.of(5);
		
		//�ж��Ƿ�Ϊnull
		System.out.println(possible.isPresent());
		System.out.println(possible.get());
	}
}
