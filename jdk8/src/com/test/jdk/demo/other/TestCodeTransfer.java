package com.test.jdk.demo.other;

import java.io.UnsupportedEncodingException;

public class TestCodeTransfer {
	public static void main(String[] args) {
		String str = "this is a strings ¹þ¹þ";
		try {
			String gbk = new String(str.getBytes("GBK"));
			System.out.println("gbk:"+gbk);
			String unicode = new String(gbk.getBytes());
			System.out.println("unicode:"+unicode);
			String utf8 = new String(unicode.getBytes("UTF-8"));
			System.out.println("utf8:"+utf8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
