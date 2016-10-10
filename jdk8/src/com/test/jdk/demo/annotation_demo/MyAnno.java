package com.test.jdk.demo.annotation_demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * ע��(Ԫ����)
 * ָ����������:SOURCE��CLASS��RUNTIME
 * ʹ��SOURCE�������Ե�ע�⣬ֻ��Դ�ļ��б������ڱ����ڼ�ᱻ������
 * ʹ��CLASS�������Ե�ע�⣬�ڱ���ʱ�����浽.class�ļ��У�����������ʱͨ��JVM��ȡ������Щע��
 * ʹ��RUNTIME�������Ե�ע�⣬�ڱ���ʱ�����浽.class�ļ��У�����������ʱͨ��JVM���Ի�ȡ��Щע�⡣
 * ���RUNTIME���������ṩ�����õ�ע�⡣
 * @author zxm
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
	public String str();
	public int val();
}
