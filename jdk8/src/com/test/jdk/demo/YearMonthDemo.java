package com.test.jdk.demo;

import java.time.Month;
import java.time.YearMonth;

public class YearMonthDemo {
	public static void main(String[] args) {
		YearMonth currentYearMonth = YearMonth.now();
		YearMonth InputYearMonth = YearMonth.of(2018, Month.FEBRUARY);
		System.out.printf("����µ�����%s��%d��%n",currentYearMonth,currentYearMonth.lengthOfMonth());
		System.out.printf("�����������%s",InputYearMonth);
	}
}
