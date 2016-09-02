package com.test.jdk.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * ���ڸ�ʽ��
 * @author zxm
 *
 */
public class DateTimeFormatter {
	public static void main(String[] args) {
		//���ַ�������ת�������ڣ�ʹ��Ԥ���ʽ
		String dateString = "20160829";
		LocalDate formatted1 = LocalDate.parse(dateString, java.time.format.DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(formatted1);
		
		//���ַ�������ת�������ڣ��Զ����ʽ
		String DateString2 = "08 29 2016";
		LocalDate formatted2 = LocalDate.parse(DateString2, java.time.format.DateTimeFormatter.ofPattern("MM dd yyyy"));
		System.out.println("formatted2:"+formatted2);
		
		
		//������ת�����ַ���
		LocalDateTime arrivalTime = LocalDateTime.now();
		String formattedTime = arrivalTime.format(java.time.format.DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss a"));
		System.out.println("formattedTime:"+formattedTime);
	}
}
