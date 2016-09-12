package com.test.guava;

import org.apache.commons.lang3.StringUtils;

/**
 * 测试StringUtil工具
 * @author zxm
 *
 */
public class StringUtilDemo {
	public static void main(String[] args) {
		System.out.println(StringUtils.isEmpty(null));
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isNotBlank(null));
		System.out.println(StringUtils.isBlank("\n\r\t"));//空白符
		System.out.println(StringUtils.isNotEmpty("\n\r\t"));
		System.out.println(StringUtils.trim(" hello  "));
		System.out.println(StringUtils.trim("he llo "));
		System.out.println(StringUtils.trimToNull(" "));//去掉首尾空格后，如果是空字符串，则返回null
		System.out.println(StringUtils.trimToNull(" \t\n"));
		System.out.println(StringUtils.trimToNull("hello"));//去掉首尾空格后，如果不是空字符串，则返回该字符串
		System.out.println(StringUtils.trimToEmpty(null));//去掉首尾空格后，如果是null，则返回空字符串
		System.out.println(StringUtils.trimToEmpty(" null"));
		System.out.println(StringUtils.strip("/b\t\r"));//去掉字符串首尾空白符
		System.out.println(StringUtils.strip("Hello", "o"));//去掉两端的"o"字符,如果第二个参数为null或空字符则返回strip(str)
		System.out.println(StringUtils.strip(null, "o"));//如果第一个参数为空字符串或null，则返回本身
	}
}
