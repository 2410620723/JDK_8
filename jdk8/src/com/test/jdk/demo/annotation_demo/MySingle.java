package com.test.jdk.demo.annotation_demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * <p>����Աע�⣺ֻ����һ����Ա</p>
 * <p>���ֻ��һ����Ա��ʹ��ע���ʱ�򣬾Ϳ��Լ򵥵�Ϊ�ó�Աָ��ֵ��������Ҫָ����Ա�����ƣ�
 * ����Ϊ��ʹ��������д��ʽ����Ա���Ʊ���Ϊvalue��</p>
 * 
 * @author zxm
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
	public int value();
}
