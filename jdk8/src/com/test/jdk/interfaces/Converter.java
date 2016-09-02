package com.test.jdk.interfaces;

/**
 * 函数式接口
 * @author zxm
 *
 * @param <F>输入参数
 * @param <T>输出参数
 */
@FunctionalInterface
public interface Converter<F,T> {
	T convert(F from);
}
