package com.test.guava;

import org.apache.commons.lang3.StringUtils;

/**
 * ����StringUtil����
 * @author zxm
 *
 */
public class StringUtilDemo {
	public static void main(String[] args) {
		System.out.println(StringUtils.isEmpty(null));
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isNotBlank(null));
		System.out.println(StringUtils.isBlank("\n\r\t"));//�հ׷�
		System.out.println(StringUtils.isNotEmpty("\n\r\t"));
		System.out.println(StringUtils.trim(" hello  "));
		System.out.println(StringUtils.trim("he llo "));
		System.out.println(StringUtils.trimToNull(" "));//ȥ����β�ո������ǿ��ַ������򷵻�null
		System.out.println(StringUtils.trimToNull(" \t\n"));
		System.out.println(StringUtils.trimToNull("hello"));//ȥ����β�ո��������ǿ��ַ������򷵻ظ��ַ���
		System.out.println(StringUtils.trimToEmpty(null));//ȥ����β�ո�������null���򷵻ؿ��ַ���
		System.out.println(StringUtils.trimToEmpty(" null"));
		System.out.println(StringUtils.strip("/b\t\r"));//ȥ���ַ�����β�հ׷�
		System.out.println(StringUtils.strip("Hello", "o"));//ȥ�����˵�"o"�ַ�,����ڶ�������Ϊnull����ַ��򷵻�strip(str)
		System.out.println(StringUtils.strip(null, "o"));//�����һ������Ϊ���ַ�����null���򷵻ر���
	}
}
