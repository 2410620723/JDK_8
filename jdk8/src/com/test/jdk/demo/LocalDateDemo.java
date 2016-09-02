package com.test.jdk.demo;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate:" + localDate);
		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		System.out.println("year:" + year + "\nmonth:" + month + "\nday:" + day);
		LocalDate today = LocalDate.of(2016, 8, 26);
		System.out.println("today:" + today);
		System.out.println("判断两个日期是否相等:" + today.equals(localDate));
		
		/*
		 * 检查重复事件，比如生日
		 */
		LocalDate dateOfBirth = LocalDate.of(1992, 03, 11);
		MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
		MonthDay current = MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());
		if(birthday.equals(current)){
			System.out.println("today is your birthday.");
		}else{
			System.out.println("today is not your birthday");
		}
		LocalDate aWeekLatter = localDate.plus(1, ChronoUnit.WEEKS);
		System.out.println("一周后的日期:" + aWeekLatter);
		LocalDate aYearbefore = localDate.minus(1, ChronoUnit.YEARS);
		System.out.println("一年前的日期:" + aYearbefore);
		System.out.println("一周后的日期是否在今天之后:" + aWeekLatter.isAfter(localDate));
		System.out.println("一周后的日期是否在今天前:" + aWeekLatter.isBefore(localDate));
		
		//检查是否是闰年
		System.out.printf("%s年是否是闰年：%s%n",localDate,localDate.isLeapYear());
		
		//两日期之间的时间差
		Period betweenDay = Period.between(dateOfBirth, localDate);
		System.out.printf("%s与%s时间差%d年%n",localDate,dateOfBirth,betweenDay.getYears());
		
	}
}
