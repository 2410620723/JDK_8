package com.test.jdk.demo;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime:"+localTime);
		LocalTime towHourLatter = localTime.plusHours(2);
		System.out.println("��Сʱ���ʱ��:" + towHourLatter);
	}
}
