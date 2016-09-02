package com.test.jdk.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 日期格式化
 * @author zxm
 *
 */
public class DateTimeFormatter {
	public static void main(String[] args) {
		//将字符串日期转换成日期，使用预设格式
		String dateString = "20160829";
		LocalDate formatted1 = LocalDate.parse(dateString, java.time.format.DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(formatted1);
		
		//将字符串日期转换成日期，自定义格式
		String DateString2 = "08 29 2016";
		LocalDate formatted2 = LocalDate.parse(DateString2, java.time.format.DateTimeFormatter.ofPattern("MM dd yyyy"));
		System.out.println("formatted2:"+formatted2);
		
		
		//将日期转换成字符串
		LocalDateTime arrivalTime = LocalDateTime.now();
		String formattedTime = arrivalTime.format(java.time.format.DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss a"));
		System.out.println("formattedTime:"+formattedTime);
	}
}
