package com.test.jdk.interfaces;

/**
 * ����ʽ�ӿ�
 * @author zxm
 *
 * @param <F>�������
 * @param <T>�������
 */
@FunctionalInterface
public interface Converter<F,T> {
	T convert(F from);
}
