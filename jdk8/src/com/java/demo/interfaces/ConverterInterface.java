package com.java.demo.interfaces;

/**
 * 
 * @author Administrator
 *
 * @param <F>�����������
 * @param <T>�����������
 */
@FunctionalInterface
public interface ConverterInterface<F,T> {
	public T convert(F from);
}
