package com.test.jdk.demo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		ZoneId zone = ZoneId.of(ZoneId.SHORT_IDS.get("ACT"));
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zone);
		System.out.println("ACT:" + zonedDateTime);
	}
}
