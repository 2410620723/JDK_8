package com.test.jdk.demo.io;

import java.io.PrintWriter;

/**
 * ����PrintWrite��
 * PrintWrite���ǻ����ַ����࣬Ϊ����̨���ʹ�û����ַ�����������ʹ������ʻ�������
 * @author zxm
 *
 */
public class TestPrintWrite {
	public static void main(String[] args) {
		//�ڶ������������Ƿ�ˢ������Ϊtrue��ʾ�Զ�ˢ����
		PrintWriter pw = new PrintWriter(System.out,true);
		pw.println("this is test PrintWrite");
		int i = -7;
		pw.println(i);
		double d = 2.1e-6;
		pw.println(d);
	}
}
