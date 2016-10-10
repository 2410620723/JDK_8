package com.test.jdk.demo.io;

import java.io.PrintWriter;

/**
 * 测试PrintWrite流
 * PrintWrite流是基于字符的类，为控制台输出使用基于字符的流，可以使程序国际化更容易
 * @author zxm
 *
 */
public class TestPrintWrite {
	public static void main(String[] args) {
		//第二个参数代表是否刷新流，为true表示自动刷新流
		PrintWriter pw = new PrintWriter(System.out,true);
		pw.println("this is test PrintWrite");
		int i = -7;
		pw.println(i);
		double d = 2.1e-6;
		pw.println(d);
	}
}
