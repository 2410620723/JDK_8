package com.test.jdk.demo.generic.demo;
/**
 * 泛型化接口
 * @author zxm
 *
 */
public interface InterfaceGeneric<T extends Comparable<T>> {
	public T min();
	public T max();
}
