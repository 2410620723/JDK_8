package com.test.jdk.demo.generic.demo;
/**
 * ���ͻ��ӿ�
 * @author zxm
 *
 */
public interface InterfaceGeneric<T extends Comparable<T>> {
	public T min();
	public T max();
}
