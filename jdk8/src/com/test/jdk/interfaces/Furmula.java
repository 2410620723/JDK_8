package com.test.jdk.interfaces;
/**
 * �ڽӿ�Formula�У����˳��󷽷�caculate���⣬��������һ��Ĭ�Ϸ���sqrt��
 * Formula��ʵ����ֻ��Ҫʵ�ֳ��󷽷�caculate�Ϳ����ˡ�Ĭ�Ϸ���sqrt����ֱ��ʹ�á� 
 * @author zxm
 *
 */
public interface Furmula {
	double calculator(int a);
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
}
