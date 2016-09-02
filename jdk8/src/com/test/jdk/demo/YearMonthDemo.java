package com.test.jdk.demo;

import java.time.Month;
import java.time.YearMonth;

public class YearMonthDemo {
	public static void main(String[] args) {
		YearMonth currentYearMonth = YearMonth.now();
		YearMonth InputYearMonth = YearMonth.of(2018, Month.FEBRUARY);
		System.out.printf("这个月的年月%s有%d天%n",currentYearMonth,currentYearMonth.lengthOfMonth());
		System.out.printf("输入的年月是%s",InputYearMonth);
	}
}
