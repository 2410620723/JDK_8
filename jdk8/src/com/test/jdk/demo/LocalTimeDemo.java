package com.test.jdk.demo;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime:"+localTime);
		LocalTime towHourLatter = localTime.plusHours(2);
		System.out.println("两小时后的时间:" + towHourLatter);
	}
}
