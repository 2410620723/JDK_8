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
		System.out.println("�ж����������Ƿ����:" + today.equals(localDate));
		
		/*
		 * ����ظ��¼�����������
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
		System.out.println("һ�ܺ������:" + aWeekLatter);
		LocalDate aYearbefore = localDate.minus(1, ChronoUnit.YEARS);
		System.out.println("һ��ǰ������:" + aYearbefore);
		System.out.println("һ�ܺ�������Ƿ��ڽ���֮��:" + aWeekLatter.isAfter(localDate));
		System.out.println("һ�ܺ�������Ƿ��ڽ���ǰ:" + aWeekLatter.isBefore(localDate));
		
		//����Ƿ�������
		System.out.printf("%s���Ƿ������꣺%s%n",localDate,localDate.isLeapYear());
		
		//������֮���ʱ���
		Period betweenDay = Period.between(dateOfBirth, localDate);
		System.out.printf("%s��%sʱ���%d��%n",localDate,dateOfBirth,betweenDay.getYears());
		
	}
}
