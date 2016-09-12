package com.test.guava;

import com.google.common.base.Strings;

/**
 * ����guava��Strings������
 * @author zxm
 *
 */
public class StringsDemo {
	public static void main(String[] args) {
		String string = null;
		//�ж��Ƿ�null���߿��ַ���
		System.out.println(Strings.isNullOrEmpty(string));
		System.out.println(Strings.isNullOrEmpty(""));
		
		//��nullת�����ַ���
		String s = Strings.nullToEmpty(string);
		System.out.println(s.getClass().getName());
		System.out.println(Strings.nullToEmpty("zxm"));
		
		//�����ַ���ת����null
		System.out.println(Strings.emptyToNull(""));
		//������ǿ��ַ����򷵻ظ��ַ���
		System.out.println(Strings.emptyToNull("zxm"));
		
		//��ȡ�����ַ�����ͬ��ǰ׺����׺
		System.out.println(Strings.commonPrefix("aac", "aa"));
		System.out.println(Strings.commonSuffix("aab", "b"));
	}
}
