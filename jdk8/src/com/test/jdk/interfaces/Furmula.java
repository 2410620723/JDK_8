package com.test.jdk.interfaces;
/**
 * �ڽӿ�Formula�У����˳��󷽷�caculate���⣬��������һ��Ĭ�Ϸ���sqrt��
 * Formula��ʵ����ֻ��Ҫʵ�ֳ��󷽷�caculate�Ϳ����ˡ�Ĭ�Ϸ���sqrt����ֱ��ʹ�á� 
 * @author zxm
 *
 */
public interface Furmula {
	double calculator(int a);
	
	//JDK8��ʼ���ӿ��п��Զ���Ĭ�Ϸ���
	default double sqrt(int a){
		return Math.sqrt(a);
	}
	//JDK8��ʼ���ӿ��п��Զ��徲̬������ʵ�ֽӿڵ�������ӽӿڲ��Ἧ�ɽӿڵľ�̬����
	static int staticMethod(){
		return 0;
	}
}
