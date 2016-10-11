package com.test.jdk.demo.generic.demo;
/**
 * �н����ͷ���
 * ��ָ�����Ͳ����ǣ�������������ޣ����е����Ͳ��������������Գ���
 * ʹ��extends�־�
 * @author zxm
 *
 * @param <T>
 */
public class BoundedGeneric<T extends Number> {
	T[] nums;
	
	public BoundedGeneric(T[] o){
		nums = o;
	}
	
	public double average(){
		double sum = 0.0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
	}
}
