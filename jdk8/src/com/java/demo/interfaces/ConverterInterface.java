package com.java.demo.interfaces;

/**
 * 
 * @author Administrator
 *
 * @param <F>输入参数类型
 * @param <T>输出参数类型
 */
@FunctionalInterface
public interface ConverterInterface<F,T> {
	public T convert(F from);
}
