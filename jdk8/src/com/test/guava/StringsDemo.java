package com.test.guava;

import com.google.common.base.Strings;

/**
 * 测试guava的Strings工具类
 * @author zxm
 *
 */
public class StringsDemo {
	public static void main(String[] args) {
		String string = null;
		//判断是否null或者空字符串
		System.out.println(Strings.isNullOrEmpty(string));
		System.out.println(Strings.isNullOrEmpty(""));
		
		//将null转换成字符串
		String s = Strings.nullToEmpty(string);
		System.out.println(s.getClass().getName());
		System.out.println(Strings.nullToEmpty("zxm"));
		
		//将空字符串转换成null
		System.out.println(Strings.emptyToNull(""));
		//如果不是空字符串则返回该字符串
		System.out.println(Strings.emptyToNull("zxm"));
		
		//获取两个字符串相同的前缀、后缀
		System.out.println(Strings.commonPrefix("aac", "aa"));
		System.out.println(Strings.commonSuffix("aab", "b"));
	}
}
