package com.test.jdk.demo.generic.demo;
/**
 * �ڷǷ������д������ͷ���
 * ���Ͳ����ڷ�������ֵ֮ǰ��������Σ�T��չ��Comparable<T>�ӿڣ�����isIn()����ֻ�����ڿɱ��ȽϵĶ����С�
 * Comparable<T>�Ƿ��ͽӿ�
 * TΪ����V�������Ͻ磬���V����ΪT��T�����ࡣ
 * ���ͷ����ȿ����Ǿ�̬��Ҳ�����ǷǾ�̬�ġ�
 * @author zxm
 *
 */
public class CreateGenericMethod {
	public <T extends Comparable<T>,V extends T> boolean isIn(T x,V[] y){
		for(int i=0;i<y.length;i++){
			if(x.equals(y[i]))
				return true;
		}
		return false;
	}
}
