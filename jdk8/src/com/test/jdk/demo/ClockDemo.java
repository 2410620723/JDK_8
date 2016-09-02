package com.test.jdk.demo;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

public class ClockDemo {
	public static void main(String[] args) {
		Clock clock = Clock.systemDefaultZone();
		System.out.println("zone:"+clock);
		long millis = clock.millis();
		System.out.println("millis:" + millis);
		Instant instant = clock.instant();
		Date date = Date.from(instant);
		System.out.println("date:" + date);
		Date date1 = new Date();
		System.out.println("date1:" + date1);
	}
}
